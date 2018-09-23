/**
 * 
 */
package pkp.ltd.delivery_system.service;

import pkp.ltd.delivery_system.Response;
import pkp.ltd.delivery_system.dto.entity.Customer;

/**
 * @author pankajkumar
 *
 */
public interface AddressService {

	/**
	 * 
	 * @param customer (customer with id/email-id/phone-number)
	 * @return
	 */
	public Response<Customer, Customer> getAddress(Customer customer);
	/**
	 * 
	 * @param customer (customer with id/email-id/phone-number, and addresses)
	 * @return
	 */
	public Response<Customer,Customer> addUpdateAddress(Customer customer);
	
	
}
