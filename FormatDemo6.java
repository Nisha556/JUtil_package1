package Util;
import java.util.*;

public class FormatDemo6 {
	public static void main(String args[])
	{
		Formatter fmt = new Formatter();
		fmt.format("%,.2f", 4356783497.34);
		System.out.println(fmt);
	}

}
