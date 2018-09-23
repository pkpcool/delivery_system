/**
 * 
 */
package pkp.ltd.delivery_system.service;

import java.util.List;

import pkp.ltd.delivery_system.Response;
import pkp.ltd.delivery_system.dto.entity.Product;

/**
 * @author pankajkumar
 *
 */
public interface ProductService {

	public Response<Integer,Product> getProduct(Integer id);
	
	public Response<Product,List<Product>> getProduct(Product product);
	
	public Response<Void,List<Product>> getProducts();
	
	public Response<Product,Product> addProduct(Product product);
	
	public Response<List<Product>,List<Product>> addProducts(List<Product> products);
	
	public Response<Product,Product> updateProduct(Product product);
}
