package pkp.ltd.delivery_system.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cart database table.
 * 
 */
@Entity(name="cart")
//@NamedQuery(name="CartEntity.findAll", query="SELECT c FROM CartEntity c")
public class CartEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int count;

	@Temporal(TemporalType.DATE)
	private Date date;

	private float discount;

	private float price;

	//bi-directional many-to-one association to Customer
	@ManyToOne
	private CustomerEntity customer;

	//bi-directional many-to-one association to ProductInventory
	@ManyToOne
	@JoinColumn(name="inventory_id")
	private ProductInventoryEntity productInventory;

	public CartEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getDiscount() {
		return this.discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
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

	public ProductInventoryEntity getProductInventory() {
		return this.productInventory;
	}

	public void setProductInventory(ProductInventoryEntity productInventory) {
		this.productInventory = productInventory;
	}

}