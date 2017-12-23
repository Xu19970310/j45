
package org.java.tag;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class FristTag extends BodyTagSupport{

	@Override
	public int doStartTag() throws JspException {

	    try {
	    	JspWriter out=pageContext.getOut();
		    SimpleDateFormat simp=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
			out.write(simp.format(new Date()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doStartTag();
	}

}