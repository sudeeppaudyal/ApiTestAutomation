package testcases;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import files.AS1_DannonRCVPayloadBodyData;
import files.AS1_DannonShippingPayloadData;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AS1_DannonShipping {

	String accessToken;
	
	@BeforeTest
	public void AS1DannonShippingAuthTokenPostRequest() throws ClientProtocolException, IOException {
		
		String url = "https://apitest.dairy.com";
		String route = "/uaa/oauth/token";

		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("grant_type", "client_credentials");
		headers.put("Authorization", "Basic ZGFubm9uaW1zOnBhc3N3b3Jk");
		httpRequest.headers(headers);
		httpRequest.queryParam("grant_type", "client_credentials");

		Response response = httpRequest.post(route);

		//System.out.println("Response : " + response.prettyPrint().toString());
		
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.jsonPath().getString("token_type"), "bearer");
		accessToken = response.jsonPath().getString("access_token");
	}

	@Test
	public void AS1_DannonShippingTinyCreamPutRequest()throws ClientProtocolException, IOException {
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "receiving-resource/shipment";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/vnd.ddc.rr-v1.0.0+json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "1");
		httpRequest.queryParam("loadTrackingNumber", "78820");
				
		httpRequest.body(AS1_DannonShippingPayloadData.getPutDataAS1DannonShippingTinyCream());
		
		Response response = httpRequest.put(route);
		Assert.assertEquals(response.statusCode(), 202);
	}
		
	@Test
	public void AS1_DannonShippingSkimStagingAllAttributesPutRequest()throws ClientProtocolException, IOException {
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "receiving-resource/shipment";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/vnd.ddc.rr-v1.0.0+json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "2");
		httpRequest.queryParam("loadTrackingNumber", "5395");
				
		httpRequest.body(AS1_DannonShippingPayloadData.getPutDataAS1DannonShippingSkimStagingAllAttributes());
		
		Response response = httpRequest.put(route);
		Assert.assertEquals(response.statusCode(), 202);
	}
		
	@Test
	public void AS1_DannonShippingNewHyphenPutRequest() throws ClientProtocolException, IOException {
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "receiving-resource/shipment";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/vnd.ddc.rr-v1.0.0+json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "1");
		httpRequest.queryParam("loadTrackingNumber", "78556");
				
		httpRequest.body(AS1_DannonShippingPayloadData.getPutDataAS1DannonShippingNewHyphen());
		
		Response response = httpRequest.put(route);
		Assert.assertEquals(response.statusCode(), 202);
	}
		
	@Test
	public void AS1_DannonShippingNewHyphenDestinationPlantPutRequest() throws ClientProtocolException, IOException {
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "receiving-resource/shipment";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/vnd.ddc.rr-v1.0.0+json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "1");
		httpRequest.queryParam("loadTrackingNumber", "78556");
				
		httpRequest.body(AS1_DannonShippingPayloadData.getPutDataAS1DannonShippingNewHyphenDestinationPlant());
		
		Response response = httpRequest.put(route);
		Assert.assertEquals(response.statusCode(), 202);
	}
	
	@Test
	public void AS1_DannonShippingSkimMostAttributesPutRequest() throws ClientProtocolException, IOException {
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "receiving-resource/shipment";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/vnd.ddc.rr-v1.0.0+json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "2");
		httpRequest.queryParam("loadTrackingNumber", "5395");
				
		httpRequest.body(AS1_DannonShippingPayloadData.getPutDataAS1DannonShippingSkimMostAttributes());
		
		Response response = httpRequest.put(route);
		Assert.assertEquals(response.statusCode(), 202);
	}
	
	@Test
	public void AS1_DannonShippingCreamSHP_MostFieldsPutRequest() throws ClientProtocolException, IOException {
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "receiving-resource/shipment";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/vnd.ddc.rr-v1.0.0+json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "1");
		httpRequest.queryParam("loadTrackingNumber", "78820");
				
		httpRequest.body(AS1_DannonShippingPayloadData.getPutDataAS1DannonShippingCreamSHP_MostFields());
		
		Response response = httpRequest.put(route);
		Assert.assertEquals(response.statusCode(), 202);
	}
	
	@Test
	public void AS1_DannonShippingTinySkimRequiredOnly() throws ClientProtocolException, IOException {
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "receiving-resource/shipment";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/vnd.ddc.rr-v1.0.0+json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "2");
		httpRequest.queryParam("loadTrackingNumber", "5442");
				
		httpRequest.body(AS1_DannonShippingPayloadData.getPutDataAS1DannonShippingTinySkimRequiredOnly());
		
		Response response = httpRequest.put(route);
		Assert.assertEquals(response.statusCode(), 202);
	}
		
}
