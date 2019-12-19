package org.locators;

import org.baseClass.baseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hooks;

public class page3 extends baseClass
{
public page3() {
	PageFactory.initElements(Hooks.driver, this);
}
@FindBy(id="radiobutton_0")
private WebElement radiobutton;
@FindBy(id="continue")
private WebElement continuee;
public WebElement getRadiobutton() {
	return radiobutton;
}
public WebElement getContinuee() {
	return continuee;
}
}
