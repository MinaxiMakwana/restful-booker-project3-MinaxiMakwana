package com.restful.booker.testsuite;

import com.restful.booker.testbase.TestBase;
import com.restful.booker.utils.PropertyReader;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GetBookingIdsGet extends TestBase {

    String getBooking = PropertyReader.getInstance().getProperty("getBooking");
    static ValidatableResponse response;
    static List<Integer> bookingIds;

    @BeforeClass
    public void getBookings() {
        response = given()
                .when()
                .get(getBooking)
                .then();
        response.statusCode(200);

        bookingIds = response.extract().path("bookingid");
    }

    @Test
    public void bookingIds(){
        response = given()
                .when()
                .get()
                .then();
                response.statusCode(200);
                response.log().all();
    }

}
