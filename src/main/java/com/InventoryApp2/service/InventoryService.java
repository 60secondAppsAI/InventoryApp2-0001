package com.InventoryApp2.service;

import java.util.List;
import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.InventoryApp2.domain.Inventory;
import com.InventoryApp2.dto.InventoryDTO;
import com.InventoryApp2.dto.InventorySearchDTO;
import com.InventoryApp2.dto.InventoryPageDTO;
import com.InventoryApp2.dto.InventoryConvertCriteriaDTO;
import com.InventoryApp2.service.GenericService;
import com.InventoryApp2.dto.common.RequestDTO;
import com.InventoryApp2.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface InventoryService extends GenericService<Inventory, Integer> {

	List<Inventory> findAll();

	ResultDTO addInventory(InventoryDTO inventoryDTO, RequestDTO requestDTO);

	ResultDTO updateInventory(InventoryDTO inventoryDTO, RequestDTO requestDTO);

    Page<Inventory> getAllInventorys(Pageable pageable);

    Page<Inventory> getAllInventorys(Specification<Inventory> spec, Pageable pageable);

	ResponseEntity<InventoryPageDTO> getInventorys(InventorySearchDTO inventorySearchDTO);
	
	List<InventoryDTO> convertInventorysToInventoryDTOs(List<Inventory> inventorys, InventoryConvertCriteriaDTO convertCriteria);

	InventoryDTO getInventoryDTOById(Integer inventoryId);



	
}
