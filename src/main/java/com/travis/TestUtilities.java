package com.travis;

import java.awt.GraphicsEnvironment;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.chrono.GJChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


public class TestUtilities {

	public static final int MIN_YEAR = 0;
	public static final int MAX_YEAR = 1000;


	public static void main (String argv[]) throws Exception {
	    
	    collectionEmptyList();
	    
	    
            //to do lists
            //0. json
            //1. hiberante (good to go) ... 80%
            //2. spring framework (good to go) ...40%
            //3. jsf (good to go) ...20%
            //4. web service(RESTful web service) ...70%
            //5. java core .......... 10%
            //6. EJB
            //7. Ruby on Rails ....
            //seminar
		
    	 //1. test to separate
//    	 String trackingNo = "D43106488167013730401xyzA";
//    	 System.out.println( readableFormatBySpace(trackingNo, 3) );

		//2. continue test
//    	 whileContinueTest();
    	 
    	 //3. getAvailableFontFamilyNames
//    	 getAvailableFontFamilyNames();
    	 
    	 
    	 //4. parse barcode
//    	 getShipperNumFromBarCode("G2011799541", "42124949");
//    	 getShipperNumFromBarCode("D43106488167013730101", "43106488");
    	 
    	 
    	 //5. validate date
//    	 String strDate = "2008-10-11";
//    	 System.out.println("validate date..." + strDate + "..." + isValidDate2(strDate, "yyyy-MM-dd"));
//    	 strDate = "20081011";
//    	 System.out.println("validate date..." + strDate + "..." + isValidDate2(strDate, "yyyyMMdd"));
    	 
//    	 strDate = "2008-13-11";
//    	 System.out.println("validate date..." + strDate + "..." + isValidDate2(strDate, "yyyy-MM-dd"));
//    	 strDate = "2008-10-11 11:12:30";
//    	 System.out.println("validate date..." + strDate + "..." + isValidDate2(strDate, "yyyy-MM-dd HH:mm:ss"));
//    	 strDate = "2008-10-11 25:12:30";
//    	 System.out.println("validate date..." + strDate + "..." + isValidDate2(strDate, "yyyy-MM-dd HH:mm:ss"));

		//6. how to get days of week
//		System.out.println("weekday(09/1/2009): " + getDaysOfWeek("09/1/2009"));
//		System.out.println("weekday(09/2/2009): " + getDaysOfWeek("09/2/2009"));
//		System.out.println("weekday(09/3/2009): " + getDaysOfWeek("09/3/2009"));

		//7. get service day
//		System.out.println(calcualteServiceDay(3, "12 45", "12345"));
//		System.out.println(calcualteServiceDay(3, "12   ", "12345"));
//		System.out.println(calcualteServiceDay(3, "12   ", "   45"));
//		System.out.println(calcualteServiceDay(3, "12   ", "     "));
//		System.out.println(calcualteServiceDay(3, "12345", "12345"));
//		System.out.println(calcualteServiceDay(3, "12  5", "12345"));
//		System.out.println(calcualteServiceDay(3, "    5", " 2345"));
//		System.out.println(calcualteServiceDay(2, "1 3 5", "12345"));
		
    		 
		//8. add number of days to get new date
//		System.out.println(addDate("03/12/2008", 1));
//		System.out.println(addDate("03/12/2008", 6));
//		System.out.println(addDate("03/12/2008", 15));
//		System.out.println(addDate("03/12/2008", 30));
		

		//9. days difference
//		daysDiff2("04/30/2008", "05/1/2008");

		//10. checking working day
//		System.out.println(isWorkableDay(0, "1 3 5"));
//		System.out.println(isWorkableDay(6, "2 4"));

		//11. converting java.util.Date to java.sql.Date
//		String sEvaluatedDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
//		java.sql.Timestamp aaa = java.sql.Timestamp.valueOf(sEvaluatedDate);

//
//		String sEvaluatedDate2 = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
//		java.sql.Date aaa2 = java.sql.Date.valueOf(sEvaluatedDate2);
//		
//		System.out.println("testing..." + aaa.toString());
//		System.out.println("testing..." + aaa2.toString());
		

		//12. getting time with time stamp
//		System.out.println("testing..." + getTomorrowMorning4am().toString());
		
		//13. convert service days to proper verbiage
//		System.out.println(weekValueWording("12345"));

		//14. SimpleDateFormat
//		System.out.println(convertingSimpleDateFormat("05/30/2008", "MM/dd/yyyy") );
//		System.out.println(convertingSimpleDateFormat("May 30, 2008", "MMM dd, yyyy") );
//		System.out.println(convertingSimpleDateFormat("05/30/2008 10:14", "MM/dd/yyyy HH:mm") );
		//System.out.println(convertingSimpleDateFormat("11/20/2014 09:15", "MM/dd/yyyy HH:mm") );
		
		//System.out.println(convertingSimpleDateFormat2("11/20/2014 09:15", "MM/dd/yyyy HH:mm") );
		
		//15. how to get the error line using printStackTrace() method
//		try {
//			int test = 0;
//			test = 10/0;
//		} catch (Exception e) {
//			 System.out.println(stack2string(e));
//		}
		

		//16. encoding special characters in the QueryString
//		String url = "genLabel.do?newAddress1=60 BLOOR ST W #300&newAddress2=true";
//		String newAddress1 = "60 BLOOR ST W #300";
//		String newAddress1 = "<a href=http://www.java.com/en/download/windows_ie.jsp>";
//		System.out.println("encodinig url(before)..." + newAddress1);
//		System.out.println("encodinig url(after )..." + encodingSpecialCharacter(newAddress1));
		

		//17. split Strings.
////		String test1 = "1222 GARCIA ST;;MISSISSAUGA ON;L5V2W9;false;true;false;;422;1855090725;K;42299001";
//		String test1 ="420|25-Sep-2008|E16013";
//		String[] temp = splitStrings(test1, "\\|");
//		for (String item : temp) {
//			System.out.println(item);
//		}
		
		/*
		String test1 ="37,41558";
		String[] temp = splitStringss(test1, ",");
		for (String item : temp) {
			System.out.println(item);
		}
		*/
		
		List<Integer> lists = new ArrayList<Integer>();
//		lists.add(10);
//		lists.add(11);
//		lists.add(13);
		//System.out.println("convertToDelimiteredStrings..." + convertToDelimiteredStrings(lists, ","));
		
		
		

		//18. getting HH:MM from new Date()
//		Date dt1 = new Date();
//		String temp = getHHMMFromDate(dt1);
		
		
		//19. padding spaces
//		System.out.println("paddingSpaces..." + paddingSpaces("test1", 15));
//		System.out.println("padding Zeros..." + "1" + " " + paddingPrefix(1, "0", 2));
//		System.out.println("padding Zeros..." + "11" + " " + paddingPrefix(11, "0", 2));
//		paddingPrefix("11", "0", 2);

		
		//20. collection size test iteration ==> Collection size is same after reading it through
//		List<String> list = new ArrayList<String>();
//		collectionSize(list);
//		System.out.println("after reading list size..." + list.size());
		

		//21. email validation using regular expression
//		String email = "test@test.com";
//		isValidEmail(email);
//		email = "test@testcom";
//		isValidEmail(email);
		
		//22. enum test
//		enumTesting();
	
		//23. check digit algorithm
//		System.out.println("9253331..." + getMod10Digit("9253331"));
//		System.out.println("9253332..." + getMod10Digit("9253332"));
//		System.out.println("9253333..." + getMod10Digit("9253333"));
//		System.out.println("9253328..." + getMod10Digit("9253328"));
//		System.out.println("9229774 getMod10Digit..." + getMod10Digit("9229774"));
//		System.out.println("9229775 getMod10Digit..." + getMod10Digit("9229775"));
		
		//24. LinkedList test
//		collectionTesting(new TreeList()); ////Said that fast in inserting and removing in the middle of the list, but it seems that ArrayList is still faster.
//		collectionTesting(new ArrayList()); ////best performance so far in most situations
//		collectionTesting(new LinkedList()); ////worst. don't use unless you have to.
		
		//25. creating File
//		createFile();
		
		//26. validation of postal code
//		System.out.println("validPostalCode(L5C4R9, ON)..." + validPostalCode("L5C4R9", "ON"));
//		System.out.println("validPostalCode(L5C4R9, QC)..." + validPostalCode("L5C4R9", "QC"));

		//27. substring test
//		fillteringOut("testDELIMITERcanpar.com", "DELIMITER");
//		fillteringOut("test@canpar.com", "@@");
		
		//28. Prefix or postfix increment(decrement)
		//preFixIncrement(10);
		
		//29. replacing String
		//replaceString("abce@test.com", "@", "~");
		//replaceString("abRTce@tRTest.com", "RT", "~");
		
		//30. bitwise operators
		//bitWiseOperator(3,5);
		
		//31. TreeSet test with duplicate values
		//treeSetWithDuplicateValues();
		
		//genericTest();
		
		//32. indexOf lastIndexOf test
//		System.out.println("test1.f..." + trimOffUnnwantedValue("test1.f", ".f"));
		
		
		
//		System.out.println("" + striptOutUnnwantedValue(""));
//		System.out.println("test1,..." + striptOutUnnwantedValue("test1,"));
//		System.out.println("CAA WS dated 04/28/2012<br>PN by Admissions Co-ordinator on 04/27/2012<br>abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwx..." + striptOutUnnwantedValue("CAA WS dated 04/28/2012<br>PN by Admissions Co-ordinator on 04/27/2012<br>abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwx"));
//		System.out.println("PN by Restorative on 04/28/2012<br>..." + striptOutUnnwantedValue("PN by Restorative on 04/28/2012<br>"));
//		System.out.println("CAA WS dated 4/24/2012<br>PN by Activities aide on 04/24/2012<br>..." + striptOutUnnwantedValue("CAA WS dated 4/24/2012<br>PN by Activities aide on 04/24/2012<br>"));


		//33. compare dates (comparison of two Date)
//		compareTwoDates(new Date(), new Date());
//		compareTwoDates(new Date("Tue Apr 24 16:14:38 EDT 2012"), new Date("Tue Apr 24 16:14:38 EDT 2012"));
	
		//34. search in the String array
//		String[] stringArrray = {"abc", "abcd", "abcde"};
//		searchMatchInStringArray(stringArrray, "abc");
		
		//35. Display short form in case the text is very long
		//System.out.println("testing12345678901234567890..." + DisplayShortForm("testing12345678901234567890"));
		//System.out.println("testi..." + DisplayShortForm("testi"));
		
		//36. Bitwise test
		//System.out.println("And Bitwise Testing true/true..." + AndBitWise(true, true));
		//System.out.println("And Bitwise Testing false/true..." + AndBitWise(false, true));
		//System.out.println("And Bitwise Testing true/false..." + AndBitWise(true, false));
		//System.out.println("And Bitwise Testing false/false..." + AndBitWise(false, false));
		
		//37. int[] array testing
		//System.out.println("Looking for label1's value..." + findArrayIndex("label1"));
		//System.out.println("Looking for label3's value..." + findArrayIndex("label3"));
		//System.out.println("Looking for label99's value..." + findArrayIndex("label99"));
		
		//38.Summaries
		//String[] qiList = new String[]{"qi1", "qi2", "qi3_hi", "qi3_lo", "qi4", "qi5", "qi6", "qi7", "qi8_hi", "qi8_lo", "qi9", "qi10", "qi11", "qi12"};
		//resultSetSummaries(qiList);
		
		//39. Map.Entry, entrySet, etc
		//mapWithObjectValue();
		//iterateMap();
		
		//40. check empty string length
		//checkStringLength("abc");
		//checkStringLength("");
		
		//41. delimeters
//		String stringWithDelimeters = "73558|300094477"; //2
//		countDelimiters(stringWithDelimeters, "\\|");
//		stringWithDelimeters = "73558||aaaaa|fdd"; //4
//		countDelimiters(stringWithDelimeters,"\\|");
//		stringWithDelimeters = "73558||aaaaa|\"\"|fdd"; //5
//		countDelimiters(stringWithDelimeters, "\\|");
//		stringWithDelimeters = "73558|300094477|20120529|12:48:20||\"Elizabeth\"|\"\"|\"Glass\"|\"\"|2|19451214|0|\"\"|\"\"|\"\"|300094477||73558|1|73558|5|||||||||||||||||||||||||||||||||||||||||||||||||\"304\"|\"Long\"|20120603|||||||||||||||||||||||||||||||||0|0|0|1|1|1|1|0|1|0|0|0|0|0|0||||||||||||||0||0|||||||0|0|0|1|0|0|0|1|1|1|0|0|0|0|0|0|1||0|0|0|0|0|0|0|0|0|0|||||||||||||||||||||0|0|0|0|0|0|2|2|2|2|4|2|2|2|2|1|0|2|2|2|3||0|0|2|1|0|0|0|0|0|0|0|0|0|0||||||0|0||||1|0|||||||1|1|||0|0|1|0|0|0|0|||1||0|0||1||||||||||||0|||||0|0|1|1|0|0|||0|||||1|0|||0|||||||||0|||||1|0|0|0|0|0|0|0|0|0|0|0|0|||\"Blind\"|1||\"#right hip pinning\"|1||\"Stroke\"|1||\"\"|1||\"\"|1||\"\"|1|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|1|0||||||||||||0|0|0|0|1|1|0|0|0|0|1||0|160|40|0|0|0|0|0|1|0|0||||||1|0||||||||||0|0|0|0|0|0||0|0|0|0|0|0|0|1|0|1|0|0|0|0|0|1|0|0|1|0|0|1|0|0|0|1|1|1|0|1|||||||||||||||||||||15||0|0|0|7|0|0||0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|1|0|0|0|0|0|0|0|0|0|0|||||||||2|2|0|0|0|0|0|0|0|0|0|0|1|0|0|0|||1|0|||||0||||\"\"|||||\"acetaminophen 325mg\"|1|3D|2||00544981|||||||||||||||||||||||||||||||||||||\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"||\"\"||0|1|0|1|0|0|0|1|0|1|0|1|1|1|0|1|0|0|0|1|0|0|0|1|0|1|0|1|0|1|0|1|0|1|0|1|0|1|0|1|0|0|0|1|0|1|0|1|0|1|0|1|0|0|0|1|1|0|2|6|8|3|PA1|0.51000|67|20120715|20120606";
//		countDelimiters(stringWithDelimeters, "\\|");
//		stringWithDelimeters = "73558|590051318|20120529|12:49:07||\"Mary\"|\"\"|\"Jones\"|\"\"|2|19251220|0|\"\"|\"\"|\"\"|590051318||73558|1|73558|2|||||||||||||||||||||||||||||||||||||||||||||||||\"316\"|\"Balf\"|20120603|||3|||1|0|0|0|0|0||||||0|0|0|1|0|0|0|0|1|0|0|0|0|0|0||0|0|0|1|1|1|1|0|1|0|0|0|0|0|1|0|0|0|0|0|1|1|0|0|0|0|0|0|0|0|0|0|0|0|0||1|0|0|0|1|0|0|0|1|2|1|0|0|0|0|0|0|1|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|1|0|1|0|1|0|0|0|0|0|0|0|0|0|0|1|4|3|4|3|8|8|8|8|0|0|3|2|4|2|0|0|4|3|4|2|4|3|3|0|0|0|2|1|0|0|2|1|2|1|0|0|0|1|1|1|0|0|1|0|1|0|0|0|0|0|0|1|0|2|1|4|0|0|0|0|1|0|0|0|0|0|0|1|0|0|0|0|0|0|0|0|0|1|0|1|0|0|0|0|0|0|0|0|0|0|0|1|0|0|0|0|0|0|0|0|0|0|1|0|0|0|0|0|0|0|0|0|0|0|0|0|||||1|0|0|0|0|0|0|0|0|1|0|0|0|||\"Congestive Heart Failure\"|1||\"Severe Aoortic Stenosis\"|1|401.9|\"UNSPECIFIED ESSENTIAL HYPERTENSION\"|1||\"\"|1||\"\"|1||\"\"|1|0|1|0|0|0|0|0|0|0|0|0|1|1|0|0|0|0||||||||||||0|0|0|0|1|1|0|0|0|0|0|0|1|168|119|9|0|0|0|0|1|0|0|0|0|0|0|0|0|1|||0|1|0|0|0|1|0|0|0|0|0|0|0|0|1|0|0|1|0|0|0|0|1|1|0|0|0|0|0|0|0|0|1|0|0|1|0|0|0|1|1|1|0|1|1|1|0|0|0|0|0|1|1|0|1|0|0|0|0|1|0|0|0|0|15|0|0|0|0|7|0|7||0|0|0|0|1|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|||0|0|0|0|0|1|2|2|0|0|0|0|0|0|0|0|0|2|1|0|0|0|0|1|2|2|1|0|0|0|2|0|0|0|\"\"|||||\"acetaminophen 325mg\"|1|3D|2||00544981|0|1|0|0|1|1|1|1|0||||||||||0|1|0|0|1|1|1|1|0||||||||||\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|20120605|\"\"|20120605|0|1|0|1|0|0|0|1|0|1|0|1|1|1|0|1|0|0|1|1|0|0|0|1|0|1|0|1|0|1|0|1|0|1|0|1|1|1|0|1|0|0|0|1|0|1|0|1|0|1|0|1|0|1|0|0|1|2|3|8|20|4|CB2|1.00000|87|20120715|20120611";			
//		countDelimiters(stringWithDelimeters, "\\|");
//		stringWithDelimeters = "73558|590051318|20120529|12:49:07||\"Mary\"|\"\"|\"Jones\"|\"\"|2|19251220|0|\"\"|\"\"|\"\"|590051318||73558|1|73558|2|||||||||||||||||||||||||||||||||||||||||||||||||\"316\"|\"Balf\"|20120603|||3|||1|0|0|0|0|0||||||0|0|0|1|0|0|0|0|1|0|0|0|0|0|0||0|0|0|1|1|1|1|0|1|0|0|0|0|0|1|0|0|0|0|0|1|1|0|0|0|0|0|0|0|0|0|0|0|0|0||1|0|0|0|1|0|0|0|1|2|1|0|0|0|0|0|0|1|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|1|0|1|0|1|0|0|0|0|0|0|0|0|0|0|1|4|3|4|3|8|8|8|8|0|0|3|2|4|2|0|0|4|3|4|2|4|3|3|0|0|0|2|1|0|0|2|1|2|1|0|0|0|1|1|1|0|0|1|0|1|0|0|0|0|0|0|1|0|2|1|4|0|0|0|0|1|0|0|0|0|0|0|1|0|0|0|0|0|0|0|0|0|1|0|1|0|0|0|0|0|0|0|0|0|0|0|1|0|0|0|0|0|0|0|0|0|0|1|0|0|0|0|0|0|0|0|0|0|0|0|0|||||1|0|0|0|0|0|0|0|0|1|0|0|0|||\"Congestive Heart Failure\"|1||\"Severe Aoortic Stenosis\"|1|401.9|\"UNSPECIFIED ESSENTIAL HYPERTENSION\"|1||\"\"|1||\"\"|1||\"\"|1|0|1|0|0|0|0|0|0|0|0|0|1|1|0|0|0|0||||||||||||0|0|0|0|1|1|0|0|0|0|0|0|1|168|119|9|0|0|0|0|1|0|0|0|0|0|0|0|0|1|||0|1|0|0|0|1|0|0|0|0|0|0|0|0|1|0|0|1|0|0|0|0|1|1|0|0|0|0|0|0|0|0|1|0|0|1|0|0|0|1|1|1|0|1|1|1|0|0|0|0|0|1|1|0|1|0|0|0|0|1|0|0|0|0|15|0|0|0|0|7|0|7||0|0|0|0|1|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|||0|0|0|0|0|1|2|2|0|0|0|0|0|0|0|0|0|2|1|0|0|0|0|1|2|2|1|0|0|0|2|0|0|0|\"\"|||||\"acetaminophen 325mg\"|1|3D|2||00544981|0|1|0|0|1|1|1|1|0||||||||||0|1|0|0|1|1|1|1|0||||||||||\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|\"\"|20120605|\"\"|20120605|0|1|0|1|0|0|0|1|0|1|0|1|1|1|0|1|0|0|1|1|0|0|0|1|0|1|0|1|0|1|0|1|0|1|0|1|1|1|0|1|0|0|0|1|0|1|0|1|0|1|0|1|0|1|0|0|1|2|3|8|20|4|CB2|1.00000|87|20120715|20120611";
//		countDelimiters(stringWithDelimeters, "\\|");

		//42. variable arguments, varargs
		//varArgs("agr1, ", "1");
		//varArgs("agr1, ", "1", " agr2, ", "2");
		
		
		//43. iterate collections arraylist
		//iterateExample();
		
		//44. split Strings and return to next line
//		String test1 = "In an effort to help Providers analyze hospital transfers and identify opportunities to reduce transfers that might be preventable the Quality Improvement (QI) Tools are added to the Hospital Portal.  The QI Tools consist of a Hospital Transfer QI Re";
//		splitStringsReturnToNextLine(test1, " ");
//		String test2 = "In an effort to help Providers analyze hospital transfers and identify opportunities to reduce transfers";
//		splitStringsReturnToNextLine(test2, " ");
//		String test3 = " ";
//		splitStringsReturnToNextLine(test3, " ");

		//45. just another round of testing with variable String arrays
		/*
		String test1 = "In an effort to help Providers";
		reformatFreeFormEntriesIntoMultipleLines(test1, " ", 2);
		String test2 = "In an effort to help Providers analyze hospital transfers and identify opportunities to reduce transfers that might be preventable the Quality Improvement (QI) Tools are added to the Hospital Portal.  The QI Tools consist of a Hospital Transfer QI Re";
		reformatFreeFormEntriesIntoMultipleLines(test2, " ", 2);
		reformatFreeFormEntriesIntoMultipleLines(test2, " ", 3);
		*/
//		String test2 = "In an effort to help Providers analyze hospital transfers and identify opportunities to reduce transfers";
//		String test3 = " ";
//		splitStringsReturnToNextLine(test3, " ");
		
		
		//Vector, ArrayList testing
		//vectorVsArrayList();
		
		//json jackson gson etc
		//KardexReportRequest obj = new KardexReportRequest();
		//obj.setClientId("1234");
		//jsonUsingGson(obj);
		//jsonUsingJackson(obj);
		
		//DataObject obj1 = new DataObject();
		//jsonUsingGson(obj1);
	
		/*
		ResidentListRequest obj2 = new ResidentListRequest();
		AssignmentSelectionCurrent assignSelection = new AssignmentSelectionCurrent();
		obj2.setAssignSelection(assignSelection);
		jsonUsingJackson(obj2);
*/		
		
		/*
		DocumentTaskRequest obj2 = new DocumentTaskRequest();
		obj2.setDocumentTask(new DocumentTask());
		
		
		List<TaskResponse> taskResponseList = new ArrayList<TaskResponse>();

		TaskResponse taskResponse = new TaskResponse();
		taskResponse.setPainadDetails(new PainadDetailsVO());
		taskResponseList.add(taskResponse);
		obj2.setTaskResponses(taskResponseList);
		*/
		//jsonUsingJackson(obj2);
		
		//Time zone
		//timeZone();
		//timeZone2();
		
		//46. Unix Epoch time
		//Long epochTime = 1418134800L;
		//convertUnixEpochTime("1418134800");
		//convertUnixEpochTime("300");
		
		
		
		
		//Final modifier
		//finalModifier(true);
		//finalModifier(false);
		
		//concurrentHashMapTest();
		
		//stringImmutableTest();
		
//		jodaTimeTest();
		//jodaTimeConstructor();
		
		//IngeterComparison();
		
		
 }
	
