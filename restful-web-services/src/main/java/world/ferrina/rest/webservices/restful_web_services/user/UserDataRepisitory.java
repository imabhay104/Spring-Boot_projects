package world.ferrina.rest.webservices.restful_web_services.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepisitory extends JpaRepository<User, Integer> {

}
