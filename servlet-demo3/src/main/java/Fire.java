import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet(loadOnStartup = 1,urlPatterns = "/switch")
public class Fire extends HttpServlet {
	
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("Name");
		String company = req.getParameter("Company");
		String pack = req.getParameter("Package");
		
		System.out.println("Name : ".concat(name));
		System.out.println("Company : ".concat(company));
		System.out.println("Package : ".concat(pack));
		
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.append("<html>").append("<body>").append("<h1>")
		.append("This is working....")
		.append("</br>")
		.append("Alias Name  : ").append(name)
		.append("</br>")
		.append("Company Name  : ").append(company)
		.append("</br>")
		.append("Salary  : ").append(pack)
		.append("</h1>").append("</body>").append("</html>");
		
		
		
		
		
	}
	
	

}
