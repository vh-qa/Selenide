package ua.ek.base;

import ua.ek.utils.Helper;

public abstract class BasePage {

    private String homePageUrl = "https://ek.ua/";
    private String linkEnterXpath = ".//span[@class='wu_entr']/em"; // 'Войти' link in the upper right corner of the page

    private String computersMenuLinkXpath = ".//ul[contains(@class,'mainmenu-list')]/li/a[contains(text(),'Компьютеры')]";
    private String tabletsSubMenuLinkXpath = "(.//div[@class='mainmenu-sublist']/a[@class='mainmenu-subitem mainmenu-icon30'])[1]";

    private Helper helper = new Helper();

    public String getHomePageUrl() {
        return homePageUrl;
    }

    public String getLinkEnterXpath() {
        return linkEnterXpath;
    }

    public String getComputersMenuLinkXpath() {
        return computersMenuLinkXpath;
    }

    public String getTabletsSubMenuLinkXpath() {
        return tabletsSubMenuLinkXpath;
    }

    public Helper getHelper() {
        return helper;
    }
}