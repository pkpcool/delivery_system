/**
 * 
 */
package pkp.ltd.delivery_system.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import pkp.ltd.delivery_system.jpa.entity.ProductEntity;

/**
 * @author pankajkumar
 *
 */
public interface ProductRepository extends CrudRepository<ProductEntity, Integer> {

}
