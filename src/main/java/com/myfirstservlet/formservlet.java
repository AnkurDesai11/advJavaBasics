package com.myfirstservlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class formservlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h3>Your Registration Details</h3>");
		String name = req.getParameter("username");
		String pass = req.getParameter("userpass");
		String email = req.getParameter("usermail");
		String role = req.getParameter("userrole");
		String pref = req.getParameter("userpref");
		String term = req.getParameter("termcond");
		//JDBC here
		
		if(term==null) {
			out.println("<h6> You have not agreed to the terms and conditions</h6>");
			//include simpleform.html
			RequestDispatcher rd = req.getRequestDispatcher("simpleform.html");
			rd.include(req,resp);
			
		}
		else if(name!="" && pass!="" && email!="" && role!=null && pref!="" ) {
			req.setAttribute("name", name);
			req.setAttribute("email", email);
			req.setAttribute("role", role);
			req.setAttribute("pref", pref);
			req.setAttribute("pass", pass);
			//anything after the rd.forward line will not execute as control transferred to forwarded servlet
			RequestDispatcher rd = req.getRequestDispatcher("regsuccess");
			rd.forward(req,resp);
		}
		else {
			out.println("<h6> Please fill all the details </h6>");
			//include simpleform.html
			RequestDispatcher rd = req.getRequestDispatcher("simpleform.html");
			rd.include(req,resp);
		}
	}
	

}
