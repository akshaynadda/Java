package com.ecommerce.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ECOM_CATEGORY")
public class ECategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CAT_KEY")
	private Integer catKey;
	
	@Column(name = "CAT_ID", nullable = false, length = 6)
	private String catId;
	
	@Column(name = "CAT_NAME", nullable = false, length = 25)
	private String catName;
	
	@Column(name = "CAT_DESC", nullable = false)
	private String catDesc;
	//private LocalDate catAddedOn;
	
	public ECategory() {
		super();
	}
	
	public ECategory(Integer catKey, String catId, String catName, String catDesc) {
		super();
		this.catKey = catKey;
		this.catId = catId;
		this.catName = catName;
		this.catDesc = catDesc;
	}

	public Integer getCatKey() {
		return catKey;
	}
	
	public void setCatKey(Integer catKey) {
		this.catKey = catKey;
	}

	public String getCatId() {
		return catId;
	}

	public void setCatId(String catId) {
		this.catId = catId;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCatDesc() {
		return catDesc;
	}

	public void setCatDesc(String catDesc) {
		this.catDesc = catDesc;
	}

	@Override
	public String toString() {
		return "ECategory [catKey=" + catKey + ", catId=" + catId + ", catName=" + catName + ", catDesc=" + catDesc
				+ "]";
	}	
}
