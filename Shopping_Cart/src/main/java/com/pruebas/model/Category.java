package com.pruebas.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "categoryid")
	private int categoryid;

	@Column(name = "categoryname")
	private String categoryname;

//	@OneToMany(mappedBy = "category")
//	private List<Line> lineList;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "categoryid",
			cascade = CascadeType.ALL)
	private List<Product> productList;

	public Category() {

	}
	
	

	public Category(String categoryname) {
		this.categoryname = categoryname;
	}



	public long getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public List<Product> getProductList() {
		return productList;
	}
//
//	public void setProductList(List<Product> productList) {
//		this.productList = productList;
//	}

	@Override
	public String toString() {
		return "Category [categoryid=" + categoryid + ", categoryname=" + categoryname + "]";
	}

	

}
