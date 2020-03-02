package ua.ek.pages.search;

import ua.ek.base.BasePage;

public class SearchPage extends BasePage {

    private String searchFieldXpath = ".//input[@id='ek-search']";
    private String searchButtonXpath = ".//button[@name='search_but_']";

    public String getSearchFieldXpath() {
        return searchFieldXpath;
    }

    public String getSearchButtonXpath() {
        return searchButtonXpath;
    }
}
