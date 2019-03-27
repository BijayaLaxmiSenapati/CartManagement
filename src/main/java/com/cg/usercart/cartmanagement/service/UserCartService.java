package com.cg.usercart.cartmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.usercart.cartmanagement.DTO.CartProduct;
import com.cg.usercart.cartmanagement.repo.MongoDBCartRepo;

@Service
public class UserCartService {

	@Autowired
	MongoDBCartRepo mongoDBCartRepo;

	public CartProduct deleteCartProduct(CartProduct cartProduct) {
		CartProduct cartProductByUserIdAndProductName = mongoDBCartRepo
				.findByUserIdTenantIdAndProductName(cartProduct.getUserId(), cartProduct.getTenantId(), cartProduct.getProductName()).get();
		mongoDBCartRepo.deleteById(cartProductByUserIdAndProductName.getId());
		return cartProductByUserIdAndProductName;

	}

	public void emptyCart(String userId) {

		System.out.println(mongoDBCartRepo.findByUserId(userId));
		if (mongoDBCartRepo.findByUserId(userId).size() >= 1) {
			mongoDBCartRepo.deleteByUserId(userId);
		}
	}

}
