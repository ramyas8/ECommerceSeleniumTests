package ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeScreen {
	

	WebDriver driver;
	Actions action = new Actions(driver);
	
	public HomeScreen(WebDriver driver)
	{
		//initialization
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	//PageFactory
	@FindBy(xpath="//ul[@class='top-menu notmobile']/li[1]")
	WebElement computerProds;
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']/li[2]")
	WebElement electronics;
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']/li[3]")
	WebElement apparel;
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']/li[4]")
	WebElement digitalDownloads;
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']/li[5]")
	WebElement books;
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']/li[6]")
	WebElement jewelry;
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']/li[7]")
	WebElement giftCards;
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']/li[1]//a[contains(@href,'/desktops')]")
	WebElement desktops;
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']/li[1]//a[contains(@href,'/notebooks')]")
	WebElement notebooks;
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']/li[1]//a[contains(@href,'/software')]")
	WebElement software;
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']/li[2]//a[contains(@href,'/camera-photo')]")
	WebElement cameraPhoto;
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']/li[2]//a[contains(@href,'/cell-phones')]")
	WebElement cellPhones;
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']/li[2]//a[contains(@href,'/others')])]")
	WebElement others;
	
	
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']/li[3]//a[contains(@href,'/shoes')]")
	WebElement shoes;
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']/li[3]//a[contains(@href,'/clothing')]")
	WebElement clothing;
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']/li[3]//a[contains(@href,'/accessories')]")
	WebElement accessories;
	
	
	

	
	public void clickDesktops()
	{
		action.moveToElement(computerProds);
		action.moveToElement(desktops);
		action.click().build().perform();
	}
	
	public void clickNotebooks()
	{
		action.moveToElement(computerProds);
		action.moveToElement(notebooks);
		action.click().build().perform();
	}
	
	public void clickSoftware()
	{
		action.moveToElement(computerProds);
		action.moveToElement(software);
		action.click().build().perform();
	}
	
	public void clickCameraPhoto()
	{
		action.moveToElement(electronics);
		action.moveToElement(cameraPhoto);
		action.click().build().perform();
	}
	
	public void clickCellPhones()
	{
		action.moveToElement(electronics);
		action.moveToElement(cellPhones);
		action.click().build().perform();
	}
	
	public void others()
	{
		action.moveToElement(electronics);
		action.moveToElement(others);
		action.click().build().perform();
	}
	
	public void clickShoes()
	{
		action.moveToElement(apparel);
		action.moveToElement(shoes);
		action.click().build().perform();
	}
	
	public void clickClothing()
	{
		action.moveToElement(apparel);
		action.moveToElement(clothing);
		action.click().build().perform();
	}
	
	public void clickAccessories()
	{
		action.moveToElement(apparel);
		action.moveToElement(accessories);
		action.click().build().perform();
	}
	
	public void digitalDownloads()
	{
		digitalDownloads.click();
	}
	
	public void books()
	{
		books.click();
	}
	
	public void jewelry()
	{
		jewelry.click();
	}
	
	public void giftCards()
	{
		giftCards.click();
	}
	
	
	public void goTo()
	{
		driver.get("https://demo.nopcommerce.com/");
	}
}
