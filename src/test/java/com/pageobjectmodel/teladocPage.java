package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class teladocPage {

	WebDriver driver;
	public teladocPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//button[@type='add']")

	WebElement adduserbtn;

	public void getadduserbtn() {
		adduserbtn.click();
		
	}

	@FindBy(name="FirstName")
	WebElement FirstNamebox;
	public void getFirstNamebox(String First) {
		FirstNamebox.sendKeys(First);
	}

	@FindBy(name="LastName")
	WebElement LastNamebox;
	public void getLastNamebox(String Last) {
	LastNamebox.sendKeys(Last);
	}

	@FindBy(name="UserName")
	WebElement UserNamebox;
	public void getUserNamebox(String User){
		UserNamebox.sendKeys(User);
	}
	@FindBy(name="Password")
	WebElement Passwordbox;
	public void getPasswordbox(String Password) {
		FirstNamebox.sendKeys(Password);
	}

	@FindBy(name="Email")
	WebElement Emailebox;
	public void getEmailbox(String Email) {
	LastNamebox.sendKeys(Email);
	}

	@FindBy(name="Mobilephone")
	WebElement Mobilphonebox;
	public void getMobilphonebox(String Mobilphone) {
	LastNamebox.sendKeys(Mobilphone);
	}
	@FindBy(xpath="//input[@value='15']")
	WebElement customerbox;
	public void getCustomerbox() {
		if (customerbox.isSelected())
			System.out.println("Check box is already selected");
		else customerbox.click();
	}

	@FindBy(name="RoleId")
	WebElement dropdown;

	public void getDropdown() throws InterruptedException {
		
		Select sel = new Select(dropdown);
		
		Thread.sleep(2000);
		
		sel.selectByVisibleText("Customer");
	}

	@FindBy(xpath="//button[@class='btn btn-success']")
	WebElement savebox;
	public void getsavebox() {
		savebox.click();

	}
	
	@FindBy(xpath="(//i[@class='icon icon-remove'])[3]")
	WebElement crossIcon;
	public void getCrossIcon() {
		crossIcon.click();
		
	}
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement okBtn;
	public void getOKbtn() {
		okBtn.click();
		
	}
}
