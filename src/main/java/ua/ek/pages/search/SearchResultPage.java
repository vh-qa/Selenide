package ua.ek.pages.search;

import ua.ek.base.BasePage;

public class SearchResultPage extends BasePage {

    private String searchListTitle = ".//h1[@class='t2']";

    public String getSearchListTitle() {
        return searchListTitle;
    }
}
