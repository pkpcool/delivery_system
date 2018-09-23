package pkp.ltd.delivery_system.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the customer database table.
 * 
 */
@Entity(name="customer")
//@NamedQuery(name="CustomerEntity.findAll", query="SELECT c FROM CustomerEntity c")
public class CustomerEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="email_id")
	private String emailId;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	@Column(name="middle_name")
	private String middleName;

	@Column(name="mobile_no")
	private String mobileNo;

	private String password;

	private String src;

	//bi-directional many-to-one association to Cart
	@OneToMany(mappedBy="customer")
	private List<CartEntity> carts;

	//bi-directional many-to-many association to Address
	@ManyToMany
	@JoinTable(
		name="cust_address_mapping"
		, joinColumns={
			@JoinColumn(name="cust_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="address_id")
			}
		)
	private List<AddressEntity> addresses;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="customer")
	private List<OrderEntity> orders;

	//bi-directional many-to-one association to Payment
	@OneToMany(mappedBy="customer")
	private List<PaymentEntity> payments;

	public CustomerEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSrc() {
		return this.src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public List<CartEntity> getCarts() {
		return this.carts;
	}

	public void setCarts(List<CartEntity> carts) {
		this.carts = carts;
	}

	public CartEntity addCart(CartEntity cart) {
		getCarts().add(cart);
		cart.setCustomer(this);

		return cart;
	}

	public CartEntity removeCart(CartEntity cart) {
		getCarts().remove(cart);
		cart.setCustomer(null);

		return cart;
	}

	public List<AddressEntity> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(List<AddressEntity> addresses) {
		this.addresses = addresses;
	}

	public List<OrderEntity> getOrders() {
		return this.orders;
	}

	public void setOrders(List<OrderEntity> orders) {
		this.orders = orders;
	}

	public OrderEntity addOrder(OrderEntity order) {
		getOrders().add(order);
		order.setCustomer(this);

		return order;
	}

	public OrderEntity removeOrder(OrderEntity order) {
		getOrders().remove(order);
		order.setCustomer(null);

		return order;
	}

	public List<PaymentEntity> getPayments() {
		return this.payments;
	}

	public void setPayments(List<PaymentEntity> payments) {
		this.payments = payments;
	}

	public PaymentEntity addPayment(PaymentEntity payment) {
		getPayments().add(payment);
		payment.setCustomer(this);

		return payment;
	}

	public PaymentEntity removePayment(PaymentEntity payment) {
		getPayments().remove(payment);
		payment.setCustomer(null);

		return payment;
	}

}