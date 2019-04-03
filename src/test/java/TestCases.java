import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCases {
	@Test
	public void launchApp() {
		String driverpath="D:/DIXITGOYAL/chromedriver.exe";	
		
		System.setProperty("webdriver.chrome.driver",driverpath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com/");
		
	}
	
}