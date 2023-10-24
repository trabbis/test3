package com.travis;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


public class TestUtilities2 {

	public static void main (String argv[]) throws Exception {
		TestUtilities2 testUtilities2 = new TestUtilities2();
		//testUtilities2.convertLocalDateToDate();

//		connectorProps.put("sharePointUrl", "https://myteams.toyota.com/sites/TCIPRMS-UAT/_api/web/GetFolderByServerRelativeUrl('/sites/TCIPRMS-UAT/Shared%20Documents/')/Files"); //Which url to use?
		String sharePointDomainUrl = "https://myteams.toyota.com/";
		String appName = "TCIPRMS-UAT";
		String folderName = testUtilities2.getFolderPath(sharePointDomainUrl, appName);
		System.out.println(folderName);
	}
	
	
	private void convertLocalDateToDate() {

		ZoneId defaultZoneId = ZoneId.systemDefault();
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate..." + localDate);
      
		//Converting to Date object
		Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
		System.out.println(date);
		
	}


	
	public String getFolderPath(String sharePointDomainUrl, String appName) {
		final String SHAREPOINT_RELATIVE_PATH = "%s/_api/web/GetFolderByServerRelativeUrl('%s')/Files";
//		String ADD_FILE_COMMAND = "%s/_api/web/GetFolderByServerRelativeUrl('%s')/Files/add(url='%s',overwrite=true)";

		final String SHARED_DOCUMENT_PATH = "/sites/%s/Shared Documents/";

		String rootUrl = String.format("%ssites/%s", sharePointDomainUrl, appName);
	 	    //return String.format("%ssites/%s/", this.sharepointInfo.get_sharepointRootUrl(), request.getAppName());
		
		String folderPath = encodeSpaceInString(String.format(SHARED_DOCUMENT_PATH, appName));
		return String.format(SHAREPOINT_RELATIVE_PATH, rootUrl, folderPath);
	}
	
	private String encodeSpaceInString(String s){
		String ENCODED_SPACE = "%20";
		return s.replaceAll(" ", ENCODED_SPACE);
	}
	
	
}
