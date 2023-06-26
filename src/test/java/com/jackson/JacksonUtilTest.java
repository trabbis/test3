package com.jackson;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JacksonUtilTest {
	
	@Test
	public void whenSerializingUsingJsonRawValue_thenCorrect()
	  throws JsonProcessingException {
	 
	    RawBean bean = new RawBean("My bean", "{\"attr\":\"value\"}");
	    

	    String result = new ObjectMapper().writeValueAsString(bean);
	    
	    //TODO fix
	    assertEquals(result, containsString("My bean"));
	    assertEquals(result, containsString("{\"attr\":\"value\"}"));
//	    assertEquals(result, containsString("{\\\"attr\\\":\\\"value\\\"}"));
	    
	}

	
	
	@Test
	public void whenSerializingWithoutJsonRawValue_thenCorrect2()
	  throws JsonProcessingException {
	 
	    RawBean bean = new RawBean("My bean", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
//	    <?xml version="1.0" encoding="UTF-8"?>

	    //TODO fix
	    String result = new ObjectMapper().writeValueAsString(bean);
	    assertEquals(result, containsString("My bean"));
	    assertEquals(result, containsString("<?xml version=\"1.0\" encoding=\"UTF-8\"?>"));
	}

	
}
