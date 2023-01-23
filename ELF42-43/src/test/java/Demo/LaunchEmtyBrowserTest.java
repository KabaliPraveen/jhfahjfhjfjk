package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchEmtyBrowserTest {
	@Test
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		
		
	}
	

}
