package pkp.ltd.delivery_system.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the STAT_UNIT database table.
 * 
 */
@Entity
@Table(name="STAT_UNIT")
//@NamedQuery(name="StatUnitEntity.findAll", query="SELECT s FROM StatUnitEntity s")
public class StatUnitEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String code;

	private String desc;

//	//bi-directional many-to-one association to ProductInventory
//	@OneToMany(mappedBy="statUnit")
//	private List<ProductInventoryEntity> productInventories;

	public StatUnitEntity() {
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

//	public List<ProductInventoryEntity> getProductInventories() {
//		return this.productInventories;
//	}
//
//	public void setProductInventories(List<ProductInventoryEntity> productInventories) {
//		this.productInventories = productInventories;
//	}

//	public ProductInventoryEntity addProductInventory(ProductInventoryEntity productInventory) {
//		getProductInventories().add(productInventory);
//		productInventory.setStatUnit(this);
//
//		return productInventory;
//	}
//
//	public ProductInventoryEntity removeProductInventory(ProductInventoryEntity productInventory) {
//		getProductInventories().remove(productInventory);
//		productInventory.setStatUnit(null);
//
//		return productInventory;
//	}

}