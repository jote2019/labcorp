package com.lapcorptaskApi;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;


public class Com_lapcorpApi_GetRequest {

	@Test
	void get_UserInfo(){
		
		RestAssured.baseURI="https://6143a99bc5b553001717d06a.mockapi.io/testapi/v1/users";
		 
		RequestSpecification HttpRequest=RestAssured.given();
		
	    Response response=HttpRequest.request(Method.GET, "/59");
		
		 // JsonPath jsonpath=response.jsonPath(); 
		   ResponseBody  responseBody=response.getBody();
		  String firstname= responseBody.path("employee_firstname");
		  String lastname=responseBody.path("employee_lastname");
		  String gender= responseBody.path("employee_gender");
		//String gender=  responseBody.path("employee_gender");
	    int statusCode=	 response.getStatusCode();
	   
	    Assert.assertEquals(statusCode, 200);
		Assert.assertEquals("firstname", "TestData12345");
		Assert.assertEquals("lastname", "TestData12345");
		Assert.assertEquals("gender", "employee_gender 1");
	}
}
