package ua.ek.pages.tablets.filters;

import ua.ek.base.BasePage;

public class PriceFilter extends BasePage {
    private String minPriceInputXpath = ".//input[@id='minPrice_']";
    private String maxPriceInputXpath = ".//input[@id='maxPrice_']";
    private String showButtonXpath = ".//*[@id='tt-info']/a";

    public String getMinPriceInputXpath() {
        return minPriceInputXpath;
    }

    public String getMaxPriceInputXpath() {
        return maxPriceInputXpath;
    }

    public String getShowButtonXpath() {
        return showButtonXpath;
    }
}