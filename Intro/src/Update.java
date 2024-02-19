import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Update {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		 Thread.sleep(2000l);
		driver.findElement(By.className("css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep")).clear();

	}

}
