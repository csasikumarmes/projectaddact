package org.step.adact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleOrange {
	public static WebDriver driver;

	@Given("provide start time")
	public void provide_start_time() {
	   System.out.println("HOOKS Completed Background Started");
	}

	@Given("user provide the url")
	public void user_provide_the_url() {
		WebDriverManager.chromedriver().setup();
		ExampleOrange.driver = new ChromeDriver();
		ExampleOrange.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

@Given("user should provide userid and password {string} {string}")
public void user_should_provide_userid_and_password(String uname, String pword) throws InterruptedException {
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys(pword);
}

@Given("User should click the submit button")
public void user_should_click_the_submit_button() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	Thread.sleep(3000);
	
}


}
