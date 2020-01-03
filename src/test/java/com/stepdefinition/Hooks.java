package com.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
    
	@Before
	public void beforeScenario() {
	launch();

	}
	@After 
public void afterScenario() throws IOException {
	TakesScreenshot tk=(TakesScreenshot)driver;
	File loc = tk.getScreenshotAs(OutputType.FILE);
	File desc=new File("C:\\scr\\first.png");
	FileUtils.copyFile(loc, desc);
	driver.close();

}
}
