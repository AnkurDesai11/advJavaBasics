package com.myfirstservlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.*;

public class third implements Servlet{
	ServletConfig conf;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroying object");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		//return null;
		return this.getServletConfig();
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		//return null;
		return("third servlet with all methods");
	}

	@Override
	public void init(ServletConfig conf) throws ServletException {
		// TODO Auto-generated method stub
		this.conf=conf;
		System.out.println("Creating object");
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("servicing");
		//set content type of response
		resp.setContentType("text/html");
		PrintWriter output = resp.getWriter();
		output.println("<h1>Output from servlet service method</h1>");
		output.println("<h4>Date and Time:"+new Date().toString()+"</h4>");
		
	}

	
}
