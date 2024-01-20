package New_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/Jan_2024/Drivers_folder/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		driver.findElement(By.xpath("//button[@id='simpleAlert']")).click();
		Alert alert=driver.switchTo().alert();
		 String alertTest = alert.getText();
		 System.out.println(alertTest);
		Thread.sleep(5000);
		driver.quit();

	}

}
