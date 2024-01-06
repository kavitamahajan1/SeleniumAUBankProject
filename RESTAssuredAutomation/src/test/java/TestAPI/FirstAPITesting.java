package TestAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FirstAPITesting {

	@Test
	public void GetRequestTest() {
		
		Response response = RestAssured.get("http://13.234.16.249:4015/NServices.svc/CheckUserType");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody().asString());
		System.out.println(response.getContentType());
				
	}
	
}
