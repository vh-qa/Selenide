package ua.ek.registration.base;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import ua.ek.pages.HomePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BaseAuthTest {

    private HomePage homePage = new HomePage();

    @BeforeTest
    public void openTabletsPageWithFiltersBeforeTest(){

        Configuration.startMaximized = true;
        open(homePage.getHomePageUrl());
        $(By.xpath(homePage.getLinkEnterXpath())).shouldBe(visible).click();
    }
}