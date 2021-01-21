package test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import files.Payload;

public class AddPlace_API 
{

	public static void main(String[] args) 
	{
		//Validate Add Place API is working or not
		//given - all input details
		//when - Submit the API - Resource and HTTP method
		//Then - Validate the response
		RestAssured.baseURI="https://rahulshettyacademy.com";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(Payload.Addplace()).when().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope",equalTo("APP"))
		.header("Server","Apache/2.4.18 (Ubuntu)");

	}

}
