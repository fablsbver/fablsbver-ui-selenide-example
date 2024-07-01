package com.github.fablsbver.tests.page_tests;

import com.github.fablsbver.pages.home_page.HomePage;
import com.github.fablsbver.tests.base_test.BaseTest;
import org.junit.jupiter.api.Test;
import com.github.fablsbver.pages.practice_pages.BasicAuthenticationPage;

public class BasicAuthenticationPageTest extends BaseTest {

    @Test
    public void authenticationTest() {
        BasicAuthenticationPage basicAuthenticationPage = new HomePage()
                .openPage()
                .clickBasicAuthBtn();
        basicAuthenticationPage.switchAndLogIn();
    }
}
