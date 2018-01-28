/*
 * Created on Jul 17, 2011
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package ch3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Robbi
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class BeerExpert {
	public List getBrands(String color) {
		
		List brands = new ArrayList();
		
		if(color.equals("amber")) {
			brands.add("Jack Amber");
			brands.add("Red Moose");
		} else {
			brands.add("Jail Pale Ale");
			brands.add("Gout Stout");
		}
		
		return (brands);
	}
}
