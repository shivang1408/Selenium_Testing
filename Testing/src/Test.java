
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	
	
public class Test {
	
	public static void main(String[] args) {
		// Create a new instance of the FireFox driver
		
		 String exePath = "C:\\selenium-server-3.9.1\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();

		// Launch the Online Store WebSite
		driver.get("http://toolsqa.com/Automation-practice-form/");
		System.out.println("website opened");

////		 Click on "Partial Link Text" link
//		driver.findElement(By.linkText("Link Test")).click();
//		System.out.println("Partial Link Test Pass");
//
//		// Convert element in to a string 
//		String sClass = driver.findElements(By.tagName("button")).toString();
//		System.out.println(sClass);
//
//		// Click on "Link Text" link
//		driver.findElement(By.linkText("Link Test")).click();
//		System.out.println("Link Test Pass");
		}
	}