package ua.ek.base;

public abstract class BasePage {
    private String homePageUrl = "https://ek.ua/";
    private String linkEnterXpath = ".//span[@class='wu_entr']//em";

    public String getHomePageUrl() {
        return homePageUrl;
    }

    public String getLinkEnterXpath() {
        return linkEnterXpath;
    }
}
