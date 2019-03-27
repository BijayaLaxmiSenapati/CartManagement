package com.cg.usercart.cartmanagement.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.usercart.cartmanagement.DTO.CartProduct;
import com.cg.usercart.cartmanagement.service.UserCartService;

@RestController
@RequestMapping("/cart")
public class UserCartController {
	
	@Autowired
	UserCartService userCartService;
	
	@DeleteMapping("/delete")
	public CartProduct deleteCartProduct(@RequestBody CartProduct cartProduct) {
		return userCartService.deleteCartProduct(cartProduct);
	}
	
	@DeleteMapping("/empty")
	public void emptyCart(@RequestParam String userId) {
		userCartService.emptyCart(userId);
	}
}
