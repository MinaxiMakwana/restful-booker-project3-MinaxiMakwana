package com.restful.booker.testbase;

import com.restful.booker.utils.PropertyReader;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class TestBase {

    @BeforeClass
    public void inIt() {
        String baseUri = PropertyReader.getInstance().getProperty("baseUri");
            RestAssured.baseURI = baseUri;
        }
    }



