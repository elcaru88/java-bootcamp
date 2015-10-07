package com.pruebas.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name="products")		
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idproduct")
	private int idproduct;
	
	@NotNull
	@Column(name="name")
	private String name;
	
	@NotNull
	@Column(name="price")
	private double price;
	
	// un producto puede estar en cero o mas items
	@OneToMany(mappedBy = "product")
	private List<Item> items;
    
	// un producto pertenece a una categoria
	@ManyToOne
	@JoinColumn(name = "idcategory")
	private Category categorys;
	
	public int getIdproduct() {
		return idproduct;
	}

	public void setIdproduct(int idproduct) {
		this.idproduct = idproduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product() {

	}

	@Override
	public String toString() {
		return "Product [idproduct=" + idproduct + ", name=" + name + ", price=" + price + "]";
	}	
	
	
	

}
