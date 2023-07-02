package org.step.adact;

import java.io.IOException;

import org.openqa.selenium.By;
import org.test.base.addact.LibGlobalCommon;
import org.test.pom.addact.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AdactStepDefinition extends LibGlobalCommon{
	LoginPage lp = new LoginPage();
	int test = 0;
	
	@Given("Launch the URL and Login")
	public void launch_the_url_and_login() throws IOException, InterruptedException {
		
		getDriver(excelRead(test, 0));
//		maximize();
		Thread.sleep(5000);
		type(lp.getUser(), excelRead(test, 1));
//		driver.findElement(By.id("email")).sendKeys(excelRead(test, 1));
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(excelRead(test, 2));
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		
	}

	@Given("Search the Hotel in London")
	public void search_the_hotel_in_london() {
	    System.out.println("wait1");
	}

	@Given("Select the First Hotel")
	public void select_the_first_hotel() {
		System.out.println("wait2");
	}

	@Given("Enter the Resident Information")
	public void enter_the_resident_information() {
		System.out.println("wait3");
	}

	@Given("Provide the Card Details")
	public void provide_the_card_details() {
		System.out.println("wait4");
	}

	@Then("Book the Hotel")
	public void book_the_hotel() {
		System.out.println("wait5");
	}

}
