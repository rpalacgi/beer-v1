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
public class SimpleTagTest extends SimpleTagSupport {
	
	public void doTag() throws JspException, IOException {
		getJspContext().getOut().print("This is the lamest use of a custom tag");
	}

}
