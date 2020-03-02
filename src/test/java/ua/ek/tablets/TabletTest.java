package ua.ek.tablets;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ua.ek.pages.tablets.TabletPage;
import ua.ek.pages.tablets.TabletsListPage;
import ua.ek.tablets.filters.base.BaseTabletsTest;
import static com.codeborne.selenide.Selenide.$;

public class TabletTest extends BaseTabletsTest {

    @Test
    public void tabletsPricesTest(){

        TabletPage tabletPage = new TabletPage();
        TabletsListPage tabletsListPage = new TabletsListPage();

        $(By.xpath(tabletPage.getMinPriceFieldXpath())).setValue("10000");
        $(By.xpath(tabletPage.getMaxPriceFieldXpath())).setValue("14999");

        $(By.xpath(tabletPage.getSubmitButtonXpath())).click();

        $(By.xpath(tabletsListPage.getTitlePageXPath())).shouldHave(Condition.text("Планшеты"));
        $(By.xpath(tabletsListPage.getTextPricesFieldXPath())).shouldHave(Condition.text("от 10000 до 14999 грн."));
    }
}