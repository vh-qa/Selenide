package ua.ek.pages.tablets.filters;

import ua.ek.base.BasePage;

public class ManufacturersFilter extends BasePage {
    
    private String manufacturerAppleCheckBoxXpath = ".//*[@id='li_br116']/label";
    private String showButtonXpath = ".//*[@id='tt-info']/a";

    public String getManufacturerAppleCheckBoxXpath() {
        return manufacturerAppleCheckBoxXpath;
    }

    public String getShowButtonXpath() {
        return showButtonXpath;
    }
}