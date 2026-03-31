package com.day15;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TakeScreenShotPractice {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver wd = new ChromeDriver(options);
		
		
		wd.get("https://www.google.com/");
		
		String filePath = "./src/main/resources/screenshot/";
		TakesScreenshot ts = (TakesScreenshot) (wd);
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(filePath+"screenshot.png");
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		wd.quit();
	}

}
