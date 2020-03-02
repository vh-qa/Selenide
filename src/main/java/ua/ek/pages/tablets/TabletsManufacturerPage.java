package ua.ek.pages.tablets;

import ua.ek.base.BasePage;

public class TabletsManufacturerPage extends BasePage {

    private String pageTitle = ".//div[@class='page-title']/h1[@class='t2']";

    public String getPageTitle(){
        return pageTitle;
    }
}