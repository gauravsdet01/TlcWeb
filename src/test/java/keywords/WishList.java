package keywords;

import java.io.File;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.getpageobjects.GetPage;
import automation.utils.DataReadWrite;

public class WishList extends GetPage {

	WebDriver driver;

	public WishList(WebDriver driver) {
		super(driver, "WishListPage");
		this.driver = driver;
	}
	
	
	public void Wishurl() {
		driver.navigate().to("https://theluxurycloset.com/my-account/my-wishlist");
		msg.log("User is redirected to Wishlist Page");
		hardWait(3);
	}
	public void WishListItemsPresent() {
		if(ifElementDisplayedOnScreen("WishListEmpty") == true)
		{
		msg.log("Adding the item to wishlist first");
		driver.navigate().to("https://theluxurycloset.com/");
		hardWait(3);
		element("Women").click();
		msg.log("Clicked on women");
		element("SearchBox").sendKeys("Gucc");
		msg.log("Search by Gucci");
		hardWait(3);
		element("CheckBox").click();
		msg.log("Search by Brand");
		hardWait(7);
		element("Heart").click();
		msg.log("Clicked on Heart");
		hardWait(5);
		driver.navigate().to("https://theluxurycloset.com/my-account/my-wishlist");
		}
		else
		msg.log("There is an item exist in wishlist");
		hardWait(3);
	}
	public void AddToCart() {
		element("ItemAddtoCart").click();
		hardWait(5);
	}
	

	
	
	

	
	//public void WishlistItem() {
	//	deleteIfFileExists();
	//	DataReadWrite.writeDataToFile("ProdText", ProdText);
//	}
	//	element("ConditionNew").click();
	//	msg.log("Search by Condition");
	//	element("ShoesSize").click();
	//	msg.log("Search by Shoe size");
		
		

}
