package com.xworkz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/fire")
public class MoonServlet extends HttpServlet {
	
	public MoonServlet() {
		System.out.println("Created moonServlet using default constructor");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service in moonservlet");
		
		resp.setContentType("text/plain");
		PrintWriter writer = resp.getWriter();		
		writer.append("Good morning");
	}
}
