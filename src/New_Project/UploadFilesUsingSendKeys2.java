package New_Project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFilesUsingSendKeys2 {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:/selenium/Jan_2024/Drivers_folder/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://github.com/settings/profile");
		
		/*WebElement ele = driver.findElement(By.xpath("//input[@id='fileupload1']"));
			Actions act= new Actions(driver);
		act.moveToElement(ele).perform();
		driver.quit();
		ele.click();*/
	
	}
	

}
