package org.locators;

import org.baseClass.baseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hooks;

public class page6 extends baseClass 
{
public page6() {
	PageFactory.initElements(Hooks.driver, this);
}
@FindBy(xpath="//input[@name='ids[]']")
private WebElement buton;
@FindBy(xpath="//input[@name='cancelall']")
private WebElement cancel;
@FindBy(id="logout")
private WebElement logout;
public WebElement getButon() {
	return buton;
}
public WebElement getCancel() {
	return cancel;
}
public WebElement getLogout() {
	return logout;
}
}
