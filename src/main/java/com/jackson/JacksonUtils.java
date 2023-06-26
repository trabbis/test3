package com.jackson;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JacksonUtils {
	public static void main(String args[]) throws IOException {
		
		convertXmlToJson();
		
	}

	private static void convertXmlToJson() throws IOException  {
		
		String xml = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:v1=\"http://www.toyota.ca/bizservice/type/vindetailsservice/v1\" xmlns:v11=\"http://www.toyota.ca/soa/common/v1\">"
		+ "<soapenv:Header/>"
		+ "<soapenv:Body>"
		+ "<v1:GetVinDetailsRequest>"
        + "<v1:VIN>5TFDZ5BN9HX018335</v1:VIN>"
        + "</v1:GetVinDetailsRequest>"
        + "</soapenv:Body>"
        + "</soapenv:Envelope>";
        		
		
		XmlMapper xmlMapper = new XmlMapper();
		JsonNode node = xmlMapper.readTree(xml.getBytes());
		

		ObjectMapper jsonMapper = new ObjectMapper();
		String json = jsonMapper.writeValueAsString(node);
		System.out.println(json);
		
		

		
	}

}
