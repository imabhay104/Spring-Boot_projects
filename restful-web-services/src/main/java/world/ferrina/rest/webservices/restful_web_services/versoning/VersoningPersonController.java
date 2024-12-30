package world.ferrina.rest.webservices.restful_web_services.versoning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersoningPersonController {

	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionOfPerson()
	{
		return new PersonV1("Abhay Shinde");
	}
	
	
	@GetMapping(path="/person/header", headers="X_API_VERSION=1")
	public PersonV1 getFirstVersionOfPerson1()
	{
		return new PersonV1("Abhay Shinde");
	}
	
	@GetMapping(path="/person/header", headers="X_API_VERSION=2")
	public PersonV1 getFirstVersionOfPerson2()
	{
		return new PersonV1("SId SONALKAr");
	}
	
}
