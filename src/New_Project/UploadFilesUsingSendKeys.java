package New_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.CTX_RESTRICT_SCOPE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFilesUsingSendKeys {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "C:/selenium/Jan_2024/Drivers_folder/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://github.com/settings/profile");
		WebElement username= driver.findElement(By.xpath("//*[@id='login_field']"));
		username.sendKeys("");
		WebElement password=driver.findElement(By.xpath("//*[@id='password']"));
		password.sendKeys("");
		WebElement signin=driver.findElement(By.xpath("//*[@class='btn btn-primary btn-block js-sign-in-button']"));
		signin.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='position-absolute color-bg-default rounded-2 color-fg-default px-2 py-1 left-0 bottom-0 ml-2 mb-2 border']")).click(); //link text locator for uploading a photo..
		Thread.sleep(3000);
		WebElement addFile = driver.findElement(By.xpath("//label[@class='dropdown-item text-normal']"));
		addFile.click();
		Thread.sleep(4000);
		String uploadFile = "D:\\Ashwini\\Downloads\\ashu.jpg";
		setClipBoard(uploadFile);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//span[text()='Set new profile picture']")).click();
		
	
			/*Actions act= new Actions(driver);
		act.moveToElement(ele).perform();
		driver.quit();
		ele.click();*/
	
	}
	
	public static void setClipBoard( String uploadFile)
	{
		StringSelection obj= new StringSelection(uploadFile);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
	}
	

}
