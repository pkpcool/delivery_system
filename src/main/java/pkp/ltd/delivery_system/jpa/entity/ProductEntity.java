package pkp.ltd.delivery_system.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the product database table.
 * 
 */
@Entity(name="product")
//@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class ProductEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String description;

	private String name;

	private String src;

	//bi-directional many-to-one association to ProductInventory
//	@OneToMany(mappedBy="product")
//	private List<ProductInventoryEntity> productInventories;

	public ProductEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSrc() {
		return this.src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

//	public List<ProductInventoryEntity> getProductInventories() {
//		return this.productInventories;
//	}
//
//	public void setProductInventories(List<ProductInventoryEntity> productInventories) {
//		this.productInventories = productInventories;
//	}
//
//	public ProductInventoryEntity addProductInventory(ProductInventoryEntity productInventory) {
//		getProductInventories().add(productInventory);
//		productInventory.setProduct(this);
//
//		return productInventory;
//	}
//
//	public ProductInventoryEntity removeProductInventory(ProductInventoryEntity productInventory) {
//		getProductInventories().remove(productInventory);
//		productInventory.setProduct(null);
//
//		return productInventory;
//	}

}