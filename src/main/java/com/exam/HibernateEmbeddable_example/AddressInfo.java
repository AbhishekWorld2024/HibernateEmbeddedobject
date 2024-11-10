package com.exam.HibernateEmbeddable_example;
import jakarta.persistence.Embeddable;
@Embeddable
public class AddressInfo {

	private int zip;
	private String city;
	private String country;
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
