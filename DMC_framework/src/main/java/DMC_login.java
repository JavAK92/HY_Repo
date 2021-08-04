import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DMC_login {

	
	
	
	public static void main( String[]args)
	{
		
		//String projectPath = System.getProperty("User.dir");
		//System.out.println(projectPath);
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mohanned/eclipse-workspace/DMC_framework/Drivers/ChromeDriver/chromedriver 3");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://dmc-web-3.halayalla.rocks/");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement email = driver.findElement(By.id("email"));
		String emailValue = "mohamed.ghouse+test5@uxbert.com";
		email.sendKeys(emailValue);
		WebElement password = driver.findElement(By.id("password"));
		String passwordValue = "12345678";
		password.sendKeys(passwordValue);
		WebElement login = driver.findElement(By.id("kt_login_signin_submit"));
		login.click();
		
	List<WebElement> ListOfInputValues = driver.findElements(By.xpath("//input"));
	int sizeOfInputValues = ListOfInputValues.size();
	System.out.println(sizeOfInputValues);
			
		driver.close();
		driver.quit();
		
		
	}
	
}
