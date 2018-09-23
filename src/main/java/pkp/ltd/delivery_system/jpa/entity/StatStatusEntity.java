package pkp.ltd.delivery_system.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the STAT_STATUS database table.
 * 
 */
@Entity
@Table(name="STAT_STATUS")
//@NamedQuery(name="StatStatusEntity.findAll", query="SELECT s FROM StatStatusEntity s")
public class StatStatusEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String code;

	private String desc;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="statStatus")
	private List<OrderEntity> orders;

	//bi-directional many-to-one association to Payment
	@OneToMany(mappedBy="statStatus")
	private List<PaymentEntity> payments;

	public StatStatusEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<OrderEntity> getOrders() {
		return this.orders;
	}

	public void setOrders(List<OrderEntity> orders) {
		this.orders = orders;
	}

	public OrderEntity addOrder(OrderEntity order) {
		getOrders().add(order);
		order.setStatStatus(this);

		return order;
	}

	public OrderEntity removeOrder(OrderEntity order) {
		getOrders().remove(order);
		order.setStatStatus(null);

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
		payment.setStatStatus(this);

		return payment;
	}

	public PaymentEntity removePayment(PaymentEntity payment) {
		getPayments().remove(payment);
		payment.setStatStatus(null);

		return payment;
	}

}