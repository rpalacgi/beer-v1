/*
 * Created on Jul 31, 2011
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package ch9;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class AdvisorTagHandler extends SimpleTagSupport {
	private String user;

	public void doTag() throws JspException, IOException {
		getJspContext().getOut().write("Hello " + user + " <br>");
		getJspContext().getOut().write("Your advice is: " + getAdvice());
	}

	public void setUser(String user) {
		this.user = user;
	}

	String getAdvice() {
		String[] adviceStrings = { "That color is not working for you.",
				"You should call in sick.",
				"You might want to rethink that haircut." };
		int random = (int) (Math.random() * adviceStrings.length); // Brilliant!
		return adviceStrings[random];
	}
}