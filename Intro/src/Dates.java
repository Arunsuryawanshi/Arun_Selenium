import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperties(WebDriver.Chrome.driver,"D:\\Java\\chromedriver_win32.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		
	}

}
