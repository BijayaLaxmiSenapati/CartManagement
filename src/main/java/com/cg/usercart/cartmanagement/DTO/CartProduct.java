package com.cg.usercart.cartmanagement.DTO;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModelProperty;

@Document(collection="cart_products")
public class CartProduct {

	@ApiModelProperty(hidden=true)
	@Id
	private String id;
	private String userId;
	private String tenantId;
	private String productName;
	private String imageName;
	private String productPrice;
	private String currency;
	private int quantity;

	public CartProduct() {
		// TODO Auto-generated constructor stub
	}
	
	public String getUserId() {
		return userId;
	}

	public String getTenantId() {
		return tenantId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getCurrency() {
		return currency;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CartProduct [id=" + id + ", userId=" + userId + ", tenantId=" + tenantId + ", productName="
				+ productName + ", imageName=" + imageName + ", productPrice=" + productPrice + ", currency=" + currency
				+ ", quantity=" + quantity + "]";
	}

}
