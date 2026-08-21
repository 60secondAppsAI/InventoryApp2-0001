package com.InventoryApp2.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import java.util.List;
import java.sql.Timestamp;
import java.time.Year;
import jakarta.persistence.Transient;

@Entity
@Table(name="inventorys")
@Getter @Setter @NoArgsConstructor
public class Inventory {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  	@Column(name="inventory_id")
	private Integer inventoryId;
    
  	@Column(name="sku")
	private String sku;
    
  	@Column(name="retail_price")
	private double retailPrice;
    
  	@Column(name="wholesale_price")
	private double wholesalePrice;
    

}
