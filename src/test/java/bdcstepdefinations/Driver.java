package bdcstepdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
	public static WebDriver configurationDriver(String browserName)
	{
		WebDriver driver = null;
		if(browserName.equals("explorer"))
		{
			 System.setProperty("webdriver.gecko.driver",
					  "C:\\Users\\gousiya.biradar\\Drivers\\geckodriver.exe");
			 driver = new InternetExplorerDriver();
		}
		else if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					  "C:\\Users\\gousiya.biradar\\Drivers\\chromedriver.exe");
			  driver = new ChromeDriver();
		}
		
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",
					  "C:\\Users\\gousiya.biradar\\Drivers\\geckodriver.exe");
			  driver = new FirefoxDriver();
		}
		return driver;
	}

}
