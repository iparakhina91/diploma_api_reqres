package tests;

import utils.FakeUtils;

import static utils.FakeUtils.*;

public class TestData {

    FakeUtils fakeUserUtils = new FakeUtils();

    public static String
            fakeName = getFakeName(),
            fakeJob = getFakeJob(),
            fakeEmail = getFakeEmail(),
    fakePassword = getFakePassword();

    public static final Integer
            fakeId = getFakeUserId();
}
