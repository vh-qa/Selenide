package ua.ek.pages.tablets;

import ua.ek.base.BasePage;
import ua.ek.pages.tablets.filters.DisplayDiagonalFilter;
import ua.ek.pages.tablets.filters.ManufacturersFilter;

public class TabletsPage extends BasePage {

    ManufacturersFilter manufacturersFilter = new ManufacturersFilter();
    DisplayDiagonalFilter displayDiagonalFilter = new DisplayDiagonalFilter();

    public ManufacturersFilter getManufacturersFilter() {
        return manufacturersFilter;
    }

    public DisplayDiagonalFilter getDisplayDiagonalFilter() {
        return displayDiagonalFilter;
    }
}