    private static void collectionEmptyList() {
        
        List<String> test1 = Collections.emptyList();
        List<Integer> test2 = Collections.emptyList();
        
        Integer[] test3 = {1};
        
        List<Integer> test4 = Arrays.asList(test3);
        
        System.out.println("collectionEmptyList testing...");
    }

	private static void IngeterComparison() {
		Integer a = 1;
		
		//Because of Integer autoboxing, no need to convert to int value like second clause
		if (a == 1) {
			System.out.printf("Good\n");
		}

		if (a.intValue() == 1) {
			System.out.printf("Good too \n");
		}
		
		Integer b = 4;
		Integer c = 4;
		if (b == c) {
			System.out.printf("Even better");
		}
		
		Integer d = 5;
		Integer e = 5;
		if (d.equals(e)) {
			System.out.printf("Use this way. Best approach");
		}
	}

	/**
	 * DateTime - Immutable replacement for JDK Calendar
	* DateMidnight - Immutable class representing a date where the time is forced to midnight
	* LocalDate - Immutable class representing a local date without a time (no time zone)
	* LocalTime - Immutable class representing a time without a date (no time zone)
	* LocalDateTime - Immutable class representing a local date and time (no time zone)
	 */
	private static void jodaTimeConstructor() {
		DateTime dateTime = null;
		dateTime = new DateTime(2015, 4, 2, 0, 0, 0, 0);
		System.out.println("dateTime1 = " + dateTime);
	 
        //
        // Create DateTime object from JDK's Date milliseconds.
        //
        Date date = new Date();
        dateTime = new DateTime(date.getTime());
        System.out.println("dateTime2 = " + dateTime);
 
        
        //
        // Create DateTime object from JDK's Calendar object.
        //
        Calendar calendar = Calendar.getInstance();
        dateTime = new DateTime(calendar);
        System.out.println("dateTime3 = " + dateTime);
		
        
        //
        // Create DateTime object from string. The format of the
        // string  should be precise.
        //
        dateTime = new DateTime("2015-04-03T14:15:00.000+01:00");
        System.out.println("dateTime4 = " + dateTime);
        dateTime = new DateTime("2015-04-03");
        System.out.println("dateTime5 = " + dateTime);
        
        
        
	}

