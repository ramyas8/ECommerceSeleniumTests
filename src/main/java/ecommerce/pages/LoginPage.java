package ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		//initialization
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	//PageFactory
	@FindBy(id="email")
	WebElement userEmail;
	
	@FindBy(id="Password")
	WebElement passwordEle;
	
	@FindBy(className="button-1.login-button")
	WebElement loginButton;
	
	public void login(String email,String password)
	{
		userEmail.sendKeys(email);
		passwordEle.sendKeys(password);
		loginButton.click();
	}
	
	public void goTo()
	{
		driver.get("https://demo.nopcommerce.com/");
	}
}
