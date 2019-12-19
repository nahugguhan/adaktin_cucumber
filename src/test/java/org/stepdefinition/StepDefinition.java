package org.stepdefinition;

import org.baseClass.baseClass;
import org.locators.page1;
import org.locators.page2;
import org.locators.page3;
import org.locators.page4;
import org.locators.page5;
import org.locators.page6;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends baseClass
{
	page1 p1=new page1();
	page2 p2=new page2();
	page3 p3=new page3();
	page4 p4=new page4();
	page5 p5=new page5();
	page6 p6= new page6();
	
	@Given("launch the browser and launch the application")
	public void launch_the_browser_and_launch_the_application() 
	{
		System.out.println("launched");
	}

	@When("user login with username and password")
	public void user_login_with_username_and_password()
	{
		type(p1.getName(), "nahugguhan");
		type(p1.getPass(), "guhan@123");
		
	}
	
	@When("click loginbutton")
	public void click_loginbutton() throws Exception 
	{
		click(p1.getBtn());
		Thread.sleep(5000);
		
	}
	

	@When("user should enter the booking details")
	public void user_should_enter_the_booking_details() throws Exception 
	{
		selectbytext(p2.getLocation(), "London");
		selectbytext(p2.getHotel(), "Hotel Sunshine");
		selectbytext(p2.getRometype(), "Standard");
		selectbytext(p2.getRoomno(), "1 - One");
		type(p2.getCheckin(), "19/12/2019");
		type(p2.getCheckout(), "20/12/2019");
		selectbytext(p2.getAdult(), "2 - Two");
		selectbytext(p2.getChild(), "2 - Two");
		screenshot("D:\\tasks\\adaktin\\1.jpeg");
		click(p2.getSubmit());
		Thread.sleep(5000);
	}

	
	

	@When("select the available rooms")
	public void select_the_available_rooms() throws Exception 
	{
		click(p3.getRadiobutton());
		screenshot("D:\\tasks\\adaktin\\2.jpeg");
		click(p3.getContinuee());   
	}
	

	@When("user should fill the details")
	public void user_should_fill_the_details() throws Exception{
		type(p4.getFirstname(), "guhan");
		type(p4.getLastname(), "s");
		type(p4.getAdd(), "no 160 vadd");
		type(p4.getCardno(), "1111222233334444");
		selectbytext(p4.getCctype(), "VISA");
		selectbytext(p4.getCcmonth(), "January");
		selectbytext(p4.getCcyear(), "2016");
		type(p4.getCvv(), "123");
		screenshot("D:\\tasks\\adaktin\\3.jpeg");
		click(p4.getBooknow());
		Thread.sleep(10000);
		screenshot("D:\\tasks\\adaktin\\4.jpeg");  
	}

	@When("user should recheck")
	public void user_should_recheck() throws Exception {
		click(p5.getItinerary());
		Thread.sleep(10000);   
	}

	@When("user should able to cancel the booking and able to logout")
	public void user_should_able_to_cancel_the_booking_and_able_to_logout() throws Exception 
	{
		click(p6.getButon());
		click(p6.getCancel());
		alert();
		Thread.sleep(5000);
		click(p6.getLogout());
	}

	@Then("user can able to check all requirments")
	public void user_can_able_to_check_all_requirments() 
	{
	System.out.println("success");  
	}
}
