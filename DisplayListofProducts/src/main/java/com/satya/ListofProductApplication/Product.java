package com.satya.ListofProductApplication;

import java.sql.Date;
import java.util.Arrays;

public class Product {
	
	private  String ProId;
	private  String ProName;
	private  double ProPrice; 
	private   String ProBrand;
	private  String ProMadeIn;
	private  Date ProMFGDt;
	private  Date  ProEXPDt;
	private  byte[] ProImage;
	public String getProId() {
		return ProId;
	}
	public void setProId(String proId) {
		ProId = proId;
	}
	public String getProName() {
		return ProName;
	}
	public void setProName(String proName) {
		ProName = proName;
	}
	public double getProPrice() {
		return ProPrice;
	}
	public void setProPrice(double proPrice) {
		ProPrice = proPrice;
	}
	public String getProBrand() {
		return ProBrand;
	}
	public void setProBrand(String proBrand) {
		ProBrand = proBrand;
	}
	public String getProMadeIn() {
		return ProMadeIn;
	}
	public void setProMadeIn(String proMadeIn) {
		ProMadeIn = proMadeIn;
	}
	public Date getProMFGDt() {
		return ProMFGDt;
	}
	public void setProMFGDt(Date proMFGDt) {
		ProMFGDt = proMFGDt;
	}
	public Date getProEXPDt() {
		return ProEXPDt;
	}
	public void setProEXPDt(Date proEXPDt) {
		ProEXPDt = proEXPDt;
	}
	public byte[] getProImage() {
		return ProImage;
	}
	public void setProImage(byte[] proImage) {
		ProImage = proImage;
	}

	
	
}   