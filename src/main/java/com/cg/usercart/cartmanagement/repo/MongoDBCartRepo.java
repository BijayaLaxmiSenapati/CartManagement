package com.cg.usercart.cartmanagement.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.usercart.cartmanagement.DTO.CartProduct;


@Transactional
@Repository
public interface MongoDBCartRepo extends MongoRepository<CartProduct, String>{
	
	@Query(value="{'userId':?0, 'tenantId':?1, 'productName':?2}")
	public Optional<CartProduct> findByUserIdTenantIdAndProductName(String userId,String tenantId, String productName);
	
	public List<CartProduct> findByUserId(String userId);
	public void deleteByUserId(String userId);
}