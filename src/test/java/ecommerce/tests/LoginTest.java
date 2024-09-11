package ecommerce.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ecommerce.pages.LoginPage;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.goTo();
		loginPage.login("ramyas0809@gmail.com", "test");
	}

}
