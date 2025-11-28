package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


/**
 * this is an utility class which has functionalities present in java library
 * @author QSP
 * @version 03-11-2025
 */

public class JavaUtility {
	/**
	 * This is generic method to fetch Calendar details
	 * @param pattern
	 * @return
	 */
	
	public String getCalendarDetails(String pattern) 
	{
		Calendar cal=Calendar.getInstance();
		Date d=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		String value=sdf.format(d);
		return value;
		
	}
	/**
	 * This is generic method to generate random number
	 * @param boundry
	 * @return
	 */
	
	public int generateRandomNumber(int boundry) {
		Random r=new Random();
		int num=r.nextInt(boundry);
		return num;
	}
}
