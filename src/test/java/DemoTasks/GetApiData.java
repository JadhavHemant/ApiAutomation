package DemoTasks;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetApiData {
	public static void main(String[] args) {
		
		RestAssured.baseURI="http://localhost:3000/api/customers";
		
		RequestSpecification httpRequest=RestAssured.given();
		
		Response response=httpRequest.get();
		
		String a=response.getBody().asPrettyString();//asString();
		System.out.println(a);
		
				
		
	}
}
