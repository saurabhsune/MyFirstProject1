package tests;


import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginTest {
	
	   public static WebDriver driver;
	   LoginPage lp;
       @BeforeClass
	   public void init() {
		   WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
			
	        lp=new LoginPage(driver);
		
	    }
		@Test
		public void login() {
			lp.login("Admin", "admin123");
		}
		@AfterClass
		public void teardown() {
			driver.close();
		} 	
	}
	

	
	
	
	
	
	
	
	
	


