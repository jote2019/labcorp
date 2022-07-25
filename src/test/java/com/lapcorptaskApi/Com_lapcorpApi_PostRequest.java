package com.lapcorptaskApi;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
//import static org.hamcrest.matchers.*;
//import static org.hamcrest.matcherAssert.assertThat;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Com_lapcorpApi_PostRequest {
	   @SuppressWarnings("unchecked")
	@Test
	    public void PostRequest() {
		  RestAssured.baseURI ="https://6143a99bc5b553001717d06a.mockapi.io/testapi/v1";
		   		
         //  RestAssured  httpRequest= new RestAssured();
	        // Json Body to pass in the request
		  JSONObject request=new JSONObject();
          
		  request.put("createdAt", 1631825833);
		  request.put("employee_firstname","TestData12345");
		  request.put("employee_lastname", "TestData12345");
		  request.put("employee_phonenumbe", "264-783-9453");
		  request.put("ademployee_emaildress", "ademployee_emaildress 1");
		  request.put("citemployee_addressy", "citemployee_addressy 1"); 
		  request.put("stateemployee_dev_level", "stateemployee_dev_level 1");
		  request.put("employee_gender", "employee_gender 1");
		  request.put("employee_hire_date", "2025-10-31T16:35:45.426Z");
		  request.put("employee_onleave", true);
		  request.put("tech_stack", "[]");
		  request.put("project", "[]");
		                    

     given()
        . contentType(ContentType.JSON)
	    . body(request.toJSONString())
	     
	  .when()
	       .post("/users")
	  .then()
	       . statusCode(201);
	     
	    }

}



	