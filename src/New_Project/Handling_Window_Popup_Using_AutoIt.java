package New_Project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Window_Popup_Using_AutoIt {
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:/selenium/Jan_2024/Drivers_folder/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(2000);
		//Runtime.getRuntime().exec("D:/Ashwini/Desktop/Selenium/autoit source code.exe");

	}
}

