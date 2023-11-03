package com.httpclient;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;

import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import reactor.netty.http.client.HttpClient;

public class WebClientTest {

	//TODO3
	@Test
	public void testingWithSpringWebClientWithToyotaEndpoint() throws IOException {

		String url = "https://3.223.122.114/content/_cq_graphql/dealercentral/endpoint.json";
			
		SslContext sslContext = SslContextBuilder
	            .forClient()
	            .trustManager(InsecureTrustManagerFactory.INSTANCE)
	            .build();
	    HttpClient httpClient = HttpClient.create().secure(t -> t.sslContext(sslContext));
	    
	    WebClient webClient = WebClient.builder()
	    						.baseUrl(url)
	    						.clientConnector(new ReactorClientHttpConnector(httpClient)).build();
	    
	    GraphqlRequestBody graphQLRequestBody = new GraphqlRequestBody();
	    
	    final String query = GraphqlSchemaReaderUtil.getSchemaFromFileName("dealers.graphql");
	    final String variables = GraphqlSchemaReaderUtil.getSchemaFromFileName("dealers-variables.graphql");
	    graphQLRequestBody.setQuery(query);
	    //graphQLRequestBody.setVariables(variables.replace("dealerCode", "42120"));

	    DealersGraphQLResponse countryDto = webClient.post()
	        .uri(url)
	        .bodyValue(graphQLRequestBody)
	        .retrieve()
	        .bodyToMono(DealersGraphQLResponse.class)
	        .block();

		  System.out.println(countryDto);

	}
	
	@Test
	public void testingWithSpringWebClient() throws IOException {

		  
		String url = "https://countries.trevorblades.com/";
		
	    WebClient webClient = WebClient.builder().build();

	    GraphqlRequestBody graphQLRequestBody = new GraphqlRequestBody();
	    
	    final String query = GraphqlSchemaReaderUtil.getSchemaFromFileName("getCountryDetails.graphql");
	    final String variables = GraphqlSchemaReaderUtil.getSchemaFromFileName("variables.graphql");
	    graphQLRequestBody.setQuery(query);
	    graphQLRequestBody.setVariables(variables.replace("countryCode", "BE"));

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

	@Test
	public void testingWithSpringFramework() throws Exception {
		String url = "https://3.223.122.114/content/_cq_graphql/dealercentral/endpoint.json";

		WebClient wc = WebClient.create(url);
//
//		GraphQlClient client = HttpGraphQlClient.create(wc);
//
//		String query1 = "{ " 
//			    + " dcDealerList(filter: { dealerCode: { _expressions: { value: $dealerCode } } }) { "
//			    + " items { " 
//			            + " departmentReference { " 
//			                + " emailAddress " 
//			                + " } " 
//			                + " } " 
//			                + " } " 
//			                + " }";
//		
//		Dealers dealers = client.document(query1)
//         .variable("dealerCode", "42120")
//         .retrieve("ipApi_location")
//         .toEntity(Dealers.class)
//         .block();
//		 
//		System.out.println(dealers);
		System.out.println("TEST");
		
	}

	
}
