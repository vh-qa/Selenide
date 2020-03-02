package ua.ek.registration;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ua.ek.model.User;
import ua.ek.pages.HomePage;
import ua.ek.pages.registration.AuthPage;
import ua.ek.registration.base.BaseAuthTest;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class AuthTest extends BaseAuthTest {

    private AuthPage authPage = new AuthPage();

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
        $(By.xpath(authPage.getNickXpath())).shouldHave(Condition.text("some_login_14"));

        $(By.xpath(authPage.getLogOutFromUserProfileLinkXpath())).click();
        $(By.xpath(authPage.getLinkEnterXpath())).shouldHave(Condition.text("Войти"));
    }

    @Test
    public void authSuccessfulTestWithEmail(){

        User user = getUserData();

        SelenideElement loginElement = $(By.xpath(authPage.getLoginOrEmailAuthFieldXpath()));
        authPage.getHelper().enterTextIntoTextField(loginElement, user.getLogin());

        SelenideElement passwordElement = $(By.xpath(authPage.getPasswordAuthFieldXpath()));
        authPage.getHelper().enterTextIntoTextField(passwordElement, user.getPassword());

        $(By.xpath(authPage.getSubmitButtonAuthXpath())).click();
        $(By.xpath(authPage.getNickXpath())).shouldHave(Condition.text("some_login_14"));

        $(By.xpath(authPage.getLogOutFromUserProfileLinkXpath())).click();
        $(By.xpath(authPage.getLinkEnterXpath())).shouldHave(Condition.text("Войти"));
    }

    // Negative scenario

    @Test
    public void authUnSuccessfulTestWithLogin() {

        User user = getUserData();

        SelenideElement loginElement = $(By.xpath(authPage.getLoginOrEmailAuthFieldXpath()));
        authPage.getHelper().enterTextIntoTextField(loginElement, "");

        SelenideElement passwordElement = $(By.xpath(authPage.getPasswordAuthFieldXpath()));
        authPage.getHelper().enterTextIntoTextField(passwordElement, user.getPassword());

        $(By.xpath(authPage.getSubmitButtonAuthXpath())).click();
        $(By.xpath(authPage.getErrorLoginAuthXpath())).shouldHave(Condition.text("Введите логин/email!"));
        $(By.xpath(authPage.getCloseLinkRegistrationFormXpath())).click();
    }

    @Test
    public void authUnSuccessfulTestWithEmail() {

        User user = getUserData();

        SelenideElement loginElement = $(By.xpath(authPage.getLoginOrEmailAuthFieldXpath()));
        authPage.getHelper().enterTextIntoTextField(loginElement, "12345@company.com");

        SelenideElement passwordElement = $(By.xpath(authPage.getPasswordAuthFieldXpath()));
        authPage.getHelper().enterTextIntoTextField(passwordElement, user.getPassword());

        $(By.xpath(authPage.getSubmitButtonAuthXpath())).click();
        $(By.xpath(authPage.getErrorLoginAuthXpath())).shouldHave(Condition.text("Введите логин/email!"));
        $(By.xpath(authPage.getCloseLinkRegistrationFormXpath())).click();

    }

    @Test
    public void authUnSuccessfulTestWithPassword() {
        User user = getUserData();

        SelenideElement loginElement = $(By.xpath(authPage.getLoginOrEmailAuthFieldXpath()));
        authPage.getHelper().enterTextIntoTextField(loginElement, user.getLogin());

        SelenideElement passwordElement = $(By.xpath(authPage.getPasswordAuthFieldXpath()));
        authPage.getHelper().enterTextIntoTextField(passwordElement, "");

        $(By.xpath(authPage.getSubmitButtonAuthXpath())).click();
        $(By.xpath(authPage.getErrorPasswordAuthXpath())).shouldHave(Condition.text("Введите пароль!"));
        $(By.xpath(authPage.getCloseLinkRegistrationFormXpath())).click();
    }

    private User getUserData(){

        User user = new User();

        user.setLogin("some_login_14");
        user.setEmail("some_email_14@company.com");
        user.setPassword("some_password_14");

        return user;
    }
}