package ua.ek.registration;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ua.ek.model.User;
import ua.ek.pages.registration.AuthPage;
import ua.ek.pages.registration.RegistrationPage;
import ua.ek.registration.base.BaseAuthTest;
import ua.ek.utils.DataGenerator;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class RegistrationTest extends BaseAuthTest {

    private RegistrationPage registrationPage = new RegistrationPage();

    @BeforeTest
    public void openRegistryFormBeforeTest(){
        $(By.xpath(registrationPage.getRegisterLinkXpath())).click();
    }

    // Negative scenario

    @Test
    public void loginFieldRegistrationFormTestEmptyLogin() {
        SelenideElement selenideElement = $(By.xpath(registrationPage.getLoginFieldXpath()));
        registrationPage.getHelper().enterTextIntoTextField(selenideElement, "");

        $(By.xpath(registrationPage.getSubmitButtonXpath())).click();
        $(By.xpath(registrationPage.getLoginErrorElementXpath()))
                .shouldHave(exactText("Заполните поле \"Имя\""));
    }

    @Test
    public void emailFieldRegistrationFormTestEmptyEmail() {
        SelenideElement selenideElement = $(By.xpath(registrationPage.getEmailFieldXpath()));
        registrationPage.getHelper().enterTextIntoTextField(selenideElement, "");

        $(By.xpath(registrationPage.getSubmitButtonXpath())).click();
        $(By.xpath(registrationPage.getEmailErrorElementXpath()))
                .shouldHave(exactText("Заполните поле \"email\""));
    }

    @Test
    public void emailFieldRegistrationFormTestIncorrectEmail() {
        SelenideElement selenideElement = $(By.xpath(registrationPage.getEmailFieldXpath()));
        registrationPage.getHelper().enterTextIntoTextField(selenideElement, "some_email");

        $(By.xpath(registrationPage.getSubmitButtonXpath())).click();
        $(By.xpath(registrationPage.getEmailIncorrectErrorElementXpath()))
                .shouldHave(exactText("Поле \"e-mail\" введено некорректно"));
    }

    @Test
    public void passwordFieldRegistrationFormEmptyPassword(){
        SelenideElement selenideElement = $(By.xpath(registrationPage.getPasswordFieldXpath()));
        registrationPage.getHelper().enterTextIntoTextField(selenideElement, "");

        $(By.xpath(registrationPage.getSubmitButtonXpath())).click();
        $(By.xpath(registrationPage.getPasswordErrorElementXpath()))
                .shouldHave(exactText("Заполните поле \"Пароль\""));
    }

    // Positive scenario

    @Test
    public void successfulUserRegistration() {

        User user = DataGenerator.getUser();

        SelenideElement login = $(By.xpath(registrationPage.getLoginFieldXpath()));
        registrationPage.getHelper().enterTextIntoTextField(login, user.getLogin());

        SelenideElement email = $(By.xpath(registrationPage.getEmailFieldXpath()));
        registrationPage.getHelper().enterTextIntoTextField(email, user.getEmail());

        SelenideElement password = $(By.xpath(registrationPage.getPasswordFieldXpath()));
        registrationPage.getHelper().enterTextIntoTextField(password, user.getPassword());

        $(By.xpath(registrationPage.getSubmitButtonXpath())).click();
        $(By.xpath(registrationPage.getSuccessfulUserRegistrationElement())).shouldHave(text("Регистрация прошла успешно!"));
    }
}