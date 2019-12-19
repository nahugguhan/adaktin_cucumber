package org.stepdefinition;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;

public class Hooks 
{
public static WebDriver driver;
@Before
public void beforeScenario()
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guhan S\\eclipse-workspace\\adaktin_cucumber\\driver\\chromedriver.exe");	
driver=new ChromeDriver();
driver.get("https://www.adactin.com/HotelApp/");
driver.manage().window().maximize();
}
@After
public void aterscenario()
{
driver.quit();	
}
}
