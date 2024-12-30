package world.ferrina.rest.webservices.restful_web_services.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<>();
	private static int usersCount =0;
	
		   static {
		        users.add(new User(++usersCount, "Abhay Shinde", LocalDate.of(2000, 4, 10)));
		        users.add(new User(++usersCount, "Jane Smith", LocalDate.of(1990, 3, 22)));
		        users.add(new User(++usersCount, "Michael Johnson", LocalDate.of(1998, 9, 12)));
		        users.add(new User(++usersCount, "Emily Davis", LocalDate.of(2001, 5, 10)));
		        users.add(new User(++usersCount, "William Brown", LocalDate.of(1985, 12, 2)));
		        users.add(new User(++usersCount,"Sophia Wilson", LocalDate.of(1993, 8, 25)));
		        users.add(new User(++usersCount, "James Taylor", LocalDate.of(2000, 1, 18)));
		        users.add(new User(++usersCount, "Isabella Martinez", LocalDate.of(1992, 4, 6)));
		        users.add(new User(++usersCount, "Alexander Anderson", LocalDate.of(1988, 7, 19)));
		        users.add(new User(++usersCount, "Mia Thomas", LocalDate.of(1996, 11, 30)));
		    }
		
	public List<User> findAll()
	{
		return users;
	}
	public User findById(int id)
	{
		return users.stream().filter(s->s.getId()==(id)).findFirst().orElse(null);
	}
	public void deleteById(int id)
	{
		 users.removeIf(s->s.getId()==(id));
		 
	}
	public User save(User user)
	{
		user.setId(++usersCount);
		users.add(user);
		return user;
	}
	

}
