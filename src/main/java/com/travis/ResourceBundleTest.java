package com.travis;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {

	public static void main(String args[]) throws Exception {

		
		Locale locale = Locale.getDefault();

//		ResourceBundle messages = ResourceBundle.getBundle("com.barcode.MessageResources",java.util.Locale.getDefault());
//		ResourceBundle messages = ResourceBundle.getBundle("com.barcode.MessageResources",locale);

		ResourceBundle messages = ResourceBundle.getBundle("MessageResources",java.util.Locale.getDefault());
		
		
		String aaa = messages.getString("serviceTime.expected_pickup_date");

		System.out.println("resource bundle test..." + aaa);

		String aaa2 = messages.getString("serviceTime.no_delivery_service_day");
		
		Object[] arg = {"hahaha1", "hahaha2"};
//		System.out.println("messageformat test..." + MessageFormat.format(aaa2,"hahaha"));
		System.out.println("messageformat test..." + MessageFormat.format(aaa2,arg));

		
		
		
	}
}
