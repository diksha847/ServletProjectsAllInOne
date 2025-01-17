package com.excelr;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registration")
public class Registration extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name1");
		String email=req.getParameter("email1");
		String pwd=req.getParameter("pwd1");
		String gender=req.getParameter("gender1");
		String city=req.getParameter("city1");
		PrintWriter out=resp.getWriter();
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
			PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, pwd);
			ps.setString(4, gender);
			ps.setString(5, city);
			int rows=ps.executeUpdate();
			
			if(rows>0)
			{
				out.println("<h1 style='color:green'>Registration successful</h1>");
				RequestDispatcher rd=req.getRequestDispatcher("/register.jsp");
				rd.include(req, resp);
			}
			else
			{
				out.println("<h1 style='color:red'>Registration unsuccessful</h1>");
				RequestDispatcher rd=req.getRequestDispatcher("/register.jsp");
				rd.include(req, resp);
			}

		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}
		

	}

}
