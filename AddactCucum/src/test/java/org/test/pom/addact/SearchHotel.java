package org.test.pom.addact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.base.addact.LibGlobalCommon;

public class SearchHotel extends LibGlobalCommon{

	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}
	
	

}