	private static void jodaTimeTest() {
		
		LocalDate date1 = new LocalDate("2015-04-12");  //this is default
		System.out.println("date1..." + date1);
		//System.out.println("date..." + date.toDate());
		
		
		//if date format is different, then use this way
		LocalDate date2 = LocalDate.parse("6/25/2015", DateTimeFormat.forPattern("MM/dd/yyyy"));
		System.out.println("date2..." + date2);
		
              LocalDate date3 = new LocalDate().minusDays(1);
              
              
              System.out.println("date3..." + date3);
              System.out.println("converted to java.util.date..." + date3.toDate());
              
              
		DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime dateTime1 = LocalDateTime.parse("2015-04-12 00:00:00", fmt);

		System.out.println("dateTime1..." + dateTime1);
		System.out.println("dateTime1.." + dateTime1.toDate());
		System.out.println("dateTime1..." + dateTime1.toLocalDate());
		
		DateTime now = new DateTime();
		DateTime test1 = now.minusDays(10);
        
	}

	private static void stringImmutableTest() {
		
		String test1 = new String("test1");
		String test2 = "test2";
		
		System.out.println("test1..." + test1);
		System.out.println("test2..." + test2);
		
		
		test1 = "newone";
		test2 = "newtwo";
		
		System.out.println("test1..." + test1);
		System.out.println("test2..." + test2);
		
		
		
	}

