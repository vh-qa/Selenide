package ua.ek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.ek.base.BasePage;

public class AuthPage extends BasePage{

    private String registerLinkXpath = ".//em[contains(text(), 'Регистрация')]";

    private String loginFieldXpath = ".//input[@placeholder='Имя']";
    private String emailFieldXpath = ".//input[@placeholder='e-mail']";
    private String passwordFieldXpath = ".//input[@placeholder='пароль']";
    private String submitButtonXpath = ".//input[@name='new_reg_' and @class='l-but2']";

    @FindBy(xpath = ".//input[@name='rules_accepted_']")
    private WebElement userAgreement;

    @FindBy(xpath = ".//div[@class='jclose']")
    private WebElement closeLink;

    // Locators for error text links

    @FindBy(xpath = ".//div[@class='l-err' and contains(text(), 'Имя')]")
    private WebElement loginError; // Заполните поле "Имя"

    @FindBy(xpath = ".//div[@class='l-err' and contains(text(), 'email')]")
    private WebElement emailFillError; // Заполните поле "email"

    @FindBy(xpath = ".//div[@class='l-err' and contains(text(), 'e-mail')]")
    private WebElement emailCorrectError; // Поле "e-mail" введено некорректно

    @FindBy(xpath = ".//div[@class='l-err' and contains(text(), 'Пароль')]")
    private WebElement passwordError; // Заполните поле "Пароль"

    private String loginErrorElementXpath = ".//div[@class='l-err' and contains(text(), 'Имя')]";
    private String emailErrorElementXpath = ".//div[@class='l-err' and contains(text(), 'email')]";
    private String passwordErrorElementXpath = ".//div[@class='l-err' and contains(text(), 'Пароль')]";

    public String getRegisterLinkXpath() {
        return registerLinkXpath;
    }

    public String getLoginFieldXpath() {
        return loginFieldXpath;
    }

    public String getEmailFieldXpath() {
        return emailFieldXpath;
    }

    public String getPasswordFieldXpath() {
        return passwordFieldXpath;
    }

    public String getSubmitButtonXpath() {
        return submitButtonXpath;
    }

    public String getLoginErrorElementXpath() {
        return loginErrorElementXpath;
    }

    public String getEmailErrorElementXpath() {
        return emailErrorElementXpath;
    }

    public String getPasswordErrorElementXpath() {
        return passwordErrorElementXpath;
    }
}
