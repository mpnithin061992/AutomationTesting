package files;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class EndToEndMapExample 
{

	public static void main(String[] args) 
	{
		//Add Place -->Update Place with New Address -->Get the new Place to check if the New Address is present in the response
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(Payload.Addplace()).when().post("/maps/api/place/add/json")
		.then().assertThat().log().all().statusCode(200).body("scope",equalTo("APP"))
		.header("Server","Apache/2.4.18 (Ubuntu)").extract().response().asString();
		
		System.out.println("++++ Response is ++++");
		System.out.println(response);
		
		JsonPath js=new JsonPath(response); //for parsing the json by getting input as string
		String Place_id=js.getString("place_id");
		
		System.out.println("++++ Place ID is ++++");
		System.out.println(Place_id);
		
		//Update Place
		
		System.out.println("*******************************************************************");
		
		String taregt_address="India-Ind";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+Place_id+"\",\r\n"
				+ "\"address\":\""+taregt_address+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "").when().put("/maps/api/place/update/json").then().assertThat().log().all().statusCode(200)
		.body("msg", equalTo("Address successfully updated"));
		
		//Get Updated Address
		
		System.out.println("*******************************************************************");
		
		String get_respose=given().log().all().queryParam("key", "qaclick123")
		.queryParam("place_id", Place_id)
		.when().get("/maps/api/place/get/json")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
		
		System.out.println("++++"+get_respose+"++++");
		
		JsonPath jsp=new JsonPath(get_respose);
		String Actual_Address=jsp.getString("address");
		
		System.out.println("Actual Address is"+Actual_Address);
		
		Assert.assertEquals(taregt_address, Actual_Address);

	}

}
