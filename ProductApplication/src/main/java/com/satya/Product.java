package com.satya;


import java.sql.Date;

public class Product {
	
	  private String proId;
	  private String proName;
	  private double proPrice;
	  private String proBrand;
	  private String proMadeIn;
	  private Date promfgdate;
	  private Date proexpdate;
	  private byte []proImage;
	public String getProId() {
		return proId;
	}
	public void setProId(String proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}
	public String getProBrand() {
		return proBrand;
	}
	public void setProBrand(String proBrand) {
		this.proBrand = proBrand;
	}
	public String getProMadeIn() {
		return proMadeIn;
	}
	public void setProMadeIn(String proMadeIn) {
		this.proMadeIn = proMadeIn;
	}
	public Date getPromfgdate() {
		return promfgdate;
	}
	public void setPromfgdate(Date promfgdate) {
		this.promfgdate = promfgdate;
	}
	public Date getProexpdate() {
		return proexpdate;
	}
	public void setProexpdate(Date proexpdate) {
		this.proexpdate = proexpdate;
	}
	public byte[] getProImage() {
		return proImage;
	}
	public void setProImage(byte[] proImage) {
		this.proImage = proImage;
	}
	  
	  
}
