package ua.ek.pages.tablets;

import ua.ek.base.BasePage;

public class TabletsListPage extends BasePage {

    private String titlePageXPath = ".//div[@class='page-title']/h1[@class='t2']";
    private String textPricesFieldXPath = ".//td[@class='list-filter-param']/a";

    public String getTitlePageXPath() {
        return titlePageXPath;
    }

    public String getTextPricesFieldXPath() {
        return textPricesFieldXPath;
    }
}
