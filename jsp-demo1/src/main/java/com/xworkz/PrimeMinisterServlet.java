package com.xworkz;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/pm")
public class PrimeMinisterServlet extends HttpServlet {
	
	public PrimeMinisterServlet() {
		System.out.println("PrimeMinisterObject created");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("calling doPost Method");
		String name=req.getParameter("primeMinisterName");
		String country = req.getParameter("country");
		String marry = req.getParameter("status");
		String pn = req.getParameter("PartyName");
		String age = req.getParameter("primeMinisterAge");
		String gender = req.getParameter("primeMinisterGender");
		String period = req.getParameter("primeMinisterPeriod");
		String time = req.getParameter("timesRepresented");
		
		System.out.println("Name :"+name);
		System.out.println("Country :"+country);
		System.out.println("Marriage :"+marry);
		System.out.println("Party Name :"+pn);
		System.out.println("Age : "+age);
		System.out.println("Gender :"+gender);
		System.out.println("Period :"+period);
		System.out.println("Times Represented:"+time);
		
		req.setAttribute("Name", name);
		req.setAttribute("Country", country);
		req.setAttribute("Marriage", marry);
		req.setAttribute("PartyName:", pn);
		req.setAttribute("Age", age);
		req.setAttribute("Gender", gender);
		req.setAttribute("Period", period);
		req.setAttribute("TimesRepresented", time);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/Success.jsp");
		 dispatcher.forward(req, resp);
	}

}
