package org.step.adact;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeMultiple {
	
	WebDriver driver;
	
	@Given("Load the URL Orange {string}")
	public void load_the_url_orange(String url) {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get(url);
	    
	}

	@Given("user provide the username and password for ORange HRM")
	public void user_provide_the_username_and_password_for_o_range_hrm(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String,String>> data =  dataTable.asMaps(String.class, String.class);
		String uname = data.get(1).get("userName");
		String pword = data.get(1).get("password");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(pword);
	}

	@Given("click the submit for Orange HRM")
	public void click_the_submit_for_orange_hrm() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}


}
