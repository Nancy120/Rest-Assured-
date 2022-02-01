package Test;

import org.testng.annotations.Test;
import org.apache.commons.collections4.map.HashedMap;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.assertion.*;
import io.restassured.http.ContentType;

import static io.restassured.matcher.ResponseAwareMatcher.*;


import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;


public class PutPatchDel {
	
	
	
	//@Test
	
	public void put() {
		
		JSONObject request = new JSONObject();
		request.put("Name", "Nancy");
		request.put("Job", "Quality Analyst");
		System.out.println(request.toJSONString());
		baseURI = "https://reqres.in/api";
		given().
		headers("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		put("/users/2").then().statusCode(200).
		log().all();
		
		}
	//@Test

	public void patch() {
		
		JSONObject request = new JSONObject();
		request.put("Name", "Nancy");
		request.put("Job", "Quality Analyst");
		System.out.println(request.toJSONString());
		baseURI = "https://reqres.in/api";
		given().
		headers("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		patch("/users/2").then().statusCode(200).
		log().all();
		
		}
	
	//@Test

	public void Del() {
		
		JSONObject request = new JSONObject();
		request.put("Name", "Nancy");
		request.put("Job", "Quality Analyst");
		System.out.println(request.toJSONString());
		baseURI = "https://reqres.in/api";
		given().
		headers("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		delete("/users/2").then().statusCode(200).
		log().all();
		
		}
	@Test

	public void Delete() {
		
		
		baseURI = "https://reqres.in/api";
		
		when().
		delete("/users/2").then().statusCode(204).
		log().all();
		
		}
	
				
		
		
		
		
		
	}


