package ua.ek.tablets.filters;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ua.ek.pages.tablets.TabletsListPage;
import ua.ek.pages.tablets.filters.DisplayDiagonalFilter;
import ua.ek.tablets.filters.base.BaseTabletsTest;

import static com.codeborne.selenide.Selenide.$;

public class DisplayDiagonalTest extends BaseTabletsTest {

    private DisplayDiagonalFilter displayDiagonalFilter = new DisplayDiagonalFilter();
    private TabletsListPage tabletsListPage = new TabletsListPage();

    @Test
    public void displayDiagonalFilterTest() {
        $(By.xpath(displayDiagonalFilter.getDisplayDiagonal10inch())).click();
        $(By.xpath(displayDiagonalFilter.getShowButtonXpath())).click();

        $(By.xpath(tabletsListPage.getTitlePageXPath())).shouldHave(Condition.text("Планшеты 10 дюймов"));
        $(By.xpath(tabletsListPage.getTextPricesFieldXPath())).shouldHave(Condition.text("Диагональ 10"));
    }
}