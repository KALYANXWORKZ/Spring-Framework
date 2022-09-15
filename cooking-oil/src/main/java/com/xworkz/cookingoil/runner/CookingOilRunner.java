package com.xworkz.cookingoil.runner;

import java.time.LocalDate;

import com.xworkz.cookingoil.dao.CookingOilDAO;
import com.xworkz.cookingoil.dao.CookingOilDAOImpl;
import com.xworkz.cookingoil.entity.CookingOilEntity;

public class CookingOilRunner {

	public static void main(String[] args) {

		CookingOilEntity cookingOilEntity = new CookingOilEntity("Sunflower", 250, "yellow", "Olive", "India", "Sun",
				LocalDate.of(1995, 10, 20), "Darshan", LocalDate.now(), LocalDate.of(1996, 10, 20));

		CookingOilEntity cookingOilEntity2 = new CookingOilEntity();
		cookingOilEntity2.setBrand("Fortune");
		cookingOilEntity2.setColor("yellow");
		cookingOilEntity2.setCreateDate(LocalDate.of(2022, 9, 10));
		cookingOilEntity2.setCreatedBy("Kalyan");
		cookingOilEntity2.setExpireDate(LocalDate.of(2023, 9, 10));
		cookingOilEntity2.setMadeIn("Karnataka");
		cookingOilEntity2.setPrice(255.36);
		cookingOilEntity2.setType("coconut");
		cookingOilEntity2.setUpdateDate(LocalDate.now());
		cookingOilEntity2.setUpdatedBy("Kumar");

		CookingOilDAO dao = new CookingOilDAOImpl();

		boolean b = dao.save(cookingOilEntity);
		boolean c = dao.save(cookingOilEntity2);

		System.out.println(b);
		System.out.println(c);

	}

}
// MySQL TABLE
// ID   BRAND      PRICE   COLOR   TYPE    MADEIN      CREATEDBY  CREATEDATE   UPDATEDBY  UPDATEDATE   EXPIREDATE
// 1	Sunflower	250	    yellow	Olive	India	    Sun	       1995-10-20	Darshan	   2022-09-16	1996-10-20
// 2	Fortune	    255.36	yellow	coconut	Karnataka	Kalyan     2022-09-10	Kumar	   2022-09-16	2023-09-10
										
