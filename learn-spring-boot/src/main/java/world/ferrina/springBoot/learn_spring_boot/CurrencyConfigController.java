package world.ferrina.springBoot.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigController {
	
	@Autowired
	private CurrencyServiceCongiguration configuration;
	@RequestMapping("/currency")
	public CurrencyServiceCongiguration retriveAllCourses()
	{
		return configuration
			;
	}

}
