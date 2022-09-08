package com.xworkz.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentRunner {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student = context.getBean("stu",Student.class);
		System.out.println(student);
		 
		Student student2 = context.getBean("stu1",Student.class);
		System.out.println(student2);

	}

}

/*Console/Output
 * 
 * Student [usn=101, name=Kalyan, branch=civil Engg, college=BMSECE,
 * university=VTU, feesPerYear=75000.0, totalStregnth=32, noOfBoys=13,
 * noOfGirls=19, noOfFaculties=6, location=Bangalore, state=Karnatka,
 * country=India, continent=Asia, courseDuration=3, principalName=Ravi]
 * 
 * 
 * Student [usn=102, name=Dayanand, branch=civil Engg, college=BMSECE,
 *  university=VTU, feesPerYear=75000.0, totalStregnth=32, noOfBoys=13,
 *   noOfGirls=19, noOfFaculties=6, location=Bangalore, state=Karnatka, 
 *   country=India, continent=Asia, courseDuration=3, principalName=Ravi]
 */
