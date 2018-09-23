/**
 * 
 */
package pkp.ltd.delivery_system.dto.mapper;

import org.springframework.beans.BeanUtils;

import pkp.ltd.delivery_system.dto.entity.Product;
import pkp.ltd.delivery_system.jpa.entity.ProductEntity;

/**
 * @author pankajkumar
 *
 */
public class ProductMapper {

	public static ProductEntity getProductEntity(Product product) {
		ProductEntity entity=new ProductEntity();
		BeanUtils.copyProperties(product, entity);;
		return entity;
	}
	
	public static Product getProduct(ProductEntity entity) {
		Product product= new Product();
		BeanUtils.copyProperties(entity, product);
		return product;
	}
	
}
