package pkp.ltd.delivery_system.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the product_inventory database table.
 * 
 */
@Entity
@Table(name="product_inventory")
//@NamedQuery(name="ProductInventoryEntity.findAll", query="SELECT p FROM ProductInventoryEntity p")
public class ProductInventoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String available;

	@Column(name="market_price")
	private float marketPrice;

	private float price;

	private String quantity;

	//bi-directional many-to-one association to Cart
	@OneToMany(mappedBy="productInventory")
	private List<CartEntity> carts;

	//bi-directional many-to-one association to Product
	@ManyToOne
	private ProductEntity product;

	//bi-directional many-to-one association to StatUnit
	@ManyToOne
	@JoinColumn(name="unit_id")
	private StatUnitEntity statUnit;

	public ProductInventoryEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAvailable() {
		return this.available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	public float getMarketPrice() {
		return this.marketPrice;
	}

	public void setMarketPrice(float marketPrice) {
		this.marketPrice = marketPrice;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getQuantity() {
		return this.quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public List<CartEntity> getCarts() {
		return this.carts;
	}

	public void setCarts(List<CartEntity> carts) {
		this.carts = carts;
	}

	public CartEntity addCart(CartEntity cart) {
		getCarts().add(cart);
		cart.setProductInventory(this);

		return cart;
	}

	public CartEntity removeCart(CartEntity cart) {
		getCarts().remove(cart);
		cart.setProductInventory(null);

		return cart;
	}

	public ProductEntity getProduct() {
		return this.product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}

	public StatUnitEntity getStatUnit() {
		return this.statUnit;
	}

	public void setStatUnit(StatUnitEntity statUnit) {
		this.statUnit = statUnit;
	}

}