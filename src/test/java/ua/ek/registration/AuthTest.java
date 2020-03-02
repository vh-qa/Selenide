package ua.ek.registration;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ua.ek.model.User;
import ua.ek.pages.registration.AuthPage;
import ua.ek.registration.base.BaseAuthTest;

import static com.codeborne.selenide.Selenide.$;

public class AuthTest extends BaseAuthTest {

    AuthPage authPage = new AuthPage();

    @BeforeTest
    public void openRegistryFormBeforeTest(){
        $(By.xpath(authPage.getAuthLinkXpath())).click();
    }

    // Positive scenario

    @Test
    public void authSuccessfulTestWithLogin(){

        User user = getUserData();

        SelenideElement loginElement = $(By.xpath(authPage.getLoginOrEmailAuthFieldXpath()));
        authPage.getHelper().enterTextIntoTextField(loginElement, user.getLogin());

        SelenideElement passwordElement = $(By.xpath(authPage.getPasswordAuthFieldXpath()));
        authPage.getHelper().enterTextIntoTextField(passwordElement, user.getPassword());

        $(By.xpath(authPage.getSubmitButtonAuthXpath())).click();
        $(By.xpath(authPage.getNickXpath())).shouldHave(Condition.text("FL"));

        $(By.xpath(authPage.getLogOutFromUserProfileLinkXpath())).click();
        $(By.xpath(authPage.getLinkEnterXpath())).shouldHave(Condition.exactText("Войти"));
    }

    @Test
    public void authSuccessfulTestWithEmail(){
        User user = getUserData();

        SelenideElement loginElement = $(By.xpath(authPage.getLoginOrEmailAuthFieldXpath()));
        authPage.getHelper().enterTextIntoTextField(loginElement, user.getLogin());

        SelenideElement passwordElement = $(By.xpath(authPage.getPasswordAuthFieldXpath()));
        authPage.getHelper().enterTextIntoTextField(passwordElement, user.getPassword());

        $(By.xpath(authPage.getSubmitButtonAuthXpath())).click();
        $(By.xpath(authPage.getNickXpath())).shouldHave(Condition.text("FL"));

        $(By.xpath(authPage.getLogOutFromUserProfileLinkXpath())).click();
        $(By.xpath(authPage.getLinkEnterXpath())).shouldHave(Condition.exactText("Войти"));
    }

    private User getUserData(){
        User user = new User();

        user.setLogin("FL");
        user.setEmail("info.biz.box1@gmail.com");
        user.setPassword("somepassword1357");

        return user;
    }
}