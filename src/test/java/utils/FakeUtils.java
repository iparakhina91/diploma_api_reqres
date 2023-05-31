package utils;

import com.github.javafaker.Faker;

public class FakeUtils {

    public static String getFakeName() {
        return new Faker().harryPotter().character();
    }

    public static String getFakeJob() {
        return new Faker().harryPotter().spell();
    }

    public static Integer getFakeUserId() {
        return new Faker().number().numberBetween(1, 10);
    }

    public static String getFakeEmail() {
        return new Faker().internet().emailAddress();
    }

    public static String getFakePassword() {
        return new Faker().harryPotter().location();
    }

}
