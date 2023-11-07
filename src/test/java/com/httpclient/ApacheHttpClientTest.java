package com.httpclient;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.TrustAllStrategy;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

//import net.minidev.json.JSONObject;

public class ApacheHttpClientTest {

	private HttpClient httpClient;
	
	
	@Test
	public void usingCustomRequestBody() throws IOException {
		
	    GraphqlRequestBody graphQLRequestBody = new GraphqlRequestBody();
	    
	    final String query = GraphqlSchemaReaderUtil.getSchemaFromFileName("dealers.graphql");
	    final String variables = GraphqlSchemaReaderUtil.getSchemaFromFileName("dealers-variables.graphql");
	    
	    graphQLRequestBody.setQuery(query);
	    graphQLRequestBody.setVariables(variables);
	    
	    System.out.println(graphQLRequestBody.toString());
	    

	}
	
	//finally works, but have to remove tab, return carraige, new line from files
	@Test
	public void usingHttpClient2() throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException, ClientProtocolException, IOException {

		String url = "https://3.223.122.114/content/_cq_graphql/dealercentral/endpoint.json";
//	    final String query = GraphqlSchemaReaderUtil.getSchemaFromFileName("dealerz-without-variable.graphql");
	    final String query = GraphqlSchemaReaderUtil.getSchemaFromFileName("dealers.graphql");
	    final String variables = GraphqlSchemaReaderUtil.getSchemaFromFileName("dealers-variables.graphql");

	    
		CredentialsProvider provider = new BasicCredentialsProvider();
		HttpClientBuilder builder = HttpClientBuilder
				.create()
				.setDefaultCredentialsProvider(provider)
				.disableCookieManagement()
				.useSystemProperties();
		builder.setSSLContext(new SSLContextBuilder()
				.loadTrustMaterial(null, TrustAllStrategy.INSTANCE).build())
				.setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE);
		
		HttpClient client = builder.build();
		
		HttpPost httpPost = new HttpPost(url);
        //httpPost.addHeader("Accept", "application/json");
        httpPost.addHeader("Content-Type", "application/json");

        
	    GraphqlRequestBody graphQLRequestBody = new GraphqlRequestBody();
	    
	    graphQLRequestBody.setQuery(query);
	    graphQLRequestBody.setVariables(variables);
	    
		StringEntity input = new StringEntity(graphQLRequestBody.toString(), ContentType.APPLICATION_JSON);
	    httpPost.setEntity(input);
	    
	    
//        Map<String, Object> params = new HashMap<>();
//        params.put("query", query);
//        params.put("variables", variables);
//        JSONObject jsonobj = new JSONObject(params);
//        
//		StringEntity input = new StringEntity(jsonobj.toString(), ContentType.APPLICATION_JSON);
//	    httpPost.setEntity(input);
	
        
//	    List<NameValuePair> paramList = new ArrayList<>();
//        for (String key : params.keySet()) {
//            paramList.add(new BasicNameValuePair(key, params.get(key)));
//        }
//        UrlEncodedFormEntity input = new UrlEncodedFormEntity(paramList,"utf-8");
//        httpPost.setEntity(input);
	    
	    
	    HttpResponse response = client.execute(httpPost);
	    //response.getEntity().getContent();
		int responseCode = response.getStatusLine().getStatusCode();
		String responseMsg = response.getStatusLine().toString();
	    
		HttpEntity entity = response.getEntity();
		//String result = EntityUtils.toString(entity);
		
		ObjectMapper mapper = new ObjectMapper();
		DealersGraphQLResponse dealers = mapper.readValue(EntityUtils.toString(entity), new TypeReference<DealersGraphQLResponse>(){});
		
		System.out.println(dealers);
		

		
	}

	@Test
	public void usingHttpClient() throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException, ClientProtocolException, IOException {
		
		/* OK
        String query = "{query : " +
            " countries { " +
            "  name " +
            "   emoji " +
            "  currency" +
            "  code " +
            "  capital " +
            " } " +
            " } ";
		String url = "https://countries.trevorblades.com";
		*/
		
		//ok
//		String query2 = "{ " +
//            " dcDealerList(filter: { dealerCode: { _expressions: { value: \"42120\" } } }) { " +
//            "    items { " + 
//            "        dealerCode " +
//            "    } " + 
//            " } " +
//            "} ";

		
//		String query = "{ " 
//			    + " dcDealerList(filter: { dealerCode: { _expressions: { value: \"42120\" } } }) { "
//			    + " items { " 
//			        + "     _path " 
//			            + " dealerCode " 
//			            + " _variations "
//			            + " _model { " 
//			               + "  _path " 
//			               + "  title " 
//			               + " } " 
//			            + " departmentReference { " 
//			               + "  _path " 
//			                + " department " 
//			                + " emailAddress " 
//			                + " phoneNumber " 
//			                + " faxNumber " 
//			                + " city " 
//			                + " province " 
//			                + " postalCode " 
//			                + " _variations " 
//			                + " } " 
//			                + " } " 
//			                + " } " 
//			                + " }";
		
		String query1 = "{ " 
			    + " dcDealerList(filter: { dealerCode: { _expressions: { value: \"%s\" } } }) { "
			    + " items { " 
			            + " departmentReference { " 
			                + " emailAddress " 
			                + " } " 
			                + " } " 
			                + " } " 
			                + " }";
		
		String query = String.format(query1, "42120");
		
        
		String url = "https://3.223.122.114/content/_cq_graphql/dealercentral/endpoint.json";
		
			

		CredentialsProvider provider = new BasicCredentialsProvider();
		HttpClientBuilder builder = HttpClientBuilder
				.create()
				.setDefaultCredentialsProvider(provider)
				.disableCookieManagement()
				.useSystemProperties();
		builder.setSSLContext(new SSLContextBuilder()
				.loadTrustMaterial(null, TrustAllStrategy.INSTANCE).build())
				.setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE);
		
		HttpClient client = builder.build();
		
		HttpPost httpPost = new HttpPost(url);
        httpPost.addHeader("Accept", "application/json");
        httpPost.addHeader("Content-Type", "application/json");
        
        
        Map<String, Object> variables = new HashMap<>();
        variables.put("query", query);
        JSONObject jsonobj; 
        jsonobj = new JSONObject(variables);
        
		StringEntity input = new StringEntity(jsonobj.toString());
	    httpPost.setEntity(input);
	    
	    HttpResponse response = client.execute(httpPost);
	    //response.getEntity().getContent();
		int responseCode = response.getStatusLine().getStatusCode();
		String responseMsg = response.getStatusLine().toString();
	    
		HttpEntity entity = response.getEntity();
		//String result = EntityUtils.toString(entity);
		
		ObjectMapper mapper = new ObjectMapper();
		DealersGraphQLResponse dealers = mapper.readValue(EntityUtils.toString(entity), new TypeReference<DealersGraphQLResponse>(){});
		
		System.out.println(dealers);
		
        
	}
	
	@Test
	public void readResource() throws IOException {
		  Resource resource = new ClassPathResource("test2.txt");

		  File file = resource.getFile();
		  String content = new String(Files.readAllBytes(file.toPath()));
		
	}
	

	//@Test
	public void testingGraphQL2() throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException, ClientProtocolException, IOException {
		String url = "https://3.223.122.114/content/_cq_graphql/dealercentral/endpoint.json";
		String query = "query DcDealerList { " 
		    + " dcDealerList(filter: { dealerCode: { _expressions: { value: \"42120\" } } }) { "
		    + " items { " 
		        + "     _path " 
		            + " dealerCode " 
		            + " _variations "
		            + " _model { " 
		               + "  _path " 
		               + "  title " 
		               + " } " 
		            + " departmentReference { " 
		               + "  _path " 
		                + " department " 
		                + " emailAddress " 
		                + " phoneNumber " 
		                + " faxNumber " 
		                + " city " 
		                + " province " 
		                + " postalCode " 
		                + " _variations " 
		                + " } " 
		                + " } " 
		                + " } " 
		                + " }";

		
		

			CredentialsProvider provider = new BasicCredentialsProvider();
			HttpClientBuilder builder = HttpClientBuilder
					.create()
					.setDefaultCredentialsProvider(provider)
					.disableCookieManagement()
					.useSystemProperties();
			builder.setSSLContext(new SSLContextBuilder()
					.loadTrustMaterial(null, TrustAllStrategy.INSTANCE).build())
					.setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE);
			
			HttpClient client = builder.build();
			
			HttpPost httpPost = new HttpPost(url);
			StringEntity input = new StringEntity(query, ContentType.APPLICATION_JSON);
		    httpPost.setEntity(input);
		    
		    HttpResponse response = client.execute(httpPost);
		    //response.getEntity().getContent();
		    
			HttpEntity entity = response.getEntity();
			String result = EntityUtils.toString(entity);

				
		
			System.out.println("connection goood2");

		
	}
	
	//@Test
	public void testingGraphQL() {
		
		String url = "https://3.223.122.114/content/_cq_graphql/dealercentral/endpoint.json";
		String query = "DcDealerList { " 
		    + " dcDealerList(filter: { dealerCode: { _expressions: { value: \"42120\" } } }) { "
		    + " items { " 
		        + "     _path " 
		            + " dealerCode " 
		            + " _variations "
		            + " _model { " 
		               + "  _path " 
		               + "  title " 
		               + " } " 
		            + " departmentReference { " 
		               + "  _path " 
		                + " department " 
		                + " emailAddress " 
		                + " phoneNumber " 
		                + " faxNumber " 
		                + " city " 
		                + " province " 
		                + " postalCode " 
		                + " _variations " 
		                + " } " 
		                + " } " 
		                + " } " 
		                + " }";

		
		

		try {
			CredentialsProvider provider = new BasicCredentialsProvider();
			HttpClientBuilder builder = HttpClientBuilder
					.create()
					.setDefaultCredentialsProvider(provider)
					.disableCookieManagement()
					.useSystemProperties();
			builder.setSSLContext(new SSLContextBuilder()
					.loadTrustMaterial(null, TrustAllStrategy.INSTANCE).build())
					.setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE);
			
			HttpClient client = builder.build();
			
			HttpGet request = new HttpGet(url);
			
			URI uri;
			uri = new URIBuilder(request.getURI())
				      .addParameter("query", query)
				      .build();
		    request.setURI(uri);
		    HttpResponse httpResponse = client.execute(request);
		    
		    
		    String actualResponse = IOUtils.toString(httpResponse.getEntity().getContent(), StandardCharsets.UTF_8.name());
		    
		    ObjectMapper mapper = new ObjectMapper();
		    DealersGraphQLResponse parsedResponse = mapper.readValue(actualResponse, DealersGraphQLResponse.class);
			System.out.println("connection goood");
		    
		    
		} catch (URISyntaxException | IOException | KeyManagementException | NoSuchAlgorithmException | KeyStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("connection goood2");
		
		
		
	}

	
	
	
	//TODO fix this
