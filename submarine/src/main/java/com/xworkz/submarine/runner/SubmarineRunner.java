package com.xworkz.submarine.runner;

import java.time.LocalDate;

import com.xworkz.submarine.dao.SubmarineDAO;
import com.xworkz.submarine.dao.SubmarineDAOImpl;
import com.xworkz.submarine.entity.SubmarineEntity;

public class SubmarineRunner {

	public static void main(String[] args) {

		SubmarineEntity submarineEntity = new SubmarineEntity("INS Arihant", "India", 55452455.54, "Rajanath singh",
				LocalDate.of(1945, 02, 03), "Narendra", LocalDate.of(2015, 10, 10));

		SubmarineEntity submarineEntity2 = new SubmarineEntity();
		submarineEntity2.setCreateDate(LocalDate.of(1965, 03, 03));
		submarineEntity2.setCreatedBy("Kalyan");
		submarineEntity2.setMadeIn("America");
		submarineEntity2.setName("Elon musk");
		submarineEntity2.setPrice(321562112.56);
		submarineEntity2.setUpdateDate(LocalDate.now());
		submarineEntity2.setUpdatedBy("Kumar");

		SubmarineDAO dao = new SubmarineDAOImpl();
		boolean b = dao.save(submarineEntity);
		boolean c = dao.save(submarineEntity2);
		System.out.println(b);
		System.out.println(c);

	}

}

/*MySQL
 * 
 * ID  NAME         MADEIN   PRICE         CREATEDBY       CREATEDATE  UPDATEDBY   UPDATEDATE
 * 1  INS Arihant  India    55452455.54   Rajanath singh  1945-02-03  Narendra    2015-10-10
 * 2  Elon musk    America  321562112.56  Kalyan          1965-03-03  Kumar       2022-09-15
 */
							
