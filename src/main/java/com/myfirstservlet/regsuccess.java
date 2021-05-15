package com.myfirstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class regsuccess extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h2>Successfully Registered</h2>");
		out.println("<h6> Name: "+req.getAttribute("name")+"</h6>");
		out.println("<h6> Password: "+req.getAttribute("email")+"</h6>");
		out.println("<h6> Email: "+req.getAttribute("pass")+"</h6>");
		out.println("<h6> Occupation: "+req.getAttribute("role")+"</h6>");
		out.println("<h6> Preference: "+req.getAttribute("pref")+"</h6>");
	}

}
