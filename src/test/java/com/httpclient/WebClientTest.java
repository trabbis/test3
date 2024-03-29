package com.httpclient;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.databind.ObjectMapper;

import graphql.kickstart.spring.webclient.boot.GraphQLWebClient;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;

public class WebClientTest {

	//Somehow data is not showing up even though server sent data
	//Not sure why spring framework decided to return after sub node from root, but it works now
	@Test
	public void usingSpringGraphQLWebClient() throws IOException {

		String url = "https://3.223.122.114/content/_cq_graphql/dealercentral/endpoint.json";
			
		SslContext sslContext = SslContextBuilder
	            .forClient()
	            .trustManager(InsecureTrustManagerFactory.INSTANCE)
	            .build();
	    HttpClient httpClient = HttpClient.create().secure(t -> t.sslContext(sslContext));
	    
	    WebClient webClient = WebClient.builder()
	    						.baseUrl(url)
	    						.clientConnector(new ReactorClientHttpConnector(httpClient)).build();
	    
		ObjectMapper objectMapper = new ObjectMapper();
	    
	    GraphQLWebClient graphqlClient = GraphQLWebClient.newInstance(webClient, objectMapper);

	    //if expecting a single entity (not array)
	    Map<String, Object> variables = new HashMap<String, Object>();
	    variables.put("code", "42120");
	    Mono<DcDealerList> response = graphqlClient.post("dealers.graphql", variables, DcDealerList.class);
	    DcDealerList dealer = response.block();
	    
	    System.out.println("dealer..." + dealer);
	    
	    //if expecting a list of entity (array)
//	    var response = graphqlClient.post(GraphQLRequest.builder().resource("query1.graphql")
//	            .variables(Map.of("RefNumber", "A7EED900-9BB4-486F-9F7C-2136E61E2278")).build())
//	                    .block();   
//	    List<MyEntity> entityList = response.getFirstList(MyEntity.class);
	    
	    

	}
	

	
	//TODO3 works only without variables
	//https://medium.com/decathlondigital/minimal-graphql-client-request-with-spring-boot-22e0041b170
	@Test
	public void usingSpringWebClient() throws IOException {

		String url = "https://3.223.122.114/content/_cq_graphql/dealercentral/endpoint.json";
			
		SslContext sslContext = SslContextBuilder
	            .forClient()
	            .trustManager(InsecureTrustManagerFactory.INSTANCE)
	            .build();
	    HttpClient httpClient = HttpClient.create().secure(t -> t.sslContext(sslContext));
	    
	    WebClient webClient = WebClient.builder()
//	    						.baseUrl(url)
	    						.clientConnector(new ReactorClientHttpConnector(httpClient)).build();
	    
	    GraphqlRequestBody graphQLRequestBody = new GraphqlRequestBody();
	    
	    final String query = GraphqlSchemaReaderUtil.getSchemaFromFileName("dealers.graphql");
	    final String variables = GraphqlSchemaReaderUtil.getSchemaFromFileName("dealers-variables.graphql");
//	    final String query = GraphqlSchemaReaderUtil.getSchemaFromFileName("dealers2-without-variable.graphql");
	    
	    graphQLRequestBody.setQuery(query);
//	    graphQLRequestBody.setVariables(variables.replace("dealerCode", "42120"));
	    graphQLRequestBody.setVariables(variables);

	    DcDealerList dealers = webClient.post()
	        .uri(url)
	        .contentType(MediaType.APPLICATION_JSON)
	        .bodyValue(graphQLRequestBody)
	        .retrieve()
	        .bodyToMono(DcDealerList.class)
	        .block();

		  System.out.println(dealers);

	}
	
	//Without variable, hard coding, it works, but no data returned
	@Test
	public void sampleSiteUsingSpringWebClient() throws IOException {

		  
		String url = "https://countries.trevorblades.com/";
		
	    WebClient webClient = WebClient.builder().build();

	    GraphqlRequestBody graphQLRequestBody = new GraphqlRequestBody();
	    
	    final String query = GraphqlSchemaReaderUtil.getSchemaFromFileName("getCountryDetails.graphql");
	    final String variables = GraphqlSchemaReaderUtil.getSchemaFromFileName("variables.graphql");
	    graphQLRequestBody.setQuery(query);
//	    graphQLRequestBody.setVariables(variables.replace("countryCode", "BE"));

	    CountryDto countryDto = webClient.post()
	        .uri(url)
	        .bodyValue(graphQLRequestBody)
	        .retrieve()
	        .bodyToMono(CountryDto.class)
	        .block();

		  System.out.println(countryDto);
		  


//	    GraphqlRequestBody graphQLRequestBody = new GraphqlRequestBody();
//		  Resource resource = new ClassPathResource("getCountryDetails.graphql");
//
//		  File file = resource.getFile();
//		  String query = new String(Files.readAllBytes(file.toPath()));
//
//		  Resource resource2 = new ClassPathResource("variables.graphql");
//		  File file2 = resource2.getFile();
//		  String variables = new String(Files.readAllBytes(file2.toPath()));
//	    
//		    graphQLRequestBody.setQuery(query);
//		    graphQLRequestBody.setVariables(variables.replace("countryCode", "BE"));
//		
//		    CountryDto countryDto = webClient.post()
//	        .uri(url)
//	        .bodyValue(graphQLRequestBody)
//	        .retrieve()
//	        .bodyToMono(CountryDto.class)
//	        .block();
//
		    
		
	}


	
}
