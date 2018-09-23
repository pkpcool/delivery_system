/**
 * 
 */
package pkp.ltd.delivery_system.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import pkp.ltd.delivery_system.jpa.entity.ProductInventoryEntity;

/**
 * @author pankajkumar
 *
 */
public interface ProductInventoryRepository extends CrudRepository<ProductInventoryEntity, Long> {

}
