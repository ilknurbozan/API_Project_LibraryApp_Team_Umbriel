package com.library.steps;

import com.library.utility.ConfigurationReader;
import com.library.utility.LibraryAPI_Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class US01_StepDefs {


    @Given("I logged Library api as a {string}")
    public void i_logged_library_api_as_a(String userType) {

    }
    @Given("Accept header is {string}")
    public void accept_header_is(String contentType) {

    }
    @When("I send GET request to {string} endpoint")
    public void i_send_get_request_to_endpoint(String endpoint) {

    }
    @Then("status code should be {int}")
    public void status_code_should_be(Integer statusCode) {

    }
    @Then("Response Content type is {string}")
    public void response_content_type_is(String contentType) {

    }
    @Then("{string} field should not be null")
    public void field_should_not_be_null(String field) {

    }

}