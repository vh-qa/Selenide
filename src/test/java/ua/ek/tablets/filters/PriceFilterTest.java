package ua.ek.tablets.filters;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ua.ek.pages.tablets.TabletsListPage;
import ua.ek.pages.tablets.filters.PriceFilter;
import ua.ek.tablets.filters.base.BaseTabletsTest;
import static com.codeborne.selenide.Selenide.$;

public class PriceFilterTest extends BaseTabletsTest {

    private PriceFilter priceFilter = new PriceFilter();
    private TabletsListPage tabletsListPage = new TabletsListPage();

    @Test
    public void priceFilterTest() {
        SelenideElement minPrice = $(By.xpath(priceFilter.getMinPriceInputXpath()));
        priceFilter.getHelper().enterTextIntoTextField(minPrice, "5000");

        SelenideElement maxPrice = $(By.xpath(priceFilter.getMaxPriceInputXpath()));
        priceFilter.getHelper().enterTextIntoTextField(minPrice, "9999");

        $(By.xpath(priceFilter.getShowButtonXpath())).click();

        $(By.xpath(tabletsListPage.getTitlePageXPath())).shouldHave(Condition.text("Планшеты"));
        $(By.xpath(tabletsListPage.getTextPricesFieldXPath())).shouldHave(Condition.text("от 5000 до 9999 грн."));
    }
}