/**
 * 
 */
package pkp.ltd.delivery_system.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import pkp.ltd.delivery_system.Response;
import pkp.ltd.delivery_system.Status;
import pkp.ltd.delivery_system.dto.entity.Product;
import pkp.ltd.delivery_system.dto.mapper.ProductMapper;
import pkp.ltd.delivery_system.jpa.entity.ProductEntity;
import pkp.ltd.delivery_system.jpa.repository.ProductRepository;

/**
 * @author pankajkumar
 *
 */

@Service
public class ProductServiceImpl implements ProductService {
	private static final Logger LOGGER= LoggerFactory.getLogger(ProductServiceImpl.class);
	
	@Autowired
	private ProductRepository productRepo;

	/* (non-Javadoc)
	 * @see pkp.ltd.delivery_system.service.ProductService#getProduct(java.lang.Integer)
	 */
	@Override
	public Response<Integer,Product> getProduct(Integer id) {
		LOGGER.info("Fetching product by id [{}] .", id);
		Response<Integer,Product> response= new Response<>();
		response.setInput(id);
		if(productRepo.existsById(id)) {
			LOGGER.info("Product found");
			response.setOutput(ProductMapper.getProduct(productRepo.findById(id).get()));
		}else {
			LOGGER.info("Product does not exists [{}]", id);
			response.getMetadata().addErrorMessage(0, "Products does not extis.", "ProductService", null);
		}
		LOGGER.info("{} found", response.getOutput());
		return response;
	}

	/* (non-Javadoc)
	 * @see pkp.ltd.delivery_system.service.ProductService#getProduct(pkp.ltd.delivery_system.dto.entity.Product)
	 */
	@Override
	public Response<Product,List<Product>> getProduct(Product product) {

		Response<Product,List<Product>> response= new Response<>();
		
		if(productRepo.count()>0) {
//			productRepo.findAll().forEach(product->{
//				
//			});
		}else {
			response.getMetadata().addMessage(0, "No Products Available", this.getClass().getSimpleName());
		}
		return response;
	}

	/* (non-Javadoc)
	 * @see pkp.ltd.delivery_system.service.ProductService#getProducts()
	 */
	@Override
	public Response<Void,List<Product>> getProducts() {

		Response<Void,List<Product>> response= new Response<>();
		List<Product> products= new ArrayList<Product>();
		productRepo.findAll().forEach(product->{
			products.add(ProductMapper.getProduct(product));
		});
		response.setOutput(products);
		return response;
	}

	/* (non-Javadoc)
	 * @see pkp.ltd.delivery_system.service.ProductService#addProduct(pkp.ltd.delivery_system.dto.entity.Product)
	 */
	@Override
	public Response<Product,Product> addProduct(Product product) {
		LOGGER.info("adding new product");
		Response<Product,Product> response= new Response<>();
		response.setInput(product);
		if(product.getId()>0) {
			response.getMetadata().addMessage(0, "Product id must be null while adding the product", 
					this.getClass().getSimpleName());
			if(productRepo.existsById(product.getId())) {
				response.getMetadata().addMessage(0, "Product id exists in system.", 
						this.getClass().getSimpleName());
			}else {
				response.getMetadata().addMessage(0, "Product id is not in system.", 
						this.getClass().getSimpleName());
			}
			response.getMetadata().addMessage(0, "No Product got created/updated.", 
					this.getClass().getSimpleName());
		}else {
			if(StringUtils.isEmpty(product.getName())) {
				LOGGER.info(" {} : product name is mandatory.", Status.VALIDATION_ERROR);
				response.getMetadata().setStatusCode(Status.VALIDATION_ERROR);
				response.getMetadata().addMessage(1, "Product Name is mandatory", this.getClass().getSimpleName());
			}else {
				ProductEntity productEntity = productRepo.save(ProductMapper.getProductEntity(product));
				response.setOutput(ProductMapper.getProduct(productEntity));
			}
		}
		LOGGER.info("Product Added!");
		return response;
	}

	/* (non-Javadoc)
	 * @see pkp.ltd.delivery_system.service.ProductService#addProducts(java.util.List)
	 */
	@Override
	public Response<List<Product>,List<Product>> addProducts(List<Product> products) {

		Response<List<Product>,List<Product>> response= new Response<>();
		
		
		return response;
	}

	/* (non-Javadoc)
	 * @see pkp.ltd.delivery_system.service.ProductService#updateProduct(pkp.ltd.delivery_system.dto.entity.Product)
	 */
	@Override
	public Response<Product,Product> updateProduct(Product product) {

		Response<Product,Product> response= new Response<>();
		return response;
	}

}
