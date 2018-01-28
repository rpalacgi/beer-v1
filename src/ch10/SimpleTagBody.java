/*
 * Created on Aug 3, 2011
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package ch10;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.*;

/**
 * @author Robbi
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class SimpleTagBody extends SimpleTagSupport {
	
	public void doTag() throws JspException, IOException {
		getJspBody().invoke(null);
	}

}
