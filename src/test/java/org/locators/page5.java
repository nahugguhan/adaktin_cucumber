package org.locators;

import org.baseClass.baseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hooks;

public class page5 extends baseClass
{
public page5() {
	PageFactory.initElements(Hooks.driver, this);
}
@FindBy(id="my_itinerary")
private WebElement itinerary;
public WebElement getItinerary() {
	return itinerary;
}
}
