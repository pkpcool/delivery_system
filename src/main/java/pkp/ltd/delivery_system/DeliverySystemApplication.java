package pkp.ltd.delivery_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"pkp.ltd.delivery_system.controller",
		"pkp.ltd.delivery_system.service"})
public class DeliverySystemApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(DeliverySystemApplication.class, args);
		
		
	}
}
