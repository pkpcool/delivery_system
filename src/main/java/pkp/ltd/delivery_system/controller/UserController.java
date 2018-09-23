/**
 * 
 */
package pkp.ltd.delivery_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pkp.ltd.delivery_system.Response;
import pkp.ltd.delivery_system.dto.entity.User;
import pkp.ltd.delivery_system.jpa.repository.StatUnitRepository;
import pkp.ltd.delivery_system.service.StaticService;

/**
 * @author pankajkumar
 *
 */
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private StaticService staticService;
	@Autowired
	private StatUnitRepository statUnitRepo;
	
	@GetMapping(path="/ping")
	public String ping() {
		System.out.println(statUnitRepo.count());
		statUnitRepo.findAll().forEach(action->{
			System.out.println(action.getId()+action.getCode()+action.getDesc());
		});
		staticService.getSlots();
		staticService.getUnits();
		return "I am Okey";
	}
	
	@PostMapping(path="/register")
	public Response<User, User> registerUser(@RequestBody User userDetails){
		return new Response<>();
	}
}
