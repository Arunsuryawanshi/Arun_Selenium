import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v105.page.Page.GetAppIdResponse;
import org.testng.Assert;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(true);
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(true);
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector("div[id='checkbox-example'] fieldset")));

		

	}

}
