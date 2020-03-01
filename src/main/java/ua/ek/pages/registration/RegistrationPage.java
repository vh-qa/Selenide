package ua.ek.pages.registration;

import ua.ek.base.BasePage;

public class RegistrationPage extends BasePage{

    private String registerLinkXpath = ".//em[contains(text(), 'Регистрация')]"; // 'Регистрация' link on the registration form

    // Locators for registration form fields
    private String loginFieldXpath = ".//input[@placeholder='Имя']";
    private String emailFieldXpath = ".//input[@placeholder='e-mail']";
    private String passwordFieldXpath = ".//input[@placeholder='пароль']";
    private String submitButtonXpath = ".//input[@name='new_reg_' and @class='l-but2']";
    private String userAgreementXpath = ".//input[@name='rules_accepted_']";
    private String closeLinkRegistrationFormXpath = ".//div[@class='jclose']";

    // Locators for error text links
    private String loginErrorElementXpath = ".//div[@class='l-err' and contains(text(), 'Имя')]"; // Заполните поле "Имя"
    private String emailErrorElementXpath = ".//div[@class='l-err' and contains(text(), 'email')]"; // Заполните поле "email"
    private String emailIncorrectErrorElementXpath = ".//div[@class='l-err' and contains(text(), 'e-mail')]"; // Поле "e-mail" введено некорректно
    private String passwordErrorElementXpath = ".//div[@class='l-err' and contains(text(), 'Пароль')]"; // Заполните поле "Пароль"

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

    public String getUserAgreementXpath() {
        return userAgreementXpath;
    }

    public String getCloseLinkRegistrationFormXpath() {
        return closeLinkRegistrationFormXpath;
    }

    public String getLoginErrorElementXpath() {
        return loginErrorElementXpath;
    }

    public String getEmailErrorElementXpath() {
        return emailErrorElementXpath;
    }

    public String getEmailIncorrectErrorElementXpath() {
        return emailIncorrectErrorElementXpath;
    }

    public String getPasswordErrorElementXpath() {
        return passwordErrorElementXpath;
    }
}