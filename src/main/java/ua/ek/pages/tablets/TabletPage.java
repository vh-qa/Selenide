package ua.ek.pages.tablets;

import ua.ek.base.BasePage;

public class TabletPage extends BasePage {
    private String minPriceFieldXpath = ".//div/input[@name='minPrice_']";
    private String maxPriceFieldXpath = ".//div/input[@name='maxPrice_']";
    private String submitButtonXpath = ".//input[@type='submit' and @class='price-sub']";

    public String getMinPriceFieldXpath() {
        return minPriceFieldXpath;
    }

    public String getMaxPriceFieldXpath() {
        return maxPriceFieldXpath;
    }

    public String getSubmitButtonXpath() {
        return submitButtonXpath;
    }
}