package New_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alerts2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/Jan_2024/Drivers_folder/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		driver.findElement(By.xpath("//button[@id='simpleAlert']")).click();
		Alert alert=driver.switchTo().alert();
		 if(isAlertIsPresent(driver))
		 {
			 System.out.println("Alert is present");
		 }
		 else
		 {
			 System.out.println("Alert is not present");
		 }
		 driver.quit();

	}
	
	public static boolean isAlertIsPresent(WebDriver ldriver)
	{
		try {
			Alert alert = ldriver.switchTo().alert();
			String alertText = alert.getText();
			System.out.println(alertText);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	

}
