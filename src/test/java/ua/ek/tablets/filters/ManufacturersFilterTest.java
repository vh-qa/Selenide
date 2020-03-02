package ua.ek.tablets.filters;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ua.ek.pages.tablets.TabletsListPage;
import ua.ek.pages.tablets.filters.ManufacturersFilter;
import ua.ek.tablets.filters.base.BaseTabletsTest;
import static com.codeborne.selenide.Selenide.$;

public class ManufacturersFilterTest extends BaseTabletsTest {

    private ManufacturersFilter manufacturersFilter = new ManufacturersFilter();
    private TabletsListPage tabletsListPage = new TabletsListPage();

    @Test
    public void manufacturersFilterTest(){
        $(By.xpath(manufacturersFilter.getManufacturerAppleCheckBoxXpath())).click();
        $(By.xpath(manufacturersFilter.getShowButtonXpath())).click();

        $(By.xpath(tabletsListPage.getTitlePageXPath())).shouldHave(Condition.text("Планшеты Apple"));
        $(By.xpath(tabletsListPage.getTextPricesFieldXPath())).shouldHave(Condition.text("Apple"));
    }
}