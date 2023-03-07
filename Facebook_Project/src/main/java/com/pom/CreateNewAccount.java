package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccount {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createNewAccount;

	public CreateNewAccount(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getCreateNewAccount() {
		return createNewAccount;
	}
	
	

}
