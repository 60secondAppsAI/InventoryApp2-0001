package com.InventoryApp2.dto;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class BrowseInventoryDTO {

	private Integer ownerId;

	private Integer inventoryId;

	private Integer inventoryStatus;
	
	private Integer nextOrPrevious;
}

