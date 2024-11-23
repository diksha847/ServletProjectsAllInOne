package request;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String gmail=req.getParameter("gmail");
		String pwd=req.getParameter("pwd");
		
		if(gmail.equalsIgnoreCase("diksha123@gmail.com")&&pwd.equalsIgnoreCase("diksha1234"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("welcome");
			rd.forward(req, resp);
		}

	}

}
