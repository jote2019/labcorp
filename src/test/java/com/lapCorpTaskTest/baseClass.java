package com.lapCorpTaskTest;


	

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Parameters;
	import com.google.common.io.Files;

import org.openqa.selenium.WebDriver;

	public class baseClass {
		
		public WebDriver driver; 
		
		@Parameters("browser")
		@BeforeClass
		
		public WebDriver initializeDriver() throws IOException {
			
			Properties pro=new Properties();
			FileInputStream f=new FileInputStream("./resources/configuration.properties");
			pro.getProperty("browser");
			pro.load(f);
			String browserName =pro.getProperty("browser");
			
			
			if(browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\mires\\eclipse-workspace\\lapCorpTas\\Drivers\\chromedriver.exe");
			     driver= new ChromeDriver();
			}
			else if(browserName.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			     driver= new FirefoxDriver();
			}
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;
		}

		
	     @AfterClass
	  public void tearDown() {
		  driver.close();
	  }
	}


