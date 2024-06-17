 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String URLtext = driver.getCurrentUrl();
		driver.manage().window().maximize();
		System.out.println("the URL- " + URLtext);
		System.out.println(driver.getTitle());
		Thread.sleep(500);
		
		  WebElement LoginDetails = driver.findElement(By.className("orangehrm-demo-credentials")); 
		  String str = LoginDetails.getText(); 
		  System.out.println(str);
		  String[] str1= str.split(":"); 
		  String str3= str1[2].trim();
		  String str2 = str1[1].split("\nP")[0].trim();
		  System.out.println(str1[0]+"hi"+str1[1]+"hii"+str1[2]+"username "+str2+"password "+str3);
	
		 
		   driver.findElement(By.name("username")).sendKeys(str2);
		   driver.findElement(By.name("password")).sendKeys(str3);
		   driver.findElement(By.className("orangehrm-login-button")).click();
		   Thread.sleep(5000);
		   List<WebElement> menuValues=driver.findElements(By.tagName("a"));
		   for(WebElement link:menuValues) {
			   System.out.println(link.getText()+"-"+link.getAttribute("href"));
			   }
		   
		   WebElement leave = driver.findElement(By.linkText("Admin"));
		   leave.click();
	}

}