//    @Before
    public void initClient() throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException {
//        httpClient = HttpClients
//                .custom()
//                .setSSLContext(new SSLContextBuilder().loadTrustMaterial(null, TrustAllStrategy.INSTANCE).build())
//                .setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE)
//                .build();
 
       
//		  SSLContextBuilder builder = new SSLContextBuilder();
////	  builder.loadTrustMaterial(null, (chain, authType) -> true);           
//	  builder.loadTrustMaterial(null, TrustAllStrategy.INSTANCE);           
//	  SSLConnectionSocketFactory sslsf = 
//			  new SSLConnectionSocketFactory(builder.build(), NoopHostnameVerifier.INSTANCE);
//	  httpClient =  HttpClients.custom().setSSLSocketFactory(sslsf).build();

        
		httpClient = HttpClientBuilder.create()
	               .disableCookieManagement()
	               .useSystemProperties()
	               .build();
		
		
    }

//    @Test
    public void apacheHttpClient455Test() throws IOException {
        executeRequestAndVerifyStatusIsOk("https://api.sit.toyota.ca/tci/internal/api/v1.0/customer/cdms/vehicles/ownership/2T3B1RFV1MC201938");
        
//        executeRequestAndVerifyStatusIsOk("https://wrong.host.badssl.com");
//        executeRequestAndVerifyStatusIsOk("https://self-signed.badssl.com");
//        executeRequestAndVerifyStatusIsOk("https://untrusted-root.badssl.com");
//        executeRequestAndVerifyStatusIsOk("https://revoked.badssl.com");
//        executeRequestAndVerifyStatusIsOk("https://pinning-test.badssl.com");
//        executeRequestAndVerifyStatusIsOk("https://sha1-intermediate.badssl.com");
    }

    private void executeRequestAndVerifyStatusIsOk(String url) throws IOException {
        HttpUriRequest request = new HttpGet(url);

        request.addHeader("X-IBM-Client-Id", "11bbeef7-4db9-4d29-a24c-f99b9d705272");
        request.addHeader("X-IBM-Client-Secret", "jF5sQ5nR8sP8oX2dN0wD3vH3tM7yK7iQ8yL0yM4yU6sS3iN6rS");
        HttpResponse response = httpClient.execute(request);
        int statusCode = response.getStatusLine().getStatusCode();

        assert statusCode == 200;
    }
    
    
    
}
