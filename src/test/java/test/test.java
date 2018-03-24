package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {

	@Test
	public static void testMethod() {
		// TODO Auto-generated metho
		
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.techbeamers.com/testng-parameters-and-dataprovider-annotations/");
		driver.manage().window().maximize();
	}

}
