package pkp.ltd.delivery_system.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.List;


/**
 * The persistent class for the STAT_SLOTS database table.
 * 
 */
@Entity
@Table(name="STAT_SLOTS")
//@NamedQuery(name="StatSlotEntity.findAll", query="SELECT s FROM StatSlotEntity s")
public class StatSlotEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="end_time")
	private Time endTime;

	@Column(name="start_time")
	private Time startTime;

	//bi-directional many-to-one association to Order
//	@OneToMany(mappedBy="statSlot")
//	private List<OrderEntity> orders;

	public StatSlotEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Time getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public Time getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

//	public List<OrderEntity> getOrders() {
//		return this.orders;
//	}
//
//	public void setOrders(List<OrderEntity> orders) {
//		this.orders = orders;
//	}

//	public OrderEntity addOrder(OrderEntity order) {
//		getOrders().add(order);
//		order.setStatSlot(this);
//
//		return order;
//	}
//
//	public OrderEntity removeOrder(OrderEntity order) {
//		getOrders().remove(order);
//		order.setStatSlot(null);
//
//		return order;
//	}

}