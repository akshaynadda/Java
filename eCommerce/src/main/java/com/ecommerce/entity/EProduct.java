package com.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ECOM_PRODUCT")
public class EProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PROD_KEY")
	private Integer prodKey;
	
	@Column(name = "PROD_ID", nullable = false, length = 10)
	private String prodId;
	
	@Column(name = "PROD_NAME", nullable = false, length = 50)
	private String prodName;
	
	@Column(name = "PROD_DESC")
	private String prodDesc;
	
	@Column(name = "PROD_PRICE", nullable = false)
	private double prodPrice;
	
	@ManyToOne
	private ECategory category;
	
	public EProduct() {
		super();
	}

	public EProduct(Integer prodKey, String prodId, String prodName, String prodDesc, double prodPrice, Integer catId) {
		super();
		this.prodKey = prodKey;
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodDesc = prodDesc;
		this.prodPrice = prodPrice;
		this.category = new ECategory(catId,"","","");
	}

	public Integer getProdKey() {
		return prodKey;
	}

	public void setProdKey(Integer prodKey) {
		this.prodKey = prodKey;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public double getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}

	public ECategory getCategory() {
		return category;
	}

	public void setCategory(ECategory category) {
		this.category = category;
	}	
}
