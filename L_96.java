//import java.time.LocalDate;
//import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class L_96 {

	public static void main(String[] args) {
		// TIME AND DATE
		System.out.println("no of miliseconds since 1 jan 1970");
		System.out.println(System.currentTimeMillis());
		System.out.println("no of seconds since 1 jan 1970");
		System.out.println(System.currentTimeMillis()/1000);
		System.out.println("no of minutes since 1 jan 1970");
		System.out.println(System.currentTimeMillis()/1000/60);
		System.out.println("no of hours since 1 jan 1970");
		System.out.println(System.currentTimeMillis()/1000/3600);
		System.out.println("no of days since 1 jan 1970");
		System.out.println(System.currentTimeMillis()/1000/3600/24/365);
		
////////////////////////////////////////////////////////
		//date class
		Date d=new Date();
	System.out.println(d.getDate());
	System.out.println(d.getTime());
	System.out.println(d.getTimezoneOffset());
	//////////////////////////////////////////////////
	//calender class

	Calendar C= Calendar.getInstance();
	System.out.println(C.getCalendarType());
	System.out.println(C.getTimeZone());
	System.out.println(C.DAY_OF_WEEK);
	System.out.println(C.FRIDAY);
	System.out.println(C.NARROW_FORMAT);
	
//	/////////////////////
	Calendar c= Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapora"));
	System.out.println(C.getCalendarType());
	System.out.println(C.getTimeZone().getID( ));
	
	/////////////////////////////////////////////
	//gregorian claender
	GregorianCalendar g =new GregorianCalendar();
	System.out.println(g.get(Calendar.DATE));
	System.out.println(g.get(Calendar.DAY_OF_MONTH));
	System.out.println(g.get(Calendar.AM));
	System.out.println(g.get(Calendar.DATE));
	System.out.println(g.isLeapYear(2020));
	///////////////////////
	//time xoen
	System.out.println(TimeZone.getAvailableIDs()[45]);
	System.out.println(TimeZone.getDefault());
	////java.time
	LocalDate ld=LocalDate.now();
	System.out.println(ld);
	LocalTime lt=LocalTime.now();
	System.out.println(lt);
	LocalDateTime ldt=LocalDateTime.now();
	System.out.println(ldt);
	
	  DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy--E");
	     String dte =ld.format(f);
		System.out.println(dte);
		  DateTimeFormatter f2=DateTimeFormatter.ISO_LOCAL_DATE;
		     String dte2 =ld.format(f2);
			System.out.println(dte2);
	
	
	
	}

}
