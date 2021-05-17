package com.tags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class PrintTableHandler extends TagSupport{

	public int number;
	public String color;
	
	
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}



	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}



	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		
		JspWriter out = pageContext.getOut();
		
		try {
			out.println("<br>");
			out.println("<div style='color:"+color+"'>");
			for(int i=1;i<=10;i++)
				out.println(i*number+"<br>");
			out.println("</div>");
	
		}catch( Exception e ) {
			e.printStackTrace();
		}
		
		return SKIP_BODY;
	}

}
