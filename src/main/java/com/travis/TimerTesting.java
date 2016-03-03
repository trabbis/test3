package com.travis;

//public class TimerTesting {
//}
import java.util.Timer;
import java.util.TimerTask;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

public final class TimerTesting extends TimerTask {

	  //expressed in milliseconds
	  private final static long fONCE_PER_DAY = 1000*60*60*24;

	  private final static int fONE_DAY = 1;
	  private final static int fFOUR_AM = 4;
	  private final static int fZERO_MINUTES = 0;

  /**
  * Construct and use a TimerTask and Timer.
  */
  public static void main (String... arguments ) {
    TimerTask fetchMail  = new TimerTesting();

    //perform the task once a day at 4 a.m., starting tomorrow morning
    //(other styles are possible as well)
    Timer timer = new Timer();
//    timer.scheduleAtFixedRate(fetchMail, getTomorrowMorning4am(), fONCE_PER_DAY);
//    timer.scheduleAtFixedRate(fetchMail, getTomorrowMorning4am(), fONCE_PER_DAY);
	long delaySeconds = 1; //30;
	long intervalSeconds = 60; //3600;
	timer.schedule(fetchMail,delaySeconds*1000,intervalSeconds*1000);  

	
  }

  /**
  * Implements TimerTask's abstract run method.
  */
  public void run(){
    //toy implementation
    System.out.println("Fetching mail..." + new Date().toString());
  }

  // PRIVATE ////

  private static Date getTomorrowMorning4am(){
    Calendar tomorrow = new GregorianCalendar();
    tomorrow.add(Calendar.DATE, fONE_DAY);
    Calendar result = new GregorianCalendar(
      tomorrow.get(Calendar.YEAR),
      tomorrow.get(Calendar.MONTH),
      tomorrow.get(Calendar.DATE),
      fFOUR_AM,
      fZERO_MINUTES
    );
    return result.getTime();
  }
}





