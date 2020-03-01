package ua.ek.tablets.filters.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import ua.ek.pages.HomePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public abstract class BaseTabletsTest {

    private HomePage homePage = new HomePage();

    @BeforeTest
    public void openTabletsPageWithFiltersBeforeTest(){

        Configuration.startMaximized = true;
        open(homePage.getHomePageUrl());

        $(By.xpath(homePage.getComputersMenuLinkXpath())).shouldBe(visible).click();
        SelenideElement selenideElement = $(By.xpath(homePage.getTabletsSubMenuLinkXpath()));
        Selenide.executeJavaScript("arguments[0].click();", selenideElement);
    }
}