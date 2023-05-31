package tests;

import io.qameta.allure.*;
import models.RegisterUserBody;
import models.RegisterUserResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static specs.Specs.request;
import static specs.Specs.response400;
import static tests.TestData.fakeEmail;
import static tests.TestData.fakePassword;

public class RegisterTests {

    @Test
    @Tag("api")
    @Feature("Register tests")
    @Story("Unsuccessful register user")
    @Owner("korovina_iyu")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Register user without password")
    void registerMissingPasswordTest() {

        RegisterUserBody registerData = new RegisterUserBody();
        registerData.setEmail(fakeEmail);

        RegisterUserResponse response = step("Register user without password", () ->
                given(request)
                        .body(registerData)
                        .when()
                        .post("/register")
                        .then()
                        .spec(response400)
                        .extract().as(RegisterUserResponse.class));

        step("Check displayed error", () ->
                assertThat(response.getError().equals("Missing password")));
    }

    @Test
    @Tag("api")
    @Feature("Register tests")
    @Story("Unsuccessful register user")
    @Owner("korovina_iyu")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Register user without email")
    void registerMissingEmailTest() {

        RegisterUserBody registerData = new RegisterUserBody();
        registerData.setPassword(fakePassword);

        RegisterUserResponse response = step("Register user without email", () ->
                given(request)
                        .body(registerData)
                        .when()
                        .post("/register")
                        .then()
                        .spec(response400)
                        .extract().as(RegisterUserResponse.class));

        step("Check displayed error", () ->
                assertThat(response.getError().equals("Missing email")));
    }
}
