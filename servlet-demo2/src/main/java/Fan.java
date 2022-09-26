
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/water")
public class Fan extends HttpServlet {

	public Fan() {

		System.out.println("created fanservlet using default constructor");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service in FanServlet");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<html><body bgcolor='yellow'><h1>Idu Yellow</h1></body></html>");
	}
}
