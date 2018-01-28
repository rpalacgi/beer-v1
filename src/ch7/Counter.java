package ch7;

import java.io.IOException;


public class Counter {
	
	private static int count;
	
	public static int getCount() throws IOException {
		
		count++;
		return count;
	}
}