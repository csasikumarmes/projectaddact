package hooks;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.step.adact.ExampleOrange;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksTest{

	
	
	@Before(order=1)
	public void starttime() {
		
		Date d = new Date();
		System.out.println("Start time - "+d);

	}
	
		
	@After(order=2)
	public void afterHooksMethod() {
		ExampleOrange.driver.quit();
		System.out.println("Window Closed");

	}
	
	@After(order=1)
public void endtime() {
		
		Date d = new Date();
		System.out.println("End time - "+d);

	}

}
