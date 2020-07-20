package Util;
import java.util.*;

public class MyTimerTask extends TimerTask{
	public void run()
	{
		System.out.println("Time task excuted");
		
	}
	

}

class TTest {
	public static void main(String args[])
	{
		MyTimerTask myTask = new MyTimerTask();
		Timer myTimer = new Timer();
		myTimer.schedule(myTask , 1000,500);
		try {
			Thread.sleep(5000);
			
		}
		catch (InterruptedException exc)
		{
			
		}
		myTimer.cancel();
		
				
		
	}
}