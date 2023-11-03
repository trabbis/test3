package com.httpclient;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class GraphqlSchemaReaderUtil {
	
	  public static String getSchemaFromFileName(final String filename) throws IOException {

		  Resource resource = new ClassPathResource(filename);
		  File file = resource.getFile();
		  return  new String(Files.readAllBytes(file.toPath()));

	  }

}
