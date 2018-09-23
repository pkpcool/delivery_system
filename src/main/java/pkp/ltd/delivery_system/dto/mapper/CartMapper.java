/**
 * 
 */
package pkp.ltd.delivery_system.dto.mapper;

import org.springframework.beans.BeanUtils;

import pkp.ltd.delivery_system.dto.entity.Cart;
import pkp.ltd.delivery_system.jpa.entity.CartEntity;

/**
 * @author pankajkumar
 *
 */
public class CartMapper {

	public static Cart toDto(CartEntity entity) {
		Cart cart = new Cart();
		BeanUtils.copyProperties(entity, cart);
		return cart;
	}
	
	public static CartEntity toEntity(Cart cart) {
		CartEntity cartEntity= new CartEntity();
		BeanUtils.copyProperties(cart, cartEntity);
		return cartEntity;
	}
}
