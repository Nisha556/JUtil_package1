package Util;
import java.util.StringTokenizer;
public class STDemo {
	static String in = "title=  Java : the Complete Reference ; " + "author= Schildt; " + "publisher = Osborne/McGraw-Hill;" +"copyright=2007";
	public static void main(String args[])
	{
		
		
			StringTokenizer st = new StringTokenizer(in , "=;");
			while(st.hashMoreTokens())
			{
				String key = st.nextToken();
				String val = st.nextToken();
				System.out.println(key+ "\t"+val);
				
		}
	}

}
