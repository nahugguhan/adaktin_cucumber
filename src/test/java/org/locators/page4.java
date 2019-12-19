package org.locators;

import org.baseClass.baseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hooks;

public class page4 extends baseClass 
{
public page4() {
	PageFactory.initElements(Hooks.driver, this);
}@FindBy(id="first_name")
private WebElement firstname;
@FindBy(id="last_name")
private WebElement lastname;
@FindBy(id="address")
private WebElement add;
@FindBy(id="cc_num")
private WebElement cardno;
@FindBy(id="cc_type")
private WebElement cctype;
@FindBy(id="cc_exp_month")
private WebElement ccmonth;
@FindBy(id="cc_exp_year")
private WebElement ccyear;
@FindBy(id="cc_cvv")
private WebElement cvv;
@FindBy(id="book_now")
private WebElement booknow;
public WebElement getFirstname() {
	return firstname;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getAdd() {
	return add;
}
public WebElement getCardno() {
	return cardno;
}
public WebElement getCctype() {
	return cctype;
}
public WebElement getCcmonth() {
	return ccmonth;
}
public WebElement getCcyear() {
	return ccyear;
}
public WebElement getCvv() {
	return cvv;
}
public WebElement getBooknow() {
	return booknow;
}
}
