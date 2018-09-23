package pkp.ltd.delivery_system.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the order database table.
 * 
 */
@Entity(name="order")
//@NamedQuery(name="OrderEntity.findAll", query="SELECT o FROM OrderEntity o")
public class OrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="delivery_date")
	private Date deliveryDate;

	private float discount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="order_date")
	private Date orderDate;

	private float price;

	//bi-directional many-to-one association to Customer
	@ManyToOne
	private CustomerEntity customer;

	//bi-directional many-to-one association to Payment
	@ManyToOne
	private PaymentEntity payment;

	//bi-directional many-to-one association to StatPaymentType
	@ManyToOne
	@JoinColumn(name="payment_type_entity_id")
	private StatPaymentTypeEntity statPaymentType;

	//bi-directional many-to-one association to StatSlot
	@ManyToOne
	@JoinColumn(name="delivery_slot_entity_id")
	private StatSlotEntity statSlot;

	//bi-directional many-to-one association to StatStatus
	@ManyToOne
	@JoinColumn(name="status_id")
	private StatStatusEntity statStatus;

	public OrderEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDeliveryDate() {
		return this.deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public float getDiscount() {
		return this.discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public CustomerEntity getCustomer() {
		return this.customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	public PaymentEntity getPayment() {
		return this.payment;
	}

	public void setPayment(PaymentEntity payment) {
		this.payment = payment;
	}

	public StatPaymentTypeEntity getStatPaymentType() {
		return this.statPaymentType;
	}

	public void setStatPaymentType(StatPaymentTypeEntity statPaymentType) {
		this.statPaymentType = statPaymentType;
	}

	public StatSlotEntity getStatSlot() {
		return this.statSlot;
	}

	public void setStatSlot(StatSlotEntity statSlot) {
		this.statSlot = statSlot;
	}

	public StatStatusEntity getStatStatus() {
		return this.statStatus;
	}

	public void setStatStatus(StatStatusEntity statStatus) {
		this.statStatus = statStatus;
	}

}