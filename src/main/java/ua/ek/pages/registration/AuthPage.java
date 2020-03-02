package ua.ek.pages.registration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.ek.base.BasePage;

public class AuthPage extends BasePage {

    // Auth page
    private String authLinkXpath = ".//div[@class='l-m']/div/em[contains(text(),'Войти')]"; // 'Войти' link on the registration form
    private String loginOrEmailAuthFieldXpath = ".//div[@id='mui_user_login_window_avt']/input[@type='text']";
    private String passwordAuthFieldXpath = ".//div[@id='mui_user_login_window_avt']/div/input[@type='password']";
    private String submitButtonAuthXpath = ".//input[@type='submit' and @value='Войти']";
    private String errorLoginAuthXpath = ".//div[@class='l-err' and contains(text(),'Введите логин')]"; // Введите логин/email!
    private String errorPasswordAuthXpath = ".//div[@class='l-err' and contains(text(),'Введите пароль')]"; // Введите пароль!
    private String closeLinkRegistrationFormXpath = ".//div[@class='jclose']";

    // User Profile page
    private String nickXpath = ".//a[@class='info-nick']";
    private String editUserMenuXpath = ".//a[@class='user-menu__edit']";
    private String nickInUserProfileXpath = ".//input[@class='ek-form-control' and @name='p_[NikName]']"; // Ваш ник (check value attribute)
    private String emailInUserProfileXpath = ".//input[@class='ek-form-control' and @name='p_[EMail]']"; // E-mail (check value attribute)
    private String logOutFromUserProfileLinkXpath = ".//a[@class='help2']";

    public String getAuthLinkXpath() {
        return authLinkXpath;
    }

    public String getLoginOrEmailAuthFieldXpath() {
        return loginOrEmailAuthFieldXpath;
    }

    public String getPasswordAuthFieldXpath() {
        return passwordAuthFieldXpath;
    }

    public String getSubmitButtonAuthXpath() {
        return submitButtonAuthXpath;
    }

    public String getErrorLoginAuthXpath() {
        return errorLoginAuthXpath;
    }

    public String getErrorPasswordAuthXpath() {
        return errorPasswordAuthXpath;
    }

    public String getCloseLinkRegistrationFormXpath() {
        return closeLinkRegistrationFormXpath;
    }

    public String getNickXpath() {
        return nickXpath;
    }

    public String getEditUserMenuXpath() {
        return editUserMenuXpath;
    }

    public String getNickInUserProfileXpath() {
        return nickInUserProfileXpath;
    }

    public String getEmailInUserProfileXpath() {
        return emailInUserProfileXpath;
    }

    public String getLogOutFromUserProfileLinkXpath() {
        return logOutFromUserProfileLinkXpath;
    }
}