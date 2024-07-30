package org.NewsAPIs;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetArticleAPITest 
{
  @Test
  public void getArticleAPITest()
  {
		baseURI="https://airdrop-dev.houseofweb3.agency";
		 Response response = given()
		.queryParam("limit", 5)
		.queryParam("page", 1)
		.when()
		.get("/tst/article/user/getArticles");
		 long responsetime = response.getTime();
		 System.out.println("Response time is " + responsetime);
		response.then().assertThat().statusCode(200).log().all();
  }
}
