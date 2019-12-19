package org.locators;

import org.baseClass.baseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hooks;

public class page2 extends baseClass
{
public page2() {
	PageFactory.initElements(Hooks.driver, this);
}
@FindBy(xpath="//select[@name='location']")
private WebElement location;
@FindBy(id="hotels")
private WebElement hotel;
@FindBy(id="room_type")
private WebElement rometype;
@FindBy(id="room_nos")
private WebElement roomno;
@FindBy(id="datepick_in")
private WebElement checkin;
@FindBy(id="datepick_out")
private WebElement checkout;
@FindBy(id="adult_room")
private WebElement adult;
@FindBy(id="child_room")
private WebElement child;
@FindBy(id="Submit")
private WebElement submit;
public WebElement getLocation() {
	return location;
}
public WebElement getHotel() {
	return hotel;
}
public WebElement getRometype() {
	return rometype;
}
public WebElement getRoomno() {
	return roomno;
}
public WebElement getCheckin() {
	return checkin;
}
public WebElement getCheckout() {
	return checkout;
}
public WebElement getAdult() {
	return adult;
}
public WebElement getChild() {
	return child;
}
public WebElement getSubmit() {
	return submit;
}
}
