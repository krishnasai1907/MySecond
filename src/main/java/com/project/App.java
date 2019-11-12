package com.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class App 
{
    @Test
    public void Mytest()
    { 
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://opensource-demo.orangehrmlive.com/");
    	driver.close();
    }
}
