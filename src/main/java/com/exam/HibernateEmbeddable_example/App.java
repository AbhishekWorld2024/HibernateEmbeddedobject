package com.exam.HibernateEmbeddable_example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
  public static void main(String[] args) {
    
	  
	  NameInfo Ninfo=new NameInfo();
	  Ninfo.setFirst_Name("Abhi");
	  Ninfo.setLast_Name("Arugonda");
	  
	  AddressInfo Ainfo=new AddressInfo();
	  Ainfo.setZip(111);
	  Ainfo.setCity("NZB");
	  Ainfo.setCountry("India");
	  
	  
	  StudentInfo info=new StudentInfo();
	  info.setId(100);
	  info.setName(Ninfo);
	  info.setAddress(Ainfo);
	  
	  
	  Configuration con=new Configuration().configure("hibernate3.cfg.xml").addAnnotatedClass(StudentInfo.class);
  	SessionFactory sf=con.buildSessionFactory();
  	Session session=sf.openSession();
  	Transaction tx=session.beginTransaction();
  	session.save(info);
  	tx.commit();
  }
}
