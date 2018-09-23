/**
 * 
 */
package pkp.ltd.delivery_system.dto.mapper;

import org.springframework.beans.BeanUtils;

import pkp.ltd.delivery_system.dto.entity.Payment;
import pkp.ltd.delivery_system.jpa.entity.PaymentEntity;

/**
 * @author pankajkumar
 *
 */
public class PaymentMapper {

	public static Payment toDto(PaymentEntity entity) {
		Payment payment= new Payment();
		BeanUtils.copyProperties(entity, payment);
		return payment;
	}
	
	public static PaymentEntity toEntity(Payment payment) {
		PaymentEntity entity= new PaymentEntity();
		BeanUtils.copyProperties(payment, entity);
		return entity;
	}
}
