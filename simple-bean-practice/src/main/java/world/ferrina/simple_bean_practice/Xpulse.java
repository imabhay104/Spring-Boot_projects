
package world.ferrina.simple_bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Xpulse extends Bike{
	public Xpulse()
	{
		
	}

//    public Xpulse(String name, long id, double speed) {
//        super("xpulse", 1, 120.7);
//    }
    
    @Override
   
    public String Features() {
        return getName()+" is in white color";
    }
}