	private static void concurrentHashMapTest() {
		
		//ConcurrentHashMap
        Map<String,String> myMap = new ConcurrentHashMap<String,String>();
        myMap.put("1", "1");
        myMap.put("2", "1");
        myMap.put("3", "1");
        myMap.put("4", "1");
        myMap.put("5", "1");
        myMap.put("6", "1");
        myMap.put("6", "2222"); ////When you put into the same key value, it will overwrite
        System.out.println("ConcurrentHashMap before iterator: "+myMap);
        int size = myMap.size();
        Iterator<String> it = myMap.keySet().iterator();
 
        while(it.hasNext()){
            String key = it.next();
            if(key.equals("3")) myMap.put(key+"new", "new3");
        }
        System.out.println("ConcurrentHashMap after iterator: "+myMap);
 
        //HashMap
        myMap = new HashMap<String,String>();
        myMap.put("1", "1");
        myMap.put("2", "1");
        myMap.put("3", "1");
        myMap.put("4", "1");
        myMap.put("5", "1");
        myMap.put("6", "1");
        myMap.put("6", "333"); //When you put into the same key value, it will overwrite
        System.out.println("HashMap before iterator: "+myMap);
        Iterator<String> it1 = myMap.keySet().iterator();
 
        /*
        while(it1.hasNext()){
            String key = it1.next();
            if(key.equals("3")) myMap.put(key+"new", "new3");
        }
        */
        System.out.println("HashMap after iterator: "+myMap);
		
	}

	private static void timeZone2() {
		long aRandomTimeSinceTheEpoch = 1419391252;

		String TIMEZONE_SYDNEY_AUSTRALIA = "Australia/Sydney";
		DateTimeZone sydneyTimeZone = DateTimeZone.forID(TIMEZONE_SYDNEY_AUSTRALIA);
		Chronology chronologySydney = GJChronology.getInstance(sydneyTimeZone);

		String PACIFIC_TIME_ZONE = "America/Los_Angeles";
		DateTimeZone pacificTimeZone = DateTimeZone.forID(PACIFIC_TIME_ZONE);
		Chronology chronlogyPacific = GJChronology.getInstance(pacificTimeZone);
		
		String TIMEZONE_NEWYORK = "America/New_York";
		DateTimeZone newYorkTimeZone = DateTimeZone.forID(TIMEZONE_NEWYORK);
		Chronology chronologyNewYork = GJChronology.getInstance(newYorkTimeZone);

		DateTime pacificDateTime = new DateTime(aRandomTimeSinceTheEpoch, chronlogyPacific);
		DateTime newYorkDateTime = new DateTime(aRandomTimeSinceTheEpoch, chronologyNewYork);

		if( newYorkDateTime.isBefore(pacificDateTime) ){
		    System.out.println("is before");
		} else if (newYorkDateTime.isEqual(pacificDateTime)) {
		    System.out.println("actually same");
		}
	}

	/*
	private static void convertUnixEpochTime(String epochTime) {
//		DateTime date = new DateTime((long)epochTime * 1000L);
		
		DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm");
		
		fmt.print(Long.parseLong(epochTime) * 1000L);
		System.out.println(fmt.print(Long.parseLong(epochTime) * 1000L));
		
		
//		fmt.print((long)epochTime * 1000L);
//		System.out.println(fmt.print((long)epochTime * 1000L));
		
		
	}
	*/


	private static void finalModifier(boolean original) {
		final boolean newOne = original;
		System.out.println("original..." + original + ", newOne..." + newOne);
	}


	private static void timeZone() throws ParseException {
		// TODO Auto-generated method stub
		
		DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
		String string1 = "2001-07-04T12:08:56.235-0700";
		Date result1 = df1.parse(string1);
		System.out.println(result1);
		
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //"yyyy-MM-dd'T'HH:mm:ss.SSS");
		String string2 = "2014-09-22 14:07:00";
		Date result2 = df2.parse(string2);		
		System.out.println(result2);
		
	}

	/*
	private static void jsonUsingGson(Object obj) {
		Gson gson = new Gson();
		String json = gson.toJson(obj);
		System.out.println(json);

		Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
		String json2 = gson2.toJson(obj);
		System.out.println(json2);
		
	}
	
	private static void jsonUsingJackson(Object obj) {
		try {
			ObjectMapper mapper = new ObjectMapper();

			System.out.println(mapper.writeValueAsString(obj));
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/

	private static void iterateExample() {
		  ArrayList<String> arrayList = new ArrayList<String>();
		   
		    //Add elements to Arraylist
		    arrayList.add("1");
		    arrayList.add("2");
		    arrayList.add("3");
		    arrayList.add("4");
		    arrayList.add("5");
		    
		    //get an Iterator object for ArrayList using iterator() method.
		    Iterator<String> itr = arrayList.iterator();
		   
		    //use hasNext() and next() methods of Iterator to iterate through the elements
		    System.out.println("Iterating through ArrayList elements...");
		    while(itr.hasNext())
		      System.out.println(itr.next());
	}

	private static void varArgs(Object...args) {
		for (Object arg : args) System.out.print(arg);
	    
		System.out.println();	
		
	}

	private static void countDelimiters(String str, String delimeter) {
		String[] strArrays = str.split(delimeter);
		System.out.println("Number of delimeter in string with " + delimeter +  "..." + strArrays.length);
	}

	private static void checkStringLength(String str) {
		System.out.println("Length of " + str + "..." + str.length());
		
	}

	private static void iterateMap() {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        map.put(1, 100);
        map.put(2, 200);
        map.put(2, 400);
        map.put(3, 300);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        
        //retrieving only values
        Collection<Integer> values = map.values();
        for (Integer a : map.values()) {
        	System.out.println(a);
        }
        
        //converting to ArrayList
        List<Integer> test2 = new ArrayList<Integer>(values);
        for (Integer b : test2) {
        	System.out.println(b);
        }
        

	}
	private static void mapWithObjectValue() {
		  //Create test data
		  Map<String, String[]> alertlist = new LinkedHashMap<String, String[]>();
	      String [] values1 = {"description1", "module1"};
	      alertlist.put("1",values1);

	      String [] values2 = {"description2", "module2"};
	      alertlist.put("2",values2);
	      
	      String [] values3 = {"description3", "module3"};
	      alertlist.put("3",values3);
	      
	      //One way to retrieve values out of map collection
          Object[] keyValue = alertlist.entrySet().toArray();
          for (int i = 0; i < keyValue.length; i++)
          {
             Map.Entry<String, String[]> entry = (Map.Entry<String, String[]>) keyValue[i];
             String alertId = entry.getKey().toString();
             String description = ((String []) entry.getValue())[0];
             String alertModuleType = ((String []) entry.getValue())[1];
          }
          
	      //Another way to retrieve values directly if you know the map key
          String[] getValue2 = alertlist.get("2");
          System.out.println("value2..." + getValue2[0] + "," + getValue2[1]);
          String[] getValue3 = alertlist.get("3");
          System.out.println("value3..." + getValue3[0] + "," + getValue3[1]);
          
          
	}

	private static void resultSetSummaries(String[] qiList, Object obj) {
//		for (int qi=0; qi<qiList.length; qi++)
//	    {
//	    	sumOfQiList[qi] += Integer.parseInt(maList.getFieldValue(qiList[qi]));
//	    }
//		
//		for (int qi=0; qi<qiSummaryList.length; qi++)
//	    {
//		    sumOfQiSummaryList[qi] += Integer.parseInt(maList.getFieldValue(qiSummaryList[qi]));
//	    }
		
		int[] sum = new int[qiList.length];
		for (int qi=0; qi<qiList.length; qi++)
	    {
	    	sum[qi] += Integer.parseInt(qiList[qi]);
	    }
		
		Integer i1 = new Integer(3);
		Integer i2 = new Integer(4);
		i1 += i2;
		
		
		
		
	}

	private static Integer findArrayIndex(String str) {
		
		String[] labelArray = new String[]{"label1", "label2", "label3", "label4"};
		Integer[] valueArray = new Integer[]{100,200,300,400};
		int strArrayIndex = -1;
		
		//We want to find out value from the same location.
		for (int qi=0; qi<labelArray.length; qi++)
	    {
			if (labelArray[qi].equalsIgnoreCase(str)) {
				strArrayIndex = qi;
				break;
			}
	    }
		if (strArrayIndex >= 0)
			return valueArray[strArrayIndex];

		return null;

	}

	private static boolean AndBitWise(boolean a, boolean b) {
		
		boolean complete;
		
		complete = bitWiseMethod(a) && bitWiseMethod(b);
		return complete; 
		
	}


	private static boolean bitWiseMethod(boolean a) {
		return a;
	}
	
	



	private static String DisplayShortForm(String originalString) {
		if (originalString != null && originalString.length() > 10) {
			return originalString.subSequence(0, 10) + "...";
		}
		return originalString;
		
	}





	private static void searchMatchInStringArray(String[] strArray,
			String searchTerm) {
		
		//String[] strArray = {"abcd", "abdc", "bcda"};
		for (String s : strArray)
		    if (s.trim().equalsIgnoreCase(searchTerm.trim()))
		        System.out.println("word is found in string array..." + s);		
	}





	private static void compareTwoDates(Date date1, Date date2) {
		// TODO Auto-generated method stub

		long d1 = date1.getTime();
		long d2 = date2.getTime();
		
		if (d1 != d2) {
			System.out.println("Two are diffent date" + date1 + " , " + date2);
		} else {
			System.out.println("Two are same date" + date1 + " , " + date2);
		}
		
		
		
	}





	private static String striptOutUnnwantedValue(String documentation) {
		String simpleName = "";
		try {
			simpleName = documentation.replaceAll("<br>", ", ").replaceAll("dated", "").trim();
			
			System.out.println(simpleName.indexOf(","));
			System.out.println(simpleName.lastIndexOf(","));
			int indexOfLastChar = simpleName.length() -1;
			if (simpleName.lastIndexOf(",") == indexOfLastChar) {
				return simpleName.substring(0, indexOfLastChar);
			} else {
				return simpleName;
			}
		} catch (Exception ex) {
			
		}
		return documentation;
		
	}

	private static String trimOffUnnwantedValue(String originalStr, String unwantedStr) {
		try {
			int unwantedIndex = originalStr.indexOf(unwantedStr);
			
			return originalStr.substring(0, unwantedIndex);
		} catch (Exception ex) {
			
		}
		return originalStr;
		
	}




	private static void genericTest() {
	
		ArrayList<String> strArr = new ArrayList<String>();
		
		strArr.add("abc");
		
		Integer intA = new Integer(123);
		
		
		strArr.add(String.valueOf(intA));
//		strArr.add((String)intA); //Can not cast from Integer to String
		
		
	}
















public static String readableFormatBySpace(String original, int number) {
	 
	 //1. input validation
	 if ( number <= 1 ) return original;
	 if ( original == null || original.trim().length() < number  ) return original;
	 
	 String nweFormat = "";
	 
	 int size = original.length();
	 int total = size / number;
	 int i = 0;
	 int remainder = 0;
	 remainder = size - (total * number);

	 /*
	 if ( size % 3 == 0  ) {
		 total = size / 3;
	 } else {
		 total = size / 3 + 1;
	 }
	  */

	 //2. add up as much as you can
	 for (i=0; i<total;i++) {
		 nweFormat = nweFormat + " " + original.substring(i*number, i*number+number);
	 }
	 
	 //3. add up remainder
	 if ( remainder > 0 ) {
		 nweFormat = nweFormat + " " + original.substring(total * number);
	 }
	 
	 System.out.println( nweFormat.trim() );
	  
	 return nweFormat.trim();
  } //public static String readableFormatBySpace(String original, int number) {
  
  
  
  public static void whileContinueTest() {

//	  boolean stop = false;
	  int i = 0;
	  while (i <= 10) {
		  
		  i++;
		  if ( i % 3 == 0) continue;

		  System.out.println("test..." + i);
		  
		  
	  }
	  
  }
  
  public static void getAvailableFontFamilyNames() {
	  GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
	  String[] fontnames = e.getAvailableFontFamilyNames();
	  System.out.println("\nFonts available on this platform: ");
	  for (int i = 0; i < fontnames.length; i++)
	    System.out.println(fontnames[i]);

  }

  
	public static String[] parseBarCode(String originalBarCode, boolean bShipperNumIncluded) {
		String [] parsedBarCode = new String[]{"","",""}; //service type, shipper number, reference num
		
		String oldBarCode = "";
		//at least the length should be 9 digit to extract shipper number
		if ( originalBarCode != null &&  originalBarCode.trim().length() >= 9) {
			oldBarCode = originalBarCode.trim();
			
			if ( bShipperNumIncluded ) {
				parsedBarCode[0] = oldBarCode.substring(0,1);
				parsedBarCode[1] = oldBarCode.substring(1,9);
				parsedBarCode[2] = oldBarCode.substring(9);
			} else {
				parsedBarCode[0] = oldBarCode.substring(0,1);
				parsedBarCode[1] = "";
				parsedBarCode[2] = oldBarCode.substring(1);
			}
		// if smaller than 9 digit, we don't worry about shipper number in it
		} else if ( originalBarCode != null &&  originalBarCode.trim().length() < 9 && originalBarCode.trim().length() >= 1) {
			oldBarCode = originalBarCode.trim();
			parsedBarCode[0] = oldBarCode.substring(0,1);
			parsedBarCode[1] = "";
			parsedBarCode[2] = oldBarCode.substring(1);
		}
		
		System.out.println("parsing old barcode..." + originalBarCode + "," + bShipperNumIncluded);
		System.out.println("parsing new barcode..." + parsedBarCode[0] + "," + parsedBarCode[1] + "," + parsedBarCode[2]);

		return parsedBarCode;
		
		
		
	} //public static String[] parseBarCode(String originalBarCode, boolean bShipperNumIncluded) {
	
	
	public static String getShipperNumFromBarCode(String originalBarCode, String originalShipperNum) { //, boolean bShipperNumIncluded) {
//		String [] parsedBarCode = new String[]{"","",""}; //service type, shipper number, reference num
		
		String oldBarCode = "";
		String shipperNum = "";
		
		if ( originalBarCode.trim().length() < 9 ) {
			return shipperNum;
		}

		if ( originalShipperNum.trim().length() == 8 ) {
			shipperNum = originalShipperNum.trim();
			return shipperNum;
		}

		oldBarCode = originalBarCode.trim().toUpperCase();
		
		if ( oldBarCode.charAt(0) == 'D' || oldBarCode.charAt(0) == 'K' ) {
			shipperNum = oldBarCode.substring(1,9);
		} else if ( oldBarCode.charAt(0) == 'G') {
			shipperNum = "";
		}
		
		System.out.println("parsing old barcode..." + originalBarCode + "," + originalShipperNum);
		System.out.println("parsing new barcode..." + originalBarCode + "," + shipperNum);

		return shipperNum;
		
		
		
	} //public static String[] parseBarCode(String originalBarCode, boolean bShipperNumIncluded) {

	
	/*
	 * Validate date again any unusual cases such as very big or very big future years
     * @param date 'MM/dd/yyyy'
     * @return false if it is not usual date(11/20/3000). MAX_YEAR is counted from 1900
     * Unfortunately I assumed any system won't last 1000 years. Not acceptable, then go for it.
	 */
	public static boolean isValidDate(String date) {
		if (date == null || date.trim().length() <= 0 ) {
			return false;
		}
		
		Date dt2;
		try {
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);

			df.setLenient(false);  // this is important!
			dt2 = df.parse( date.trim() );

			//It's quite interesting here. 
			// Very old year like 11/20/1700 or very future year like 11/20/20077 will blow up 
			// in the stored procedure call. The Sybase Stored Procedures don't like
			// old year or big year. Aha. 
			// so I added here extra line of code.
			if ( dt2.getYear() <= MIN_YEAR || dt2.getYear() >= MAX_YEAR) {
				return false;
			}

			
		} catch (Exception e) {
			return false;
		}
		
		return true;
		
		
	}


	/*
	 * This is more generic data validation function
	 */
	public static boolean isValidDate2(String sDate, String format) {
		if (sDate == null || sDate.trim().length() <= 0 ) {
			return false;
		}
		
		try {
			DateFormat df = new SimpleDateFormat(format); //"yyyy-MM-dd HH:mm"); //yyyy-MM-dd");
			df.setLenient(false);  // this is important!
			Date dt1 = df.parse( sDate );

		} catch (Exception e) {
			return false;
		}
		
		return true;
	}
	
	
	public static int getDaysOfWeek(String strDate) {

		int weekday = -1;
		Date dt;
		
		try {
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);

			df.setLenient(false);  // this is important!
			dt = df.parse( strDate.trim() );
			
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(dt);
			
			//Java returns 1 for Sunday, 2 for Monday, ... 7 for Saturday
			weekday = calendar.get(Calendar.DAY_OF_WEEK);
			weekday--;

//			System.out.println(calendar.getTime().toString());
//			System.out.println("Weekday: " + weekday);
//			System.out.println();
			
		} catch (Exception e) {
			
		}
		
		return weekday;
		

	} //	public static int getDaysOfWeek(String strDate) {

	
	public static int calcualteServiceDay(int iShippingDateWeekOfDay, String sWeek1, String sWeek2) {

		int iWeekOneServiceDay = 5;
		int iWeekTwoServiceDay = 0;
		int iTotalServiceDay = 0;
		String sShippingDateWeekOfDay = "";
		
		boolean bLocateWeekOneServiceDay = false;
		boolean bLocateWeekTwoServiceDay = false;
		
		System.out.println("calcualteServiceDay parameters..." + iShippingDateWeekOfDay + ">>>" + sWeek1 + ",>>>" + sWeek2);
		
		sShippingDateWeekOfDay = String.valueOf(iShippingDateWeekOfDay);
		
		String arrWeekOne[] = { "", "", "", "", "" };
		String arrWeekTwo[] = { "", "", "", "", "" };

		//1. initialize arrWeek1[] and arrWeek2[] 
		for(int i = 0; i < sWeek1.trim().length();i++){
			arrWeekOne[i] = sWeek1.trim().substring(i,i+1);
		} //for(int i = 0; i < sWeek1.trim().length();i++){

		
		for(int i = 0; i < sWeek2.trim().length();i++){
			arrWeekTwo[i] = sWeek2.trim().substring(i,i+1);
		} //for(int i = 0; i < sWeek2.length();i++){

		//2. sorting arrays to make sure it is arrayed properly
		java.util.Arrays.sort(arrWeekOne);
		java.util.Arrays.sort(arrWeekTwo);
		
		
		//3. loop through arrWeekOne[] to find out the service day
		for(int i = 0; i < arrWeekOne.length;i++){
			
			if ( sShippingDateWeekOfDay.equals( arrWeekOne[i] ) ) {
				iWeekOneServiceDay = 0;
				bLocateWeekOneServiceDay = true;
				break;
			}
			
			if ( arrWeekOne[i].length() > 0 &&
				 Character.isDigit( arrWeekOne[i].charAt(0)) ) {
				if ( Integer.parseInt(arrWeekOne[i]) > iShippingDateWeekOfDay ) {
					bLocateWeekOneServiceDay = true;
					iWeekOneServiceDay = Integer.parseInt(arrWeekOne[i]) - iShippingDateWeekOfDay;
					break;
				}
			}
			
		} //for(int i = 0; i < arrWeekOne.length;i++){

		//4. If could not be located service day in arrWeekOne, then find out the day's difference
		if ( bLocateWeekOneServiceDay != true) {
			iWeekOneServiceDay = iWeekOneServiceDay - iShippingDateWeekOfDay;
		}
		
		//5. If could not be located service day in arrWeekOne, then we need to check in arrWeekTwo
		if ( bLocateWeekOneServiceDay != true) {
			
			for(int i = 0; i < arrWeekTwo.length;i++){
				if ( arrWeekTwo[i].length() > 0 &&
					 Character.isDigit( arrWeekTwo[i].charAt(0)) ) {
					if ( Integer.parseInt(arrWeekTwo[i]) > 0 ) {
						bLocateWeekTwoServiceDay = true;
						iWeekTwoServiceDay = Integer.parseInt(arrWeekTwo[i]);
						break;
					}
				}
			} //for(int i = 0; i < arrWeekTwo.length;i++){
			
			//Most likely it would not happen, but if still not found in arrWeekTwo, then it should be six day
			if ( bLocateWeekTwoServiceDay != true) {
				iWeekTwoServiceDay = 6;
			}
			
		} //if ( bLocateServiceDay != true) {
		
		//6. sum up week1 and week2 service day 
		iTotalServiceDay = iWeekOneServiceDay + iWeekTwoServiceDay;

		System.out.println("calcualteServiceDay parameters..." + iShippingDateWeekOfDay + " " + iTotalServiceDay);
		
		return iTotalServiceDay;

//      for (String trackingNum : trackingNums) {
		

	} //public static int calcualteServiceDay(int iShippingDateWeekOfDay, String sWeek1, String sWeek2) {

	

	public static Date addDate(String strDate, int iNumberOfDay) {

		Date dt;
		Calendar calendar = Calendar.getInstance();
		
		try {
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);

			df.setLenient(false);  // this is important!
			dt = df.parse( strDate.trim() );
			
			System.out.println(dt.toString() + "  adding  " + iNumberOfDay);

			calendar.setTime(dt);
			
			calendar.add(Calendar.DATE, iNumberOfDay);
			
		} catch (Exception e) {
			
		}
		
		return calendar.getTime();
		

	} //public static Date addDate(String strDate, int iNumberOfDay) {
	

	
	/*
	 * there is bug around getting time
	 * 
	 */
	@Deprecated
	public static long daysDiff(String fromDate, String toDate) {

		Date dt1, dt2;
	    long diff = 0;
        long diffDays =0;

		try {
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);

			df.setLenient(false);  // this is important!
			dt1 = df.parse( fromDate.trim() );
			dt2 = df.parse( toDate.trim() );
			
		    long milis1 = dt1.getTime();
	        long milis2 = dt2.getTime();

	        diff = milis2 - milis1;
	        
	        diffDays = diff / (24 * 60 * 60 * 1000); //1 day = 86,400,000
	        
//		    System.out.println("Difference = " + diffDays + " days");

		} catch (Exception e) {
			
		}
		
		return diffDays;
		

	} //public static long daysDiff(String fromDate, String toDate) {


	public static long daysDiff2(String fromDate, String toDate) {

		Date dt1, dt2;
	    long diff = 0;
        long diffDays =0;

		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
        
		try {
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);

			df.setLenient(false);  // this is important!
			dt1 = df.parse( fromDate.trim() );
			dt2 = df.parse( toDate.trim() );
			
			cal1.set(Integer.parseInt(new java.text.SimpleDateFormat("yyyy").format(dt1)), 
					Integer.parseInt(new java.text.SimpleDateFormat("MM").format(dt1)),
					Integer.parseInt(new java.text.SimpleDateFormat("dd").format(dt1)));
			
			cal2.set(Integer.parseInt(new java.text.SimpleDateFormat("yyyy").format(dt2)), 
					Integer.parseInt(new java.text.SimpleDateFormat("MM").format(dt2)),
					Integer.parseInt(new java.text.SimpleDateFormat("dd").format(dt2)));
			
		    long milis1 = cal1.getTimeInMillis();
	        long milis2 = cal2.getTimeInMillis();

	        diff = milis2 - milis1;
	        
	        diffDays = diff / (24 * 60 * 60 * 1000); //1 day = 86,400,000
	        
		    System.out.println("Difference (" + fromDate + "~" + toDate + ")..." + diffDays + " days");

		} catch (Exception e) {
			
		}
		
		return diffDays;
		

	} //public static long daysDiff(String fromDate, String toDate) {
	
	
	  private final static long fONCE_PER_DAY = 1000*60*60*24;

	  private final static int fONE_DAY = 1;
	  private final static int fFOUR_AM = 4;
	  private final static int fZERO_MINUTES = 0;
	  
	public static Date getTomorrowMorning4am(){

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
	} //public static Date getTomorrowMorning4am(){
	
	

	/*
	 * @deprecated
	 */
	public static boolean isWorkableDayOld(int iDateWeekOfDay, String sWorkableDays) {

		String sShippingDateWeekOfDay = "";
		
		boolean bWorkingDay = false;
		
//		System.out.println("calcualteServiceDay parameters..." + iDateWeekOfDay + ">>>" + sWeek1 + ",>>>" + sWeek2);
		
		sShippingDateWeekOfDay = String.valueOf(iDateWeekOfDay);
		
		String arrWorkableDays[] = { "", "", "", "", "" };

		//1. initialize arrWeek1[] and arrWeek2[] 
		for(int i = 0; i < sWorkableDays.trim().length();i++){
			arrWorkableDays[i] = sWorkableDays.trim().substring(i,i+1);
		} //for(int i = 0; i < sWeek1.trim().length();i++){

		
		//2. sorting arrays to make sure it is arrayed properly
		java.util.Arrays.sort(arrWorkableDays);
//		java.util.Arrays.sort(arrWeekTwo);
		
		
		//3. loop through arrWeekOne[] to find out the service day
		for(int i = 0; i < arrWorkableDays.length;i++){
			
			if ( sShippingDateWeekOfDay.equals( arrWorkableDays[i] ) ) {
//				iWeekOneServiceDay = 0;
				bWorkingDay = true;
				break;
			}
			
//			if ( arrWorkingDays[i].length() > 0 &&
//				 Character.isDigit( arrWorkingDays[i].charAt(0)) ) {
//				if ( Integer.parseInt(arrWorkingDays[i]) > iDateWeekOfDay ) {
//					bWorkingDay = true;
//					break;
//				}
//			}
			
		} //for(int i = 0; i < arrWeekOne.length;i++){

		
		return bWorkingDay;

//      for (String trackingNum : trackingNums) {
		

	} //public static boolean isWorkableDayOld(int iDateWeekOfDay, String sWorkableDays) {

	public static boolean isWorkableDay(int iDateWeekOfDay, String sWeekValue) {

		String sShippingDateWeekOfDay = "";
		
		boolean bWorkingDay = false;
		
//		System.out.println("calcualteServiceDay parameters..." + iDateWeekOfDay + ">>>" + sWeek1 + ",>>>" + sWeek2);
		
		sShippingDateWeekOfDay = String.valueOf(iDateWeekOfDay);
		
		String arrWeekValue[] = { "", "", "", "", "" };

		//1. initialize arrWeek1[] and arrWeek2[] 
		for(int i = 0; i < sWeekValue.trim().length();i++){
			arrWeekValue[i] = sWeekValue.trim().substring(i,i+1);
		} //for(int i = 0; i < sWeek1.trim().length();i++){

		
		//2. sorting arrays to make sure it is arrayed properly
		java.util.Arrays.sort(arrWeekValue);
//		java.util.Arrays.sort(arrWeekTwo);
		
		
		//3. loop through arrWeekOne[] to find out the service day
		for(int i = 0; i < arrWeekValue.length;i++){
			
			if ( sShippingDateWeekOfDay.equals( arrWeekValue[i] ) ) {
//				iWeekOneServiceDay = 0;
				bWorkingDay = true;
				break;
			}
			
//			if ( arrWorkingDays[i].length() > 0 &&
//				 Character.isDigit( arrWorkingDays[i].charAt(0)) ) {
//				if ( Integer.parseInt(arrWorkingDays[i]) > iDateWeekOfDay ) {
//					bWorkingDay = true;
//					break;
//				}
//			}
			
		} //for(int i = 0; i < arrWeekOne.length;i++){

		
		return bWorkingDay;

//      for (String trackingNum : trackingNums) {
		

	} //public static boolean isWorkableDay(int iDateWeekOfDay, String sWorkableDays) {
	
	
	public static String convertingSimpleDateFormat(String sDate, String dateFormat) throws Exception {
		
		//String DATE_FORMAT2 = "MMM dd, yyyy"; //uppercase MM matters. should not be mm.
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(dateFormat);
		Date date1 = sdf.parse(sDate);

		return sdf.format(date1);
	}
	
	public static String convertingSimpleDateFormat2(String sDate, String dateFormat) throws Exception {
		
		Date myDate = new Date();
	    System.out.println(myDate);

	    SimpleDateFormat mdyFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm");
	    SimpleDateFormat dmyFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

	    // Format the date to Strings
	    String mdy = mdyFormat.format(myDate);
	    //String dmy = dmyFormat.format(sDate);

	    // Results...
//	    System.out.println(mdy);
//	    System.out.println(dmy);
	    // Parse the Strings back to dates
	    // Note, the formats don't "stick" with the Date value
//	    System.out.println(mdyFormat.parse(mdy));

	    return null;
	}
	

	public static String weekValueWording(String sWeek) {

		ResourceBundle messages = ResourceBundle.getBundle("MessageResources",java.util.Locale.getDefault());
		StringBuffer sWeekVerbiage = new StringBuffer("");
		
		String arrWeek[] = { "", "", "", "", "" };

		for(int i = 0; i < sWeek.trim().length();i++){
			arrWeek[i] = sWeek.trim().substring(i,i+1);
		} //for(int i = 0; i < sWeek1.trim().length();i++){

		
		//2. sorting arrays to make sure it is arrayed properly
		java.util.Arrays.sort(arrWeek);
		
		//3. loop through arrWeekOne[] to find out the service day
		for(int i = 0; i < arrWeek.length;i++){

			/*
			if (arrWeek[i] != null && arrWeek[i].trim().equalsIgnoreCase("1")) {
				sWeekVerbiage.append(messages.getString("serviceTime.1"));
			} else if (arrWeek[i] != null && arrWeek[i].trim().equalsIgnoreCase("2")) {
				sWeekVerbiage.append(messages.getString("serviceTime.2"));
			} else if (arrWeek[i] != null && arrWeek[i].trim().equalsIgnoreCase("3")) {
				sWeekVerbiage.append(messages.getString("serviceTime.3"));
			} else if (arrWeek[i] != null && arrWeek[i].trim().equalsIgnoreCase("4")) {
				sWeekVerbiage.append(messages.getString("serviceTime.4"));
			} else if (arrWeek[i] != null && arrWeek[i].trim().equalsIgnoreCase("5")) {
				sWeekVerbiage.append(messages.getString("serviceTime.5"));
			}
			*/
			
			if (arrWeek[i] != null && arrWeek[i].trim().length() > 0 ) {
				sWeekVerbiage.append(messages.getString("serviceTime." + arrWeek[i].trim()));
			}
			
			
		} //for(int i = 0; i < arrWeekOne.length;i++){


		
		return sWeekVerbiage.toString().substring(0, sWeekVerbiage.toString().trim().length() -1);


	} //public static String weekValueWording(String sWeek) {
	

	public static String stack2string(Exception e) {
		  try {
			    StringWriter sw = new StringWriter();
			    PrintWriter pw = new PrintWriter(sw);
			    e.printStackTrace(pw);
			    return "------\r\n" + sw.toString() + "------\r\n";
			  }
			  catch(Exception e2) {
			    return "bad stack2string";
			  }
			  
	} //public static String stack2string(Exception e) {

	public static String encodingSpecialCharacter(String url) {

		String encodedUrl = "";
		try {
			encodedUrl = URLEncoder.encode(url, "UTF-8");
			
		} catch (Exception e ) {
		}
		
		return encodedUrl;
		
		
	} //public static String encodingSpecialCharacter(String url) {
	
	
	public static String[] splitStringss(String str, String delimeter) {
		String[] splited = null;
		splited = str.split(delimeter, -1);

		return splited;

	}
	
	public static String convertToDelimiteredStrings(List<Integer> lists, String delimeter) {
		
		StringBuffer sb = new StringBuffer();
		if (lists == null || lists.size() <= 0) return sb.toString();
		
		for (Integer item : lists) {
			sb.append(item);
			sb.append(delimeter);
		}
		
		String delimiteredStr = sb.toString().trim();
		return delimiteredStr.substring(0, delimiteredStr.length() - 1);
		
	}
	
	
	public static void splitStringsReturnToNextLine(String str, String delimeter) {
		String[] splited = null;
		splited = str.split(delimeter, -1);

		StringBuffer temp2 = new StringBuffer();
		for (String item : splited) {
			temp2 = temp2.append(item + " ");
			if (temp2.length() >= 90) {
				System.out.println(temp2.toString());
				temp2 = new StringBuffer();
			}
		}
		if (temp2.length() > 0) {
			System.out.println(temp2.toString());
		}
	}
	
	public static String[] reformatFreeFormEntriesIntoMultipleLines(String str, String delimeter, int arraySize) {
		String[] splited = null;
		splited = str.split(delimeter, -1);
		String[] multipleLines = new String[arraySize];
		int i = 0;

		Arrays.fill(multipleLines,"");
		
		StringBuffer concatenateStrs = new StringBuffer();
		for (String item : splited) {
			concatenateStrs = concatenateStrs.append(item + delimeter);
			if (concatenateStrs.length() >= 90) {
				multipleLines[i] = concatenateStrs.toString();
				if (arraySize == (i+1)) {
					break;
				}
				i++;
				concatenateStrs = new StringBuffer();
			}
		}
		if (concatenateStrs.length() > 0) {
			multipleLines[i] = concatenateStrs.toString();
		}

		for (String item : multipleLines) {
			System.out.println(item);
		}
		return multipleLines;
	}
	
	
	public static String getHHMMFromDate(Date dt1) {
	
		//HH ==> 0 ~ 24
		//hh ==> 0 ~ 12
        String hour = new SimpleDateFormat("hh:mm a").format(dt1);
        String hour2 = new SimpleDateFormat("HH:mm").format(dt1);
        
//        Date dt2 = new Date("2013-09-05 14:15:00");
//        String hour3 = new SimpleDateFormat("HH:mm").format(dt2);
		
		return hour;
		
	} //public static String getHHMMFromDate(Date dt1) {
	

	public static String paddingPrefix(Object obj, String paddingValues, int totalLen) {
		if (obj == null) return "";
		String str = String.valueOf(obj);
		
		StringBuffer sb = new StringBuffer("");
		
		int diff = totalLen - str.trim().length();
		for (int i=0; i<diff; i++) {
			sb.append(paddingValues);
		}
		sb.append(str);
		
		return sb.toString();
	}
	
	public static String paddingSpaces(String str, int totalLen) {

		if (str == null) return "";
		
		StringBuffer sb = new StringBuffer("");
		
		int diff = totalLen - str.trim().length();
		
		sb.append(str);
		for (int i=0; i<diff; i++) {
			sb.append(" ");
		} //for (int i=0; i<diff; i++) {
		sb.append("<<<<just want to indicate the end");
		
		
		return sb.toString();
		
	} //public static String paddingSpaces(String str, int totalLen) {
	
	
	private static void vectorVsArrayList() {
	       Vector<String> myVector=new Vector<String>(); //declare vector
	       
	       String sample="test1";       //test string declared
	       myVector.add(sample);            //adds sample's value to the vector
	       myVector.add(1, "test2");
	       myVector.add(2, "test3");
	       System.out.println("Value is :"+myVector.get(0));           //Displays the value
	       System.out.println("Value is :"+myVector.get(1));           //Displays the value
	       myVector.remove(0);             //this removes the element at the specified position

		
	}
	private static void collectionSize(List<String> list) {
		
		
		list.add("test1");
		list.add("test2");
		list.add("test3");
		list.add("test4");
		
		for(int i=0; i<list.size();i++) {
			System.out.println("list size..." + list.size());
		}
		
		
		
		
	}
	
	
	private static boolean isValidEmail(String email) {
		
		//Input the string for validation
	      //String email = "xyz@hotmail.com";

	      //Set the email pattern string
	      Pattern p = Pattern.compile(".+@.+\\.[a-z]+");

	      //Match the given string with the pattern
	      Matcher m = p.matcher(email);

	      //check whether match is found 
	      boolean matchFound = m.matches();

//	      if (matchFound)
//	        System.out.println("Valid Email Id." + email);
//	      else
//	        System.out.println("Invalid Email Id." + email);

	      return matchFound;
	}
	
	
	private static void enumTesting() {
		
		System.out.println("Province.ON..." + Province.ON);
		System.out.println("Province.BC..." + Province.BC);
		System.out.println("Province.AB..." + Province.AB);
		
		System.out.println("ON Province..." + Province.valueOf("ON"));
		
		Province[] provinces = Province.values();
		for(Province p : provinces) {
			//p & p.name() will return same value like 'ON' or 'BC', etc
			System.out.printf("The province %s 's time different from EST is %d %n.", p, p.timeDiff());
		}
		
//		formatter.format ("boolean = %9b %n",   a_boolean);
//	    formatter.format ("byte    = %9d %n",   a_byte);
//	    formatter.format ("short   = %9d %n",   a_short);
//	    formatter.format ("int     = %9d %n",   an_int);
//	    formatter.format ("long    = %9d %n",   a_long);
//	    formatter.format ("float   = %9.3f %n", a_float);
//	    formatter.format ("double  = %9.2e %n", a_double);

		
	}
	
	public enum Province {
		ON (0),
		BC (3),
		AB (2);
		
		private final int timeDiff; //from Eastern(EST) zone
		Province(int timeDiff) {
			this.timeDiff = timeDiff;
		}
		
		public int timeDiff() {return timeDiff;}
		
	};
	
	public static String getMod10Digit(String rawCode) {
		String mod10Digit = "";

		int nSum = 0;
		int nMultiplier = 2;
		for (int i = rawCode.length(); i > 0; i--) {
			nSum += Integer.valueOf(rawCode.substring(i - 1, i)).intValue()
					* nMultiplier;
			nMultiplier = nMultiplier == 2 ? 1 : 2;
		}
		nSum %= 10;
		mod10Digit = String.valueOf(nSum > 0 ? 10 - nSum : 0);

		return mod10Digit;
	}
	
	public static void collectionTesting(List listA) {
	
        
        long size = 50000;
        
        
	    long milis1 = Calendar.getInstance().getTimeInMillis();

        System.out.println("starting..." + listA.getClass().getName());

        //1. Add elements into Collection
        for(long i=0; i<size; i++) {
        	listA.add(++i);
        }
        //2. Remove elements in the middle
        for(long i=listA.size() - listA.size()/2; i<listA.size()*2;) {
        	listA.remove(i);
        	i = i + 5;
        }
        listA.add("Jeff");
        
        //3. Add elements again in the middle of list
        for(long i=listA.size() - listA.size()/2; i<listA.size()*2;) {
        	listA.add(i);
        	i = i + 5;
        }
//        Collections.sort(listA);
        Collections.shuffle(listA, new Random());
        
        for (int j=0; j < listA.size(); j++) {
//            System.out.println("[" + j + "] - " + listA.get(j));
        }
//        
//        int locationIndex = listA.indexOf("Jeff");
//        System.out.println("Index location of the String \"Jeff\" is: " + locationIndex);  
        listA.clear();
        
	    long milis2 = Calendar.getInstance().getTimeInMillis();
        long diff = milis2 - milis1;
        long executionSec = diff / (1000); //1 day = 86,400,000

        System.out.println("execution time in sec..." + diff +"..." + executionSec + "\r\n");

//        System.out.println("List contents..." + listA);
        
		
	}
	
	public static void createFile() throws Exception {
		
//		String newline = System.getProperty("line.separator");
		File file = new File("bigfile2.txt");
		
		Writer output = null;
		output = new BufferedWriter(new  FileWriter(file));
		
		for(int i = 0;i < 1000000; i++) {
			output.write(i + "...testing\r\n");
		}
		
		output.close();
		System.out.println("Your file has been writeen");
		
	} //public static void createFile() throws Exception {
	
	
	
	/*
	 * Origal code is from  validPostalCode method in the com.canpar.canship.Shippingform class
	 */
	public static boolean validPostalCode(String postalCode, String province) {
		
		StringBuffer sb;
		char c;
//		int i;

		if (postalCode == null || province == null
				|| postalCode.trim().length() < 1
				|| province.trim().length() < 1)
			return false;

		if (postalCode.trim().length() > 6) {
			return false; //StrutsGlobals.ACTION_ERROR_POSTALCODE_KEY;
		}
		
		while (postalCode.indexOf(" ") > 0) { // For Canadian Postal Codes
			// X#X #X#
			sb = new StringBuffer(postalCode.trim());
			sb.deleteCharAt(postalCode.indexOf(' '));
			postalCode = sb.toString();
		}

//		if (this.getProvincesHash().containsValue(prov)
//				|| !StrutsGlobals.isNumber(postalzipCode)) { // Canadian
//			if (postalzipCode.length() != 6)
//				return StrutsGlobals.ACTION_ERROR_POSTALCODE_KEY;
//		} else { // U.S.
//			if (postalzipCode.length() < 5 || postalzipCode.length() > 9
//					|| !StrutsGlobals.isNumber(postalzipCode)) {
//				return StrutsGlobals.ACTION_ERROR_ZIPCODE_KEY;
//			} else {
//				setPostalCode(postalzipCode);
//				// setServices((String)XServDatCodeInfo.getGroupIDHash().get(StrutsGlobals.CANSHIP_SERVICE_GROUP_USA));
//				setUSAzipcode(true);
//				return ret; // Correct U.S.
//			}
//		}
		
		
		// check for Canadian postal codes
		for (int i = 0; i < postalCode.length(); i++) {
			c = postalCode.charAt(i);
			if (c == ' ') {
				sb = new StringBuffer(postalCode.trim());
				sb.deleteCharAt(postalCode.indexOf(' '));
				postalCode = sb.toString();
			}
			if (i == 1 && (c == 'W' || c == 'Z'))
				return false; //StrutsGlobals.ACTION_ERROR_POSTALCODE_KEY;

			if (i % 2 == 0) {
				if (Character.isDigit(c) || c < 'A' || c > 'Z'
						|| "DFIOQU".indexOf(c) > 0)
					return false; //StrutsGlobals.ACTION_ERROR_POSTALCODE_KEY;
			} else {
				if (!Character.isDigit(c))
					return false; //StrutsGlobals.ACTION_ERROR_POSTALCODE_KEY;
			}
		} //for (int i = 0; i < postalzipCode.length(); i++) {


//		if (prov.equals(StrutsGlobals.FORM_QUICKSHIP_CustomerProv)) {
//			// QUICK shipment, ignor province check below.
//			setPostalCode(postalzipCode); // set the result to form
//			setUSAzipcode(false);
//			return ret;
//		}

		// check first letter
		c = postalCode.charAt(0);

		if (province.equals("NF") && c == 'A' || province.equals("NS") && c == 'B'
				|| province.equals("PE") && c == 'C' || province.equals("NB")
				&& c == 'E' || (province.equals("PQ") || province.equals("QC"))
				&& "GHJ".indexOf(c) > -1 || province.equals("ON")
				&& "KLMNP".indexOf(c) > -1 || province.equals("MB") && c == 'R'
				|| province.equals("SK") && c == 'S' || province.equals("AB")
				&& c == 'T' || province.equals("BC") && c == 'V'
				|| province.equals("NL") && c == 'A') { // correct Canadian postal
			return true; //ret;
		} else {
			return false;
		} //if (province.equals("NF") && c == 'A' || province.equals("NS") && c == 'B'
		

	} //public static boolean validPostalCode(String postalCode, String province) {
	

	public static void fillteringOut(String str, String strLookFor) {
//		substringTest("test@canpar.com");
		
		if ( str != null && str.indexOf(strLookFor) > 0) {
			
			System.out.println(str.indexOf(strLookFor) ); 
			System.out.println(str.substring(0, str.indexOf(strLookFor)) ); 
			System.out.println(str.substring(str.indexOf(strLookFor) + 1 )); 
			
		} else {
			System.out.println(str); 
			
		}
		
		
		
		
		
	} //public static void fillteringOut(String str, String strLookFor) {

	
	public static void preFixIncrement(int value) {
	
		int prefixValue = ++value;
		System.out.println("prefix updates right away..." + prefixValue + ",,," + value);

		int postfixValue = value++;
		System.out.println("postfix doesn't update right away..." + postfixValue + ",,," + value);
	}
	
	public static void replaceString(String original, String oldChar, String newChar) {
		
		String newString = original.replace(oldChar, newChar);

		System.out.println("replacing String..." + original + ", for " + oldChar);
		System.out.println("replaced  String..." + newString + ", with " + newChar);
		
		
		
	}
	
	public static void bitWiseOperator(int i, int j) {
		
		int result = i & j;
		System.out.println("& operator (1 if both bits are 1)..." + i + " & " + j + " ==> " + result);

		result = i | j;
		System.out.println("| operator (1 if either bit is 1)..." + i + " | " + j + " ==> " + result);
		
		result = i ^ j;
		System.out.println("^ operator (1 if both bits are different)..." + i + " ^ " + j + " ==> " + result);
		
		
		
		
	}
	
	private static void treeSetWithDuplicateValues() {

		TreeSet<String> lists = new TreeSet<String>();
		
		lists.add("ABC1");
		lists.add("ABC2");
		lists.add("ABC3");
		lists.add("ABC2"); //duplicate so it does not allow duplicate value

		
		for (String list : lists) {
			System.out.print(list +"\n");
		}
			
	}
	

	
	
	
}


class DataObject {
	 
	private int data1 = 100;
	private String data2 = "hello";
	private List<String> list = new ArrayList<String>() {
	  {
		add("String 1");
		add("String 2");
		add("String 3");
	  }
	};
 
	//getter and setter methods
 
	@Override
	public String toString() {
	   return "DataObject [data1=" + data1 + ", data2=" + data2 + ", list="
		+ list + "]";
	}
 
}



