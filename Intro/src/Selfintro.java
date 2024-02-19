
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
  
public class Selfintro {
    public static void main(String args[])
    {
       // System.setProperty("webdriver.chrome.driver","D:\\Java\\chromedriver_win32\\chromedriver.exe");
        // Instantiate a ChromeDriver class.
        //WebDriver driver = new ChromeDriver();
        
       // System.setProperty("webdriver.gecko.driver","D:\\Java\\chromedriver_win32\\geckodriver.exe");
        //WebDriver driver1 = new FirefoxDriver();
        
    	System.setProperty("webdriver.gecko.driver","D:\\Java\\chromedriver_win32\\msedgedriver.exe");
    	
        WebDriver driver = new EdgeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com");
        String a=driver.getTitle();
        System.out.println(a);
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }
}