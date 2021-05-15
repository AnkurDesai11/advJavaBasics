package com.myfirstservlet;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.Date;

public class HttpservletFifth extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		System.out.println("Get method");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h2>This is get method</h2>");
		out.println(new Date().toString());
	}
}
