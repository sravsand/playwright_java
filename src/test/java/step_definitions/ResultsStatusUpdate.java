package step_definitions;

import utils.ValueUtils;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class ResultsStatusUpdate {

    static String url = "https://api.zephyrscale.smartbear.com/v2";
    static String createTestCycleEndPoint ="/testcycles";
    static String testCycleName= "Smoke build: "+ValueUtils.getInstance().getCurrentTimeInTextFormat();

    static String bearerToken="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJjb250ZXh0Ijp7ImJhc2VVcmwiOiJodHRwczovL3NjaWZvcm1hLmF0bGFzc2lhbi5uZXQiLCJ1c2VyIjp7ImFjY291bnRJZCI6IjYzMjA4MTVjODczOGQzY2EzMjI1OWY4NSJ9fSwiaXNzIjoiY29tLmthbm9haC50ZXN0LW1hbmFnZXIiLCJzdWIiOiI4MTE0ZDM4NS05NDE1LTNjNDctYjYxYi05MGIyZGM0OTZjYzAiLCJleHAiOjE3MzA3NzI3MzYsImlhdCI6MTY5OTIzNjczNn0.A-0Akq67Q0npDViwCBVISveN-5pu3q_odgmkxoO4-fM";

    public static String createTestCycle() {
        RequestSpecification idRequest = RestAssured.given();
        idRequest.header("Content-Type", "application/json");
        idRequest.header("Authorization",
                "Bearer "+bearerToken);

        String testCycleRequestBody = "{\"projectKey\" : \"KI\"," +
                "\"name\" : \""+testCycleName+" -TestCycle"+"\"}";

        return idRequest.body(testCycleRequestBody).post(url+createTestCycleEndPoint).jsonPath().get("key");

    }

    public static void updateTestCaseStatus(String testCycleId, String testCaseId, String status){
        try{
            RequestSpecification request = RestAssured.given();
            request.header("Content-Type", "application/json");
            request.header("Authorization",
                    "Bearer "+bearerToken);

            String updateResultsEndPoint ="/testexecutions";
            String jsonString =
                    "{\"projectKey\" : \"KI\",\"testCaseKey\" : \""+testCaseId+"\"," +
                            "\"testCycleKey\" : \""+testCycleId.trim()+"\",\"statusName\" : \""+status+"\"}";
            System.out.println("json string  "+jsonString);
            request.body(jsonString).post(url+updateResultsEndPoint).getStatusCode();

// Print the response status code
            System.out.println("Response Status Code: " + request.body(jsonString).post(url+updateResultsEndPoint).getStatusCode());

// Print the response body
            System.out.println("Response Body: " + request.body(jsonString).post(url+updateResultsEndPoint).getBody().asString());

        }catch (Exception e){
            e.printStackTrace();
        }
    }

/*    public static void main(String[] args) throws InterruptedException {
        String cycleId=createTestCycle();
        Thread.sleep(3000);
        updateTestCaseStatus(cycleId,"VAN-T132","PASS");
    }*/


}

