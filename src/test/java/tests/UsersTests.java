package tests;

import io.qameta.allure.*;
import models.UserBody;
import models.UserDataResponse;
import models.UserResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static specs.Specs.*;
import static tests.TestData.*;

public class UsersTests {

    public static final Integer USERID = 7;

    @Test
    @Tag("api")
    @Feature("Users tests")
    @Story("Create user")
    @Owner("korovina_iyu")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Create user with valid name and job")
    void createUser() {

        UserBody userData = new UserBody();
        userData.setName(fakeName);
        userData.setJob(fakeJob);

        UserResponse response = step("Create user", () ->
                given(request)
                        .body(userData)
                        .when()
                        .post("/users")
                        .then()
                        .spec(response201)
                        .extract().as(UserResponse.class));

        step("Verify name of created user", () ->
                assertThat(response.getName()).isEqualTo(fakeName));

        step("Verify job of created user", () ->
                assertThat(response.getJob()).isEqualTo(fakeJob));
    }

    @Test
    @Tag("api")
    @Feature("Users tests")
    @Story("Update user")
    @Owner("korovina_iyu")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Update name of user with existed id")
    void updateUser() {

        UserBody userData = new UserBody();
        userData.setName(fakeName);
        userData.setJob(fakeJob);

        UserResponse response = step("Update name of user with id " + fakeId, () ->
                given(request)
                        .body(userData)
                        .when()
                        .put("/users/" + fakeId)
                        .then()
                        .spec(response200)
                        .extract().as(UserResponse.class));

        step("Verify name of updated user with id " + fakeId, () ->
                assertThat(response.getName()).isEqualTo(fakeName));
    }

    @Test
    @Tag("api")
    @Feature("Users tests")
    @Story("Delete user")
    @Owner("korovina_iyu")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Delete user with existed id")
    void deleteUser() {
        step("Delete user with id " + fakeId, () ->
                given()
                        .spec(request)
                        .when()
                        .delete("/users/"+ fakeId)
                        .then()
                        .statusCode(204));
    }

    @Test
    @Tag("api")
    @Feature("Users tests")
    @Story("Get user info")
    @Owner("korovina_iyu")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Get info about existed user")
    void getInfoAboutSingleUser() {

        UserDataResponse responseData = step("Get info about user with id " + USERID, () ->
                given(request)
                        .when()
                        .get("/users/" + USERID)
                        .then()
                        .spec(response200)
                        .extract().as(UserDataResponse.class));

        step("Verify user id", () ->
                assertThat(responseData.getData().getId()).isEqualTo(USERID));

        step("Verify user email", () ->
                assertThat(responseData.getData().getEmail()).isEqualTo("michael.lawson@reqres.in"));

        step("Verify user firstName", () ->
                assertThat(responseData.getData().getFirstName()).isEqualTo("Michael"));

        step("Verify user lastName", () ->
                assertThat(responseData.getData().getLastName()).isEqualTo("Lawson"));

        step("Verify user avatar", () ->
                assertThat(responseData.getData().getAvatar()).isEqualTo("https://reqres.in/img/faces/7-image.jpg"));
    }
}