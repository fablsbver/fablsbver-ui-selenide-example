package com.github.fablsbver.tests.page_tests;

import com.github.fablsbver.pages.home_page.HomePage;
import com.github.fablsbver.pages.practice_pages.HoversPracticePage;
import com.github.fablsbver.tests.base_test.BaseTest;
import org.junit.jupiter.api.Test;

public class HoversPracticePageTest extends BaseTest {

    @Test
    public void hoverTest() {
        HoversPracticePage hoversPracticePage = new HomePage()
                .openPage()
                .clickHoversBtn();
        hoversPracticePage
                .hoverOverImage()
                .clickUsersLink()
                .checkUserProfile();
    }
}
