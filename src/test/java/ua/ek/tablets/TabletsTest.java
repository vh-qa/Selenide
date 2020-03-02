package ua.ek.tablets;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ua.ek.pages.tablets.TabletsManufacturerPage;
import ua.ek.pages.tablets.TabletsPage;
import ua.ek.tablets.filters.base.BaseTabletsTest;
import static com.codeborne.selenide.Selenide.$;

public class TabletsTest extends BaseTabletsTest {

    @Test
    public void tabletsPageFiltersTests(){

        TabletsPage tabletsPage = new TabletsPage();
        TabletsManufacturerPage tabletsManufacturerPage = new TabletsManufacturerPage();

        $(By.xpath(tabletsPage.getManufacturersFilter().getManufacturerAppleCheckBoxXpath())).click();
        $(By.xpath(tabletsPage.getDisplayDiagonalFilter().getDisplayDiagonal10inch())).scrollIntoView(true).click();
        $(By.xpath(tabletsPage.getDisplayDiagonalFilter().getShowButtonXpath())).click();

        $(By.xpath(tabletsManufacturerPage.getPageTitle())).shouldHave(Condition.text("Планшеты Apple 10\""));
    }
}