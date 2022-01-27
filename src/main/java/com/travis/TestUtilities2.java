package com.travis;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


public class TestUtilities2 {

	public static void main (String argv[]) throws Exception {
		convertLocalDateToDate();
	}
	
	
	private static void convertLocalDateToDate() {

		ZoneId defaultZoneId = ZoneId.systemDefault();
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate..." + localDate);
      
		//Converting to Date object
		Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
		System.out.println(date);
		
	}


	
}
