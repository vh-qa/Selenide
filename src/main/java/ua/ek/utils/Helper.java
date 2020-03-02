package ua.ek.utils;

import com.codeborne.selenide.SelenideElement;

public class Helper {
    public void enterTextIntoTextField(SelenideElement selenideElement, String text) {
        selenideElement.setValue(text);
    }
}