package restassure;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonArray;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class googlemaps {


	public static String Addurl="http://216.10.245.166";///maps/api/place/add/json?key= qaclick123";

	public static String delurl="http://216.10.245.166";///maps/api/place/delete/json?key=qaclick123";
	public String Place_id;

	@Test(enabled=true)
	public void add1()
	{


		JSONObject js=new JSONObject();
		
		//String str=js.toJSONString();
		
		//JsonPath jp=new JsonPath(str);
		//Place_id=jp.get("place_id");
		JSONArray ja=new JSONArray();
		JSONObject jy=new JSONObject();
			jy.put("lat", 38.383494);
			jy.put("lng", 38.383494);
						ja.add(jy);
			js.put("location",jy);

		js.put("accuracy", 50);
		js.put("name", "Frontline house");
		js.put("phone_number", "983 893 3937");
		js.put("address", "29, side layout, cohen 09");
		js.put("types", "shoe park");
		js.put("website", "http://google.com");
		js.put("language", "French-IN");
		given().queryParam("key","qaclick123").contentType(ContentType.JSON).accept(ContentType.JSON).body(js.toJSONString())
		.when().post("http://216.10.245.166/maps/api/place/add/json/").then().statusCode(200).log().all();

		//System.out.println(Place_id);
		
		
	}
@Test(enabled=false)
public void delete()
{
	
	JSONObject js=new JSONObject();
	js.put("place_id",Place_id );
	given().queryParam("Key", "qaclick123").contentType(ContentType.JSON).accept(ContentType.JSON).body(js.toJSONString()).when()
	.delete("http://216.10.245.166/maps/api/place/delete/json/").then().statusCode(200).log().all();
	
	
	
	
}




}



