package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {

	public static WebDriver driver;

	public SignUp(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement surName;

	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement phoneNo;

	@FindBy(xpath = "//input[@autocomplete='new-password']")
	private WebElement newPassWord;

	@FindBy(xpath = "//select[@name='birthday_day']")
	private WebElement date;

	@FindBy(xpath = "//select[@name='birthday_month']")
	private WebElement month;

	@FindBy(xpath = "//select[@name='birthday_year']")
	private WebElement year;

	@FindBy(xpath = "//label[text()='Male']")
	private WebElement maleButton;

	@FindBy(xpath = "//button[text()='']")
	private WebElement signUp;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getSurName() {
		return surName;
	}

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getNewPassWord() {
		return newPassWord;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getMaleButton() {
		return maleButton;
	}

	public WebElement getSignUp() {
		return signUp;
	}

}
