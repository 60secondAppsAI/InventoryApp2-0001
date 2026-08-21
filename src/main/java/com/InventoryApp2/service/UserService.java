package com.InventoryApp2.service;

import java.util.List;
import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.InventoryApp2.domain.User;
import com.InventoryApp2.dto.UserDTO;
import com.InventoryApp2.dto.UserSearchDTO;
import com.InventoryApp2.dto.UserPageDTO;
import com.InventoryApp2.dto.UserConvertCriteriaDTO;
import com.InventoryApp2.service.GenericService;
import com.InventoryApp2.dto.common.RequestDTO;
import com.InventoryApp2.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface UserService extends GenericService<User, Integer> {

	List<User> findAll();

	ResultDTO addUser(UserDTO userDTO, RequestDTO requestDTO);

	ResultDTO updateUser(UserDTO userDTO, RequestDTO requestDTO);

    Page<User> getAllUsers(Pageable pageable);

    Page<User> getAllUsers(Specification<User> spec, Pageable pageable);

	ResponseEntity<UserPageDTO> getUsers(UserSearchDTO userSearchDTO);
	
	List<UserDTO> convertUsersToUserDTOs(List<User> users, UserConvertCriteriaDTO convertCriteria);

	UserDTO getUserDTOById(Integer userId);



	
}
