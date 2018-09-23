/**
 * 
 */
package pkp.ltd.delivery_system.dto.mapper;

import org.springframework.beans.BeanUtils;

import pkp.ltd.delivery_system.dto.entity.Order;
import pkp.ltd.delivery_system.jpa.entity.OrderEntity;

/**
 * @author pankajkumar
 *
 */
public class OrderMapper {

	public static Order toDto(OrderEntity entity) {
		Order order= new Order();
		BeanUtils.copyProperties(entity, order);
		return order;
	}
	
	public static OrderEntity toEntity(Order order) {
		OrderEntity entity= new OrderEntity();
		BeanUtils.copyProperties(order, entity);
		return entity;
	}
}
