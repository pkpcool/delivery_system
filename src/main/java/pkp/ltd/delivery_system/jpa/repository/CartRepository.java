/**
 * 
 */
package pkp.ltd.delivery_system.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import pkp.ltd.delivery_system.jpa.entity.CartEntity;

/**
 * @author pankajkumar
 *
 */
public interface CartRepository extends CrudRepository<CartEntity, Long> {

}
