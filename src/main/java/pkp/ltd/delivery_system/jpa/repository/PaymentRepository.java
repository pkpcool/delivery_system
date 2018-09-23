/**
 * 
 */
package pkp.ltd.delivery_system.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import pkp.ltd.delivery_system.jpa.entity.PaymentEntity;

/**
 * @author pankajkumar
 *
 */
public interface PaymentRepository extends CrudRepository<PaymentEntity, Long> {

}
