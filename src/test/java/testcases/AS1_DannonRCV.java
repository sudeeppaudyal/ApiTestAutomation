package testcases;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.http.client.ClientProtocolException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import com.google.common.net.MediaType;

import files.AS1_DannonRCVPayloadBodyData;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class AS1_DannonRCV {

	String accessToken;
	
	@BeforeTest
	public void AS1DannonRCVAuthTokenPostRequest() throws ClientProtocolException, IOException {
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "/uaa/oauth/token";

		RestAssured.baseURI = url;
		// Get the RequestSpecification of the request that you want to sent to the server.
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("grant_type", "client_credentials");
		headers.put("Authorization", "Basic ZGFubm9uaW1zOnBhc3N3b3Jk");
		httpRequest.headers(headers);
		httpRequest.queryParam("grant_type", "client_credentials");

		Response response = httpRequest.post(route);

		//System.out.println("Response : " + response.prettyPrint().toString());
		// Response Validation
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.jsonPath().getString("token_type"), "bearer");
		// Taking token from Post request and using as a global variable to use concurrent test request
		accessToken = response.jsonPath().getString("access_token");
	}

	@Test
	public void  AS1_MM_MinimalFields() throws ClientProtocolException, IOException {

		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		RestAssured.baseURI = url;
		RequestSpecification httpRequest = RestAssured.given();

		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);
		httpRequest.queryParam("loadTrackingNumber", "67646");
		httpRequest.queryParam("commodityId", "6");
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.getPatchDataAS1MM_MinimalFields());
		
		Response response = httpRequest.patch(route);
		
		Assert.assertEquals(response.statusCode(), 200);
	}

	@Test
	public void AS1_MM_MinimalFields2Manis() throws ClientProtocolException, IOException{

		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		RestAssured.baseURI = url;
		RequestSpecification httpRequest = RestAssured.given();

		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);
		httpRequest.queryParam("loadTrackingNumber", "67563");
		httpRequest.queryParam("commodityId", "6");
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.getPatchDataAS1MM_MinimalFields2Manis());
		
		Response response = httpRequest.patch(route);
		
		Assert.assertEquals(response.statusCode(), 200);
	}

	@Test
	public void AS1_MM2FieldsOnly() throws ClientProtocolException, IOException{
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		RestAssured.baseURI = url;
		RequestSpecification httpRequest = RestAssured.given();

		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);
		httpRequest.queryParam("loadTrackingNumber", "67557");
		httpRequest.queryParam("commodityId", "6");
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.getPatchDataAS1MM2FieldsOnly());
		
		Response response = httpRequest.patch(route);
		
		Assert.assertEquals(response.statusCode(), 200);
	}

	@Test
	public void milkRCV_MinFields() throws ClientProtocolException, IOException{

		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		RestAssured.baseURI = url;
		RequestSpecification httpRequest = RestAssured.given();

		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);
		httpRequest.queryParam("loadTrackingNumber", "67579");
		httpRequest.queryParam("commodityId", "6");
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.getPatchDataMilkRCV_MinFields());
		
		Response response = httpRequest.patch(route);
		
		Assert.assertEquals(response.statusCode(), 200);
	}

	@Test
	public void milkRCV_RejectMostMilk() throws ClientProtocolException, IOException{

		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		RestAssured.baseURI = url;
		RequestSpecification httpRequest = RestAssured.given();

		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);
		httpRequest.queryParam("loadTrackingNumber", "68957");
		httpRequest.queryParam("commodityId", "6");
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.getPatchDataMilkRCV_RejectMostMilk());
		
		Response response = httpRequest.patch(route);
		Assert.assertEquals(response.statusCode(), 200);
	}
	
	@Test
	public void milkRCV_NoRejectNoManifests() throws ClientProtocolException, IOException{

		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		RestAssured.baseURI = url;
		RequestSpecification httpRequest = RestAssured.given();

		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);
		httpRequest.queryParam("loadTrackingNumber", "68957");
		httpRequest.queryParam("commodityId", "6");
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.getPatchDataMilkRCV_NoRejectNoManifests());
		
		Response response = httpRequest.patch(route);
		Assert.assertEquals(response.statusCode(), 200);
	}
	
	@Test
	public void milkRCV_StandardFields() throws ClientProtocolException,IOException{
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "6");
		httpRequest.queryParam("loadTrackingNumber", "67576");
		
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.getPatchDataMilkRCV_StandardFields());
		
		Response response = httpRequest.patch(route);

		Assert.assertEquals(response.statusCode(), 200);
	}
	
	@Test
	public void RCV_MostMilkThisIsAGoodOne() throws ClientProtocolException,IOException{
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "6");
		httpRequest.queryParam("loadTrackingNumber", "67646");
		
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.getPatchDataRCV_MostMilkThisIsAGoodOne());
		
		Response response = httpRequest.patch(route);

		Assert.assertEquals(response.statusCode(), 200);
						
	}
			
	@Test
	public void RCV_GoodOneNoSupplier() throws ClientProtocolException,IOException{
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "6");
		httpRequest.queryParam("loadTrackingNumber", "67499");
		
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.getPatchDataRCV_GoodOne_NoSupplier());
		
		Response response = httpRequest.patch(route);

		Assert.assertEquals(response.statusCode(), 200);
	
	}
		
	@Test
	public void RCV_GoodOne2ManisNoSupplier() throws ClientProtocolException,IOException{
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "6");
		httpRequest.queryParam("loadTrackingNumber", "67499");
		
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.getPatchDataRCV_GoodOne_NoSupplier());
		
		Response response = httpRequest.put(route);

		Assert.assertEquals(response.statusCode(), 200);
	}
		
	@Test
	public void RCV_MultiMilk() throws ClientProtocolException,IOException{
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "6");
		httpRequest.queryParam("loadTrackingNumber", "67552");
		
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.getPatchDataRCV_MultiMilk());
		
		Response response = httpRequest.put(route);

		Assert.assertEquals(response.statusCode(), 200);
	
	}
	@Test
	public void creamRCV_NoMeasurements() throws ClientProtocolException,IOException{
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "1");
		httpRequest.queryParam("loadTrackingNumber", "77857");
		
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.getPatchDataCreamRCV_NoMeasurements());
		
		Response response = httpRequest.patch(route);

		Assert.assertEquals(response.statusCode(), 200);
	
	}
	
	
	@Test
	public void creamRCV_MostFieldsRealIsh() throws ClientProtocolException,IOException
	{
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "1");
		httpRequest.queryParam("loadTrackingNumber", "78518");
		
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.getPatchDataCreamRCV_MostFieldsRealIsh());
		
		Response response = httpRequest.patch(route);

		Assert.assertEquals(response.statusCode(), 200);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	@Test
	public void creamRCV_NoManifestRealCase() throws ClientProtocolException,IOException{
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "1");
		httpRequest.queryParam("loadTrackingNumber", "78518");
		
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.getPatchDataCreamRCV_NoManifestRealCase());
		
		Response response = httpRequest.patch(route);

		Assert.assertEquals(response.statusCode(), 200);
	
	}
	
	@Test
	public void creamRCV_NoWeight() throws ClientProtocolException,IOException{
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "1");
		httpRequest.queryParam("loadTrackingNumber", "77539");
		
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.getPatchDataCreamRCV_NoWeight());
		
		Response response = httpRequest.patch(route);

		Assert.assertEquals(response.statusCode(), 200);
	
	}
	
		
	@Test
	public void creamRCV_MostFields() throws ClientProtocolException,IOException{
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "1");
		httpRequest.queryParam("loadTrackingNumber", "78424");
		
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.getPatchDataCreamRCV_MostFields());
		
		Response response = httpRequest.put(route);

		Assert.assertEquals(response.statusCode(), 200);
	
	}
	
	@Test
	public void creamRCV_Export() throws ClientProtocolException,IOException{
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "1");
		httpRequest.queryParam("loadTrackingNumber", "78556");
		
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.getPatchDataCreamRCV_Export());
		
		Response response = httpRequest.put(route);

		Assert.assertEquals(response.statusCode(), 200);
	
	}
	
	@Test
	public void putReceiptMinCream() throws ClientProtocolException,IOException{
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "1");
		httpRequest.queryParam("loadTrackingNumber", "78517");
		
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.getPatchDataPutReceiptMinCream());
		
		Response response = httpRequest.put(route);

		Assert.assertEquals(response.statusCode(), 200);
	
	}
	
	@Test
	public void putRejectMostOfCreamWorking() throws ClientProtocolException,IOException{
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "1");
		httpRequest.queryParam("loadTrackingNumber", "78352");
		
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.getPatchDataPutRejectMostOfCreamWorking());
		
		Response response = httpRequest.put(route);

		Assert.assertEquals(response.statusCode(), 200);
	
	}
	
	@Test
	public void putReceiptMultiCream() throws ClientProtocolException,IOException{
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "1");
		httpRequest.queryParam("loadTrackingNumber", "78518");
		
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.getPatchDataPutReceiptMultiCream());
		
		Response response = httpRequest.patch(route);

		Assert.assertEquals(response.statusCode(), 200);
	}
	
	
	@Test
	public void patchRequestSkimRCV_MostFields() throws ClientProtocolException,IOException{
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "2");
		httpRequest.queryParam("loadTrackingNumber", "5402");
		
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.patchRequestGetDataSkimRCV_MostFields());
		
		Response response = httpRequest.patch(route);
		Assert.assertEquals(response.statusCode(), 200);
	}
			
	@Test
	public void skimRCV_NoMeasurements() throws ClientProtocolException,IOException{
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "2");
		httpRequest.queryParam("loadTrackingNumber", "5395");
		
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.getPatchDataSkimRCV_NoMeasurements());
		
		Response response = httpRequest.patch(route);

		Assert.assertEquals(response.statusCode(), 200);
	
	}
	@Test
	public void skimRCV_MostFields() throws ClientProtocolException,IOException{
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "2");
		httpRequest.queryParam("loadTrackingNumber", "5395");
		
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.getPatchDataSkimRCV_MostFields());
		
		Response response = httpRequest.put(route);
		Assert.assertEquals(response.statusCode(), 200);
	}
			
	@Test
	public void skimRCV_Export() throws ClientProtocolException,IOException{
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "2");
		httpRequest.queryParam("loadTrackingNumber", "5442");
		
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.getPatchDataSkimRCV_Export());
		
		Response response = httpRequest.put(route);
		Assert.assertEquals(response.statusCode(), 200);
	}
	
	@Test
	public void putReceiptMinSkim() throws ClientProtocolException,IOException{
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "2");
		httpRequest.queryParam("loadTrackingNumber", "5423");
		
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.getPatchDataPutReceiptMinSkim());
		
		Response response = httpRequest.put(route);
		Assert.assertEquals(response.statusCode(), 200);
	}
	
	@Test
	public void putReceiptMultiSkim() throws ClientProtocolException,IOException{
		
		String url = "http://test.api.dallas.dairy.com";
		String route = "/receiving-resource/receipt";
		
		RestAssured.baseURI = url;
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("Content-Type", "application/json");
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.headers(headers);

		httpRequest.queryParam("commodityId", "2");
		httpRequest.queryParam("loadTrackingNumber", "5424");
		
		// Patch Data is comming from payLoad file
		httpRequest.body(AS1_DannonRCVPayloadBodyData.getPatchDataPutReceiptMultiSkim());
		
		Response response = httpRequest.put(route);
		Assert.assertEquals(response.statusCode(), 200);
	}
}
