package com.jackson;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonUtilTest {
	
	@Test
	public void whenSerializingWithoutJsonRawValue()
	  throws JsonProcessingException {
	 
		RawBeanWithoutJsonRawValue bean = new RawBeanWithoutJsonRawValue("My bean", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>");

	    String result = new ObjectMapper().writeValueAsString(bean);
	    System.out.println(result);
	    assertThat(result, containsString("My bean"));
	    assertThat(result, containsString("<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\"?>"));
	}
	
	//Tesing @JsonRawValue
	//Bit tricky to understand fully, but basically @JsonRawValue annotation removes any escaping characters
	//So when we serialize regular bean with @JsonRawValue annotation, it will remove any escape characters
	@Test
	public void whenSerializingUsingJsonRawValue_thenCorrect()
	  throws JsonProcessingException {
	 
	    RawBean bean = new RawBean("My bean", "{\"attr\":\"value\"}");
	    

	    String result = new ObjectMapper().writeValueAsString(bean);
	    System.out.println("with jsonrawvalue..." + result);
	    
	    assertThat(result, containsString("My bean"));
	    assertThat(result, containsString("{\"attr\":\"value\"}"));
	}


	
}
