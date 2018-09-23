/**
 * 
 */
package pkp.ltd.delivery_system.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import pkp.ltd.delivery_system.jpa.entity.CustomerEntity;

/**
 * @author pankajkumar
 *
 */
public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {

}
