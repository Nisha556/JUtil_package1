package Util;
import java.util.*;

public class PrecisionDemo {
	public static void main(String args[])
	{
		Formatter fmt = new Formatter();
		fmt.format("%.4f" , 123.1234567);
		System.out.println(fmt);
		fmt = new Formatter();
		fmt.format(".15s" , "Formatting with Java is now easy.");
		System.out.println(fmt);
		
	}

}
