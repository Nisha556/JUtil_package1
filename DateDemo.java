package Util;
import java.util.Date;

public class DateDemo {
public static void main(String args[])
{
	Date date = new Date();
	System.out.println(date);
	long msec = date.getTime();
	System.out.println("Miliseconds since jan 1 1970 " + msec);
	
}
}

