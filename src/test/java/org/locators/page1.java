package org.locators;

import org.baseClass.baseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hooks;

public class page1 extends baseClass
{
public page1() {
	PageFactory.initElements(Hooks.driver, this);
}
@FindBy(id="username")
private WebElement name;
@FindBy(id="password")
private WebElement pass;
@FindBy(id="login")
private WebElement btn;
public WebElement getName() {
	return name;
}
public WebElement getPass() {
	return pass;
}
public WebElement getBtn() {
	return btn;
}
}
