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

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AS1_DannonASSN {

	String accessToken;

	@BeforeTest
	public void getAuthToken() throws ClientProtocolException, IOException {

		String url = "http://test.api.dallas.dairy.com";
		String route = "/uaa/oauth/token";

		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = url;

		// Get the RequestSpecification of the request that you want to sent to the server.
		RequestSpecification httpRequest = RestAssured.given();

		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("grant_type", "client_credentials");
		headers.put("Authorization", "Basic ZGFubm9uaW1zOnBhc3N3b3Jk");
		httpRequest.headers(headers);
		httpRequest.queryParam("grant_type", "client_credentials");

		Response response = httpRequest.post(route);

		System.out.println("Response : " + response.prettyPrint().toString());

		// Response Validation
		Assert.assertEquals(response.statusCode(), 200);

		accessToken = response.jsonPath().getString("access_token");
		// System.out.println("Response access Token : " + accessToken);
	}

	@Test
	public void getMilk() throws ClientProtocolException, IOException {
		// querry param current date setup
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		// Date date = new Date();
		// Setting up 1 day before
		Date date = DateUtils.addDays(new Date(), -1);
		String date1 = dateFormat.format(date);
		// System.out.println(date1);
		String url = "http://test.api.dallas.dairy.com";
		String route = "/assignment-resource/assignments";

		RestAssured.baseURI = url;

		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.queryParam("startDate", date1 + "T08:30:00.001-05:00");
		httpRequest.queryParam("commodityId", "6");
		httpRequest.queryParam("commodityName", "Milk");
		httpRequest.queryParam("side", "BUYER");
		httpRequest.queryParam("plantId", "1638");

		Response response = httpRequest.get(route);
		// System.out.println("Get Milk Request Response : " + response.prettyPrint().toString());
		Assert.assertEquals(response.statusCode(), 200);

	}

	@Test
	public void getCream() throws ClientProtocolException, IOException {
		// querry param current date setup
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		// Date date = new Date();
		Date date = DateUtils.addDays(new Date(), -3);
		String date1 = dateFormat.format(date);
		//System.out.println(date1);
		String url = "http://test.api.dallas.dairy.com";
		String route = "/assignment-resource/assignments";

		RestAssured.baseURI = url;

		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.queryParam("startDate", date1 + "T08:30:00.001-05:00");
		httpRequest.queryParam("commodityId", "1");
		httpRequest.queryParam("commodityName", "Cream");
		httpRequest.queryParam("side", "BUY_AND_SELL");
		httpRequest.queryParam("plantId", "1638");

		Response response = httpRequest.get(route);
		//System.out.println("Get Cream Request Response : " + response.prettyPrint().toString());
		Assert.assertEquals(response.statusCode(), 200);
		// Assert.assertEquals(response.jsonPath().getString("commodity-name")[0],"CREAM");

		/*
		 * System.out.println("response : " + response.prettyPrint().toString());
		 * List<String> list = response.jsonPath().getList("$");
		 * 
		 * System.out.println(list.size());
		 * 
		 * for(int i = 0; i < list.size(); i++) {
		 * System.out.println(response.jsonPath().get("[" + i + "].commodity_name"));
		 * //Assert here. }
		 * 
		 */

	}

	@Test
	public void getSkim() throws ClientProtocolException, IOException {
		// querry param current date setup
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		// Date date = new Date();
		Date date = DateUtils.addDays(new Date(), -364);
		String date1 = dateFormat.format(date);
		//System.out.println(date1);
		String url = "http://test.api.dallas.dairy.com";
		String route = "/assignment-resource/assignments";

		RestAssured.baseURI = url;

		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.headers("Authorization", "bearer " + accessToken);
		httpRequest.queryParam("startDate", date1 + "T08:30:00.001-05:00");
		httpRequest.queryParam("commodityId", "2");
		httpRequest.queryParam("commodityName", "Cnd Skim");
		httpRequest.queryParam("side", "SELLER");
		httpRequest.queryParam("plantId", "1638");

		Response response = httpRequest.get(route);
		//System.out.println("Get Skim Request Response : " + response.prettyPrint().toString());
		Assert.assertEquals(response.statusCode(), 200);

	}

}
