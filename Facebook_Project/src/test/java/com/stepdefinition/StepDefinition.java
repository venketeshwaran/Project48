package com.stepdefinition;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;

import com.baseclass.BaseClass;
import com.helper.File_Reader_Manager;
import com.pom.CreateNewAccount;
import com.pom.SignUp;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	CreateNewAccount c = new CreateNewAccount(driver);
	SignUp s = new SignUp(driver);

	@Before("@sanity,@smokeTest")
	public static void beforeHooks(Scenario scenario) throws IOException {
		screenShot("EveryScenarioBeforeHooks");
	}

	@After()
	public static void afterHooks(Scenario scenario) throws IOException {

		if (scenario.isFailed()) {
			screenShot("FailedScenario");
		}

	}

	@Given("User launch the url")
	public void user_launch_the_url() throws IOException {

		String url = File_Reader_Manager.getInstance_Cr().getUrl();
		getUrl(url);
	}

	@When("User enter a facebook username")
	public void user_enter_a_facebook_username() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Arun123@gmail.com");
	}

	@When("User enter a facebook password")
	public void user_enter_a_facebook_password() throws InterruptedException {

		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345678");
		Thread.sleep(2000);

	}

	@When("User click the login button")
	public void user_click_the_login_button() {

		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}

	@Then("Next page")
	public void next_page() throws InterruptedException {

		System.out.println("Next page ");
		System.out.println("Hello");
		Thread.sleep(2000);

	}

	@When("User enter a facebook username {string}")
	public void user_enter_a_facebook_username(String string) {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(string);

	}

	@When("User enter a facebook password {string}")
	public void user_enter_a_facebook_password(String string) {
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(string);

	}

	@When("user click the new account button")
	public void user_click_the_new_account_button() {

		c.getCreateNewAccount().click();

	}

	@When("user sign up with following details")
	public void user_sign_up_with_following_details(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {

		Thread.sleep(2000);

		List<List<String>> obj = dataTable.asLists();

		s.getFirstName().sendKeys(obj.get(0).get(0));
		Thread.sleep(2000);

		s.getSurName().sendKeys(obj.get(0).get(1));

		s.getPhoneNo().sendKeys(obj.get(0).get(2));
		Thread.sleep(2000);

		s.getNewPassWord().sendKeys(obj.get(0).get(3));

		s.getDate().sendKeys(obj.get(0).get(4));

		s.getMonth().sendKeys(obj.get(0).get(5));
		Thread.sleep(2000);

		s.getYear().sendKeys(obj.get(0).get(6));
		Thread.sleep(2000);

		s.getMaleButton().click();

		s.getSignUp().click();

	}

}
