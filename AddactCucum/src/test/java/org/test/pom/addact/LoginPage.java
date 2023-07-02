package org.test.pom.addact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.base.addact.LibGlobalCommon;

public class LoginPage extends LibGlobalCommon{
	
		public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
//	@FindBy(id="username")
	@FindBy(id="email")
	private WebElement user;
	
//	@FindBy(id="password")
	@FindBy(id="pass")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement submit;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
}
