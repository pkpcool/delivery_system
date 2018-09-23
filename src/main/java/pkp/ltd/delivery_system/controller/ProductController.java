/**
 * 
 */
package pkp.ltd.delivery_system.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pkp.ltd.delivery_system.Response;
import pkp.ltd.delivery_system.dto.entity.Product;
import pkp.ltd.delivery_system.service.ProductService;

/**
 * @author pankajkumar
 *
 */
@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping(path="/ping")
	public String ping() {
		return "I am Okey";
	}
	
	@GetMapping(path="/{id}")
	public Response<Integer,Product> getProduct(@PathVariable("id") Integer id){
		return productService.getProduct(id);
	}
	
	@GetMapping()
	public Response<Void,List<Product>> getProducts(){
		return productService.getProducts();
	}
	
	@PostMapping(path="/add",consumes = "application/json", produces = "application/json")
	public Response<Product, Product> addProduct(@RequestBody Product product){
		return productService.addProduct(product);
	}
}
