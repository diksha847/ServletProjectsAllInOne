package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serv")
public class Servlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
//		pw.println("<h1>Login page</h1>");
		String name=req.getParameter("name");

		String gmail=req.getParameter("gmail");
		String password=req.getParameter("pwd");

//		pw.println("<form>");
//		pw.println("Name:<input type=\"text\"><br><br>");
//		pw.println("Password:<input type=\"password\">");
//		pw.println("<input type=\"submit\">");
		
		pw.println("<h1 style=\"color:green\">Registeration successful</h1>");
		pw.println("welcome "+name);
		pw.println(gmail);
		
		
	
	}

}