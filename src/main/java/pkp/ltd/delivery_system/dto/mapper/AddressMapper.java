/**
 * 
 */
package pkp.ltd.delivery_system.dto.mapper;

import org.springframework.beans.BeanUtils;

import pkp.ltd.delivery_system.dto.entity.Address;
import pkp.ltd.delivery_system.jpa.entity.AddressEntity;

/**
 * @author pankajkumar
 *
 */
public class AddressMapper {

	public static Address toDto(AddressEntity entity) {
		Address address= new Address();
		BeanUtils.copyProperties(entity, address);
		return address;
	}
	
	public static AddressEntity toEntity(Address address) {
		AddressEntity entity= new AddressEntity();
		BeanUtils.copyProperties(address, entity);
		return entity;
	}
}
