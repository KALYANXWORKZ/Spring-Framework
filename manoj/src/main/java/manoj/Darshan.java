package manoj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 6, urlPatterns = "/maya")
public class Darshan extends HttpServlet {
	public Darshan() {
		System.out.println("manoj Servalet is created");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  System.out.println(" manoj is kalyan friend ");
  resp.setContentType("text/html");
  PrintWriter writer = resp.getWriter();
  writer.append("<html><body bgcolor='black'><h1 style=color:white> Idu Black </h1></body></html>");
  
	}

}
