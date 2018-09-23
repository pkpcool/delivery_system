package pkp.ltd.delivery_system.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the payment database table.
 * 
 */
@Entity(name="payment")
//@NamedQuery(name="PaymentEntity.findAll", query="SELECT p FROM PaymentEntity p")
public class PaymentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="payment_date")
	private Date paymentDate;

	private String reciept;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="payment")
	private List<OrderEntity> orders;

	//bi-directional many-to-one association to Customer
	@ManyToOne
	private CustomerEntity customer;

	//bi-directional many-to-one association to StatPaymentType
	@ManyToOne
	@JoinColumn(name="payment_type_id")
	private StatPaymentTypeEntity statPaymentType;

	//bi-directional many-to-one association to StatStatus
	@ManyToOne
	@JoinColumn(name="status_id")
	private StatStatusEntity statStatus;

	public PaymentEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getReciept() {
		return this.reciept;
	}

	public void setReciept(String reciept) {
		this.reciept = reciept;
	}

	public List<OrderEntity> getOrders() {
		return this.orders;
	}

	public void setOrders(List<OrderEntity> orders) {
		this.orders = orders;
	}

	public OrderEntity addOrder(OrderEntity order) {
		getOrders().add(order);
		order.setPayment(this);

		return order;
	}

	public OrderEntity removeOrder(OrderEntity order) {
		getOrders().remove(order);
		order.setPayment(null);

		return order;
	}

	public CustomerEntity getCustomer() {
		return this.customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	public StatPaymentTypeEntity getStatPaymentType() {
		return this.statPaymentType;
	}

	public void setStatPaymentType(StatPaymentTypeEntity statPaymentType) {
		this.statPaymentType = statPaymentType;
	}

	public StatStatusEntity getStatStatus() {
		return this.statStatus;
	}

	public void setStatStatus(StatStatusEntity statStatus) {
		this.statStatus = statStatus;
	}

}