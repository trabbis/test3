package com.travis;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


public class TestUtilities2 {

	public static void main (String argv[]) throws Exception {
		TestUtilities2 testUtilities2 = new TestUtilities2();

		String sharePointDomainUrl = "https://myteams.toyota.com/";
		String appName = "TCIPRMS-UAT";
		//testUtilities2.getFolderPath(sharePointDomainUrl, appName);
		
		utcTimeToCurrentTimeStamp();
		
		
	}
	
	public static void utcTimeToCurrentTimeStamp() {
		String _tranCrtTimestampStr = "2024-03-06T15:34:55.576Z"; //UTC time
		Timestamp ts = Timestamp.from(Instant.parse(_tranCrtTimestampStr.trim()));
		
		System.out.println(_tranCrtTimestampStr + "..." + ts);
		
		
		//current time Instant.now() ....UTC time
		Timestamp ts2 = Timestamp.from(Instant.now());
		System.out.println(Instant.now() + "..." + ts2);
	}
	
	private void convertLocalDateToDate() {

		ZoneId defaultZoneId = ZoneId.systemDefault();
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate..." + localDate);
      
		//Converting to Date object
		Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
		System.out.println(date);
		
	}


	
	public void getFolderPath(String sharePointDomainUrl, String appName) {
		final String SHAREPOINT_RELATIVE_PATH = "%s/_api/web/GetFolderByServerRelativeUrl('%s')/Files";
//		String ADD_FILE_COMMAND = "%s/_api/web/GetFolderByServerRelativeUrl('%s')/Files/add(url='%s',overwrite=true)";

		final String SHARED_DOCUMENT_PATH = "/sites/%s/Shared Documents/";

		String rootUrl = String.format("%ssites/%s", sharePointDomainUrl, appName);
	 	    //return String.format("%ssites/%s/", this.sharepointInfo.get_sharepointRootUrl(), request.getAppName());
		
		String folderPath = encodeSpaceInString(String.format(SHARED_DOCUMENT_PATH, appName));
		
		
		String folderName = String.format(SHAREPOINT_RELATIVE_PATH, rootUrl, folderPath);
		System.out.println(folderName);

		
	}
	
	private String encodeSpaceInString(String s){
		String ENCODED_SPACE = "%20";
		return s.replaceAll(" ", ENCODED_SPACE);
	}
	
	
}
