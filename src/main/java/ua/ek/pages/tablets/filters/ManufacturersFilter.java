package ua.ek.pages.tablets.filters;

import ua.ek.base.BasePage;

public class ManufacturersFilter extends BasePage implements IManufacturersFilter {
    
    private String manufacturerAppleCheckBoxXpath = ".//*[@id='li_br116']/label";
    private String showButtonXpath = ".//*[@id='tt-info']/a";

    @Override
    public String getManufacturerAppleCheckBoxXpath() {
        return manufacturerAppleCheckBoxXpath;
    }

    @Override
    public String getShowButtonXpath() {
        return showButtonXpath;
    }
}