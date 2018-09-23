/**
 * 
 */
package pkp.ltd.delivery_system.dto.mapper;

import org.springframework.beans.BeanUtils;

import pkp.ltd.delivery_system.dto.entity.Customer;
import pkp.ltd.delivery_system.jpa.entity.CustomerEntity;

/**
 * @author pankajkumar
 *
 */
public class CustomerMapper {

	public static Customer toDto(CustomerEntity entity) {
		Customer customer= new Customer();
		BeanUtils.copyProperties(entity, customer);
		return customer;
	}
	
	public static CustomerEntity toEntity(Customer customer) {
		CustomerEntity entity= new CustomerEntity();
		BeanUtils.copyProperties(customer, entity);
		return entity;
	}
	
}
