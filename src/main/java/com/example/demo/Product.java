package com.example.demo;

import java.util.Date;

public class Product {

	    private Integer productid;
	    private String productname;
	    private String barcode;
	    private Double price;
	    private Date expDate;
	    
	    
		public Product(Integer productid, String productname, String barcode, Double price, Date expDate) {
			super();
			this.productid = productid;
			this.productname = productname;
			this.barcode = barcode;
			this.price = price;
			this.expDate = expDate;
		}


		public Integer getProductid() {
			return productid;
		}


		public void setProductid(Integer productid) {
			this.productid = productid;
		}


		public String getProductname() {
			return productname;
		}


		public void setProductname(String productname) {
			this.productname = productname;
		}


		public String getBarcode() {
			return barcode;
		}


		public void setBarcode(String barcode) {
			this.barcode = barcode;
		}


		public Double getPrice() {
			return price;
		}


		public void setPrice(Double price) {
			this.price = price;
		}


		public Date getExpDate() {
			return expDate;
		}


		public void setExpDate(Date expDate) {
			this.expDate = expDate;
		}
	    
	
}
