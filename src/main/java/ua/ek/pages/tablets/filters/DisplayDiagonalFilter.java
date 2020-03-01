package ua.ek.pages.tablets.filters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DisplayDiagonalFilter {

    private String displayDiagonal10inch = ".//label[@for='c5699']";
    private String showButtonXpath = ".//*[@id='tt-info']/a";

    public String getDisplayDiagonal10inch() {
        return displayDiagonal10inch;
    }

    public String getShowButtonXpath() {
        return showButtonXpath;
    }
}
