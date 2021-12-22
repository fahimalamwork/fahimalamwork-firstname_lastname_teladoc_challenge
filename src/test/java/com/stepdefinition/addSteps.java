package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.teladocBase;
import com.pageobjectmodel.teladocPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addSteps extends teladocBase{


	teladocPage page;
	
	@Given("^the user naviagtes to  Teladoc homepage$")
	public void the_user_naviagtes_to_Teladoc_homepage() throws Throwable {
	   
	   getDriver();
	   
	   page = PageFactory.initElements(driver, teladocPage.class);
	}

	@When("^I click add user$")
	public void i_click_add_user() throws Throwable {
	   
	   page.getadduserbtn();
	   
	   Thread.sleep(2000);
	}

	@When("^I enter the \"([^\"]*)\">$")
	public void i_enter_the1(String First) throws Throwable {
	   
	    page.getFirstNamebox(First);
	    
	    Thread.sleep(2000);
	}

	@When("^I enter my \"([^\"]*)\">$")
	public void i_enter_my1(String Last) throws Throwable {
	   
	    page.getLastNamebox(Last);
	    
	    Thread.sleep(2000);
	}

	@When("^I enter my \"([^\"]*)\"$")
	public void i_enter_my(String User) throws Throwable {
	   
	    page.getUserNamebox(User);
	    
	    Thread.sleep(2000);
	}

	@When("^I enter the \"([^\"]*)\"$")
	public void i_enter_the(String Password) throws Throwable {
	   
	    page.getPasswordbox(Password);
	    
	    Thread.sleep(2000);
	}

	@When("^I select Company AAA as customer company$")
	public void i_select_Company_AAA_as_customer_company() throws Throwable {
	   
	   page.getCustomerbox();
	   
	   Thread.sleep(2000);
	}

	@When("^I select Customer as role$")
	public void i_select_Customer_as_role() throws Throwable {
	   
	   page.getDropdown();
	   
	   Thread.sleep(2000);
	}
	
	@When("^I ennter my \"([^\"]*)\"$")
	public void i_ennter_my(String Email) throws Throwable {
	  
	  page.getEmailbox(Email);
	  
	  Thread.sleep(2000);
	}

	@When("^I entter \"([^\"]*)\"$")
	public void i_entter(String Mobilphone) throws Throwable {
	   
	   page.getMobilphonebox(Mobilphone);
	   
	   Thread.sleep(2000);
	}

	@When("^I click save$")
	public void i_click_save() throws Throwable {
	   
	   page.getsavebox();
	   
	   Thread.sleep(5000);
	}

	@Then("^I can see the added user$")
	public void i_can_see_the_added_user() throws Throwable {
	   
	  Assert.assertEquals(driver.findElement(By.xpath("(//td[contains(text(),'fahim')])[1]")), driver.findElement(By.xpath("(//td[contains(text(),'fahim')])[1]")));
	}

}
