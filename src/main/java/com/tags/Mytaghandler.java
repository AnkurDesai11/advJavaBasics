package com.tags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class Mytaghandler extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		try {
			JspWriter out = pageContext.getOut();
			out.println("<h1>Custom Tag</h1>");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return SKIP_BODY;
	}

}
