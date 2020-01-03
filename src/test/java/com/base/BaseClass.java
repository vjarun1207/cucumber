package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.stepdefinition.Hooks;

public class BaseClass {
public static WebDriver driver;
public static Actions acc;
public static Robot rc;

public static void launch() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER PC\\eclipse-workspace\\allnew\\Cucumbercheck\\Driver\\chromedriver.exe");
	 driver=new ChromeDriver();
}

public static void loadUrl(String url) {
driver.get(url);
}
public static void nv(String url) {
driver.navigate().to(url);;
}
public static void m() {
driver.manage();
}
public static void c() {
driver.close();

}
public static void q() {
driver.quit();
}
public static void sT(String s) {
driver.switchTo().frame(s);
}
public static void gWh() {
String windowHandle = driver.getWindowHandle();
System.out.println("windowHandle");
}
public static void gWhs() {
Set<String> windowHandles = driver.getWindowHandles();
System.out.println("windowHandles");
}
public static void gcUrl() {
String currentUrl = driver.getCurrentUrl();
System.out.println(" currentUrl");
}
public static void gPs() {
driver.getPageSource();
}
public static void cl(WebElement e) {
e.click();
}
public static void clr(WebElement e) {
e.clear();

}
public static void sm(WebElement e) {
e.submit();
}
public static void gt(WebElement e) {
String text = e.getText();
System.out.println("text");


}
public static void enable(WebElement e) {
boolean enabled = e.isEnabled();
String s = String.valueOf(enabled);
if(s.contains("true")) {
	System.out.println("true");
}
else {
	System.out.println("false");
}
System.out.println("enabled");
}
public static void display(WebElement e) {
boolean displayed = e.isDisplayed();
System.out.println("displayed");


}
public static void ga(WebElement e,String value) {
String s = e.getAttribute(value);
System.out.println(s);

}
public static void gs(WebElement e) {
Dimension size = e.getSize();
System.out.println(size);


}
public static void css(WebElement e,String u) {
String cssValue = e.getCssValue(u);
System.out.println("cssValue");
}
public static void sk(WebElement s,String e) {

s.sendKeys(e);
}
public static void dnd(WebElement w,WebElement s) {
 acc=new Actions(driver);
acc.dragAndDrop(w, s).perform();



}
public static void accSk(WebElement ref,String v) {
acc.sendKeys(ref, v).perform();


}
public static void up() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_UP);
rc.keyRelease(KeyEvent.VK_UP);
}
public static void down() throws AWTException {
Robot rc=new Robot();
rc.keyPress(KeyEvent.VK_DOWN);
rc.keyRelease(KeyEvent.VK_DOWN);
}

}
