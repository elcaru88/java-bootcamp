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

import com.sun.istack.internal.NotNull;

@Entity
@Table(name="categorys")
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idcategory")
	private int idcategory;
	
	@NotNull
	@Column(name="name")
	private String name;
	
	// a Category has cero or more  Products 
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "categorys", cascade = CascadeType.ALL)
	private List<Product> productList;

	public Category() {
		
	}

	public int getIdcategory() {
		return idcategory;
	}

	public void setIdcategory(int idcategory) {
		this.idcategory = idcategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	@Override
	public String toString() {
		return "Category [idcategory=" + idcategory + ", name=" + name + ", productList=" + productList + "]";
	}	
		

}
