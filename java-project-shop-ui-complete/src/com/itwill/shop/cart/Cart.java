package com.itwill.shop.cart;

import com.itwill.shop.product.Product;
import com.itwill.shop.user.User;

public class Cart {
	private int cart_no;
	/******User************/
	private String userId;
	/****Product**********/
	private Product product;
	private int cart_qty;
	public Cart() {
		// TODO Auto-generated constructor stub
	}
	public Cart(int cart_no, String userId, Product product, int cart_qty) {
		super();
		this.cart_no = cart_no;
		this.userId = userId;
		this.product = product;
		this.cart_qty = cart_qty;
	}
	public int getCart_no() {
		return cart_no;
	}
	public void setCart_no(int cart_no) {
		this.cart_no = cart_no;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getCart_qty() {
		return cart_qty;
	}
	public void setCart_qty(int cart_qty) {
		this.cart_qty = cart_qty;
	}
	@Override
	public String toString() {
		return "Cart [cart_no=" + cart_no + ", userId=" + userId + ", product=" + product + ", cart_qty=" + cart_qty
				+ "]";
	}
	
	
	
	
}
