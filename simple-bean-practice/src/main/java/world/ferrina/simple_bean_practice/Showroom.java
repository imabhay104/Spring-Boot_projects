
package world.ferrina.simple_bean_practice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Showroom {
	
	@Autowired
    public Vehicle vehicle;
	
    public Showroom( Vehicle vehicle) {
        this.vehicle = vehicle;
    }
 
//    @Bean
//    public Vehicle getVehicle()
//    {
//        return this.vehicle;
//    }
    
    public String showfeatures()
    {
      //  System.out.println(vehicle.move());
        System.out.println(vehicle.Features());
		return vehicle.Features();

    }
}
