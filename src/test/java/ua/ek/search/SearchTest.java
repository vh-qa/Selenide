package ua.ek.search;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ua.ek.pages.HomePage;
import ua.ek.pages.search.SearchPage;
import ua.ek.pages.search.SearchResultPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTest {

    private HomePage homePage = new HomePage();
    private SearchPage searchPage = new SearchPage();
    private SearchResultPage searchResultPage = new SearchResultPage();

    @BeforeTest
    public void openTabletsPageWithFiltersBeforeTest(){

        Configuration.startMaximized = true;
        open(homePage.getHomePageUrl());
    }

    @Test
    public void searchTest(){

        $(By.xpath(searchPage.getSearchFieldXpath())).setValue("планшеты apple");
        $(By.xpath(searchPage.getSearchButtonXpath())).click();

        $(By.xpath(searchResultPage.getSearchListTitle())).shouldHave(Condition.text("Планшеты Apple"));
    }
}
