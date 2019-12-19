package org.baseClass;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.stepdefinition.Hooks;

public class baseClass 
{
public static void launch(String url)
{
Hooks.driver.get(url);	
}
public static void type(WebElement w,String s)
{
w.sendKeys(s);	
}
public static void click(WebElement w)
{
w.click();	
}
public static void selectbytext(WebElement w,String s)
{
Select se=new Select(w);
se.selectByVisibleText(s);
}
public static void alert()
{
Alert a=Hooks.driver.switchTo().alert();
a.accept();
}
public static void scrolldown(WebElement w)
{
JavascriptExecutor j=(JavascriptExecutor)Hooks.driver;
j.executeScript("arguments[0],Scrollintoview(true)", w);
}
public static void alertj(WebElement w)
{
JavascriptExecutor j=(JavascriptExecutor)Hooks.driver;
j.executeScript("arguments[0].click", w);
}
public static void screenshot(String path) throws Exception
{
TakesScreenshot tk=(TakesScreenshot)Hooks.driver;
File src=tk.getScreenshotAs(OutputType.FILE);
File dec=new File(path);
FileUtils.copyFile(src, dec);
}
}
