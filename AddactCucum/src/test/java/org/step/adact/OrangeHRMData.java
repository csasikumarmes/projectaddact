package org.step.adact;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMData {
	
	WebDriver driver;
	

@Given("Load the URL {string}")
public void load_the_url(String url) {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get(url);
}

@Given("user provide the username and password")
public void user_provide_the_username_and_password(DataTable dataTable) throws InterruptedException {

	
	List<List<String>> credentials = dataTable.asLists(String.class);
	String uname = credentials.get(0).get(0);
	String pword = credentials.get(0).get(1);
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys(uname);
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys(pword);
  
}

@Given("click the submit")
public void click_the_submit() {
   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
}

}
