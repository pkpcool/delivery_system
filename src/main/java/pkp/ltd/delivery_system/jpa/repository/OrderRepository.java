/**
 * 
 */
package pkp.ltd.delivery_system.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import pkp.ltd.delivery_system.jpa.entity.OrderEntity;

/**
 * @author pankajkumar
 *
 */
public interface OrderRepository extends CrudRepository<OrderEntity, Long> {

}
