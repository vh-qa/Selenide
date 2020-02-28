package ua.ek;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ua.ek.pages.AuthPage;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class AuthTest {

    AuthPage authPage = new AuthPage();

    @BeforeTest
    public void openRegistryForm(){
        open(authPage.getHomePageUrl());
        $(By.xpath(authPage.getLinkEnterXpath())).click();
        $(By.xpath(authPage.getRegisterLinkXpath())).click();
    }

    @Test
    public void registrationFormTest() {
        $(By.xpath(authPage.getLoginFieldXpath())).sendKeys("");
        $(By.xpath(authPage.getSubmitButtonXpath())).click();
        $(By.xpath(authPage.getLoginErrorElementXpath())).shouldHave(text("Заполните поле \"Имя\""));
    }

    @Test
    public void emailFieldRegistrationFormTestEmptyEmail() {
        $(By.xpath(authPage.getEmailFieldXpath())).sendKeys("");
        $(By.xpath(authPage.getSubmitButtonXpath())).click();
        $(By.xpath(authPage.getEmailErrorElementXpath())).shouldHave(text("Заполните поле \"email\""));
    }

    @Test
    public void emailFieldRegistrationFormTestIncorrectEmail() {
        $(By.xpath(authPage.getEmailFieldXpath())).sendKeys("some-email");
        $(By.xpath(authPage.getSubmitButtonXpath())).click();
        $(By.xpath(authPage.getEmailErrorElementXpath())).shouldHave(text("Поле \"e-mail\" введено некорректно"));
    }

    @Test
    public void passwordFieldRegistrationFormTest(){
        $(By.xpath(authPage.getPasswordFieldXpath())).sendKeys("");
        $(By.xpath(authPage.getSubmitButtonXpath())).click();
        $(By.xpath(authPage.getPasswordErrorElementXpath())).shouldHave(text("Заполните поле \"Пароль\""));
    }

}
