package com.xworkz.nirmala.runner;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.nirmala.dao.NirmalaDAO;
import com.xworkz.nirmala.dao.NirmalaDAOImpl;
import com.xworkz.nirmala.entity.NirmalaEntity;

public class NirmalaRunner {

	public static void main(String[] args) {
      NirmalaEntity nirmalaEntity = new NirmalaEntity("BTM","MALE","PRIVATE",15, LocalTime.of(0, 15, 50), "Darshan", LocalDate.now(), "RAJ", LocalDate.now());
      
      NirmalaEntity nirmalaEntity2 = new NirmalaEntity();
      nirmalaEntity2.setCost(20);
      nirmalaEntity2.setCreateDate(LocalDate.now());
      nirmalaEntity2.setCreatedBy("Sudeep");
      nirmalaEntity2.setDuration(LocalTime.of(0, 25));
      nirmalaEntity2.setGender("FEMALE");
      nirmalaEntity2.setLocation("JAYANAGAR");
      nirmalaEntity2.setType("PUBLIC");
      nirmalaEntity2.setUpdateDate(LocalDate.of(2001, 12, 21));
      nirmalaEntity2.setUpdatedBy("YASH");
      
      NirmalaEntity nirmalaEntity3 = new NirmalaEntity();
      nirmalaEntity3.setCost(25);
      nirmalaEntity3.setCreateDate(LocalDate.of(2005, 01, 10));
      nirmalaEntity3.setCreatedBy("SURI");
      nirmalaEntity3.setDuration(LocalTime.of(1, 30));
      nirmalaEntity3.setGender("MALE");
      nirmalaEntity3.setLocation("KORAMANGALA");
      nirmalaEntity3.setType("PRIVATE");
      nirmalaEntity3.setUpdateDate(LocalDate.of(2005, 10, 10));
      nirmalaEntity3.setUpdatedBy("RAJAMOULI");
      
  NirmalaDAO dao = new  NirmalaDAOImpl();
  
  boolean d = dao.save(nirmalaEntity3);
  boolean c = dao.save(nirmalaEntity2);
  boolean b = dao.save(nirmalaEntity);
  
  System.out.println(d);
  System.out.println(c);
  System.out.println(b);
 
   
	}
}
