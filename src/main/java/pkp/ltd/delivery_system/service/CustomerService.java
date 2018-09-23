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
public interface CustomerService {

	/**
	 * 
	 * @param customer with id/email-id/ mobile-number
	 * @return
	 */
	Response<Customer, Customer> getCustomer(Customer customer);
	/**
	 * 
	 * @param customer with required fields
	 * @return
	 */
	Response<Customer, Customer> addCustomer(Customer customer);
}
