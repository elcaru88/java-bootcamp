package com.pruebas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "productid")
	private long productid;

	@Column(name = "productname")
	private String productname;

	@Column(name = "price")
	private double price;
	
	@Column(name = "categoryid")
	private int categoryid;

//	@OneToMany(mappedBy = "product")
//	private List<Line> lineList;

//	@ManyToOne
//	@JoinColumn(name = "categoryid")
//	private int categoryid;

	public Product() {

	}

	public Product(String productname, double price, int categoryid) {
		super();
		this.productname = productname;
		this.price = price;
		this.categoryid = categoryid;
	}

	public long getProductid() {
		return productid;
	}

	public void setProductid(long productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", price=" + price + ", categoryid="
				+ categoryid + "]";
	}

	
	
	
	

}
