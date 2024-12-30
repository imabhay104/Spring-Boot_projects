package world.ferrina.rest.webservices.restful_web_services.user;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;

@RestController
public class UserResourceJPA {
	private UserDataRepisitory service;
	public UserResourceJPA(UserDataRepisitory service) {
		super();
		this.service = service;
	}

	@GetMapping(path = "/users")
	public List<User> retriveAllUsers() {
		return service.findAll();
	}

	@GetMapping(path = "/users/{id}")
	public EntityModel<Optional<User>> retriveUser(@PathVariable int id) {
		Optional<User> user = service.findById(id);
		if (user == null) {
			throw new UserNotFoundException("id:"+id);
		}
			EntityModel<Optional<User>> model = EntityModel.of(user);
			model.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).retriveAllUsers()).withRel("users"));
			model.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).retriveUser(id)).withSelfRel());
			return model;
	}
	
	
	@DeleteMapping(path = "/users/{id}")
	public void deleteUser(@PathVariable int id) {
		service.deleteById(id);
	}


	@PostMapping(path = "/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
		User savedUser = service.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUser.getId())
				.toUri();
		return  ResponseEntity.created(location).build();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@RequestMapping("/handle")
//	 public ResponseEntity<String> handle() {
//	   URI location = ServletUriComponentsBuilder.fromCurrentRequest()
//				.path("/{id}")
//				.buildAndExpand(Integer.valueOf(1))
//				.toUri(); ;
//	   HttpHeaders responseHeaders = new HttpHeaders();
//	   responseHeaders.setLocation(location);
//	   responseHeaders.set("MyResponseHeader", "MyValue");
//	   return new ResponseEntity<String>("Hello World", responseHeaders, HttpStatus.CREATED);
//	 }

}
