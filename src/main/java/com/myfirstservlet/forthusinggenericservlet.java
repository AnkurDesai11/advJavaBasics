package com.myfirstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class forthusinggenericservlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Servlet using Generic Servlet");
		PrintWriter out = resp.getWriter();
		out.println("<h1>Forth Servlet using Generic Servlet</h1>");
 	}
	
}
