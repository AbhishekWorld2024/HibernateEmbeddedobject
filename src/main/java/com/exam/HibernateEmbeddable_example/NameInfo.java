package com.exam.HibernateEmbeddable_example;
import jakarta.persistence.Embeddable;
@Embeddable
public class NameInfo {

	private String First_Name;
	private String Last_Name;
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}


}
