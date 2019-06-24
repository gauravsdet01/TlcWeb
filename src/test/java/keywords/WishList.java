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
		super(driver, "HomePage");
		this.driver = driver;
	}
	
	public void deleteIfFileExists() {
		try {
			File file = new File("src/test/resources/testdata/courseData.tmp");

			if (file.delete()) {
				System.out.println(file.getName() + " Was deleted!");
			} else {
				System.out.println("Delete Operation Failed. Check: " + file);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	public void Ishomepage() {
		hardWait(3);
		element("Women").click();
		msg.log("Clicked on women");
	}
	public void MoveItemTOWishlist() {
		element("Heart").click();
		msg.log("Clicked on Heart");
		hardWait(5);
	}
	public void SearchByBrand() {
		element("SearchBox").sendKeys("Gucc");
		msg.log("Search by Gucci");
		hardWait(3);
		element("CheckBox").click();
		msg.log("Search by Brand");
		hardWait(7);
		String ProdText = element("ProductText").getText();
		System.out.println("Product Description " + ProdText);
		deleteIfFileExists();
		DataReadWrite.writeDataToFile("ProdText", ProdText);
	}
	public void SearchByColor() {
		element("CheckBoxColor").click();
		msg.log("Search by color");
	
	}
	
	public void WishListPage() {
		String wishprod = element("ProductTextWish").getText();
		System.out.println("Product is " + wishprod);
		DataReadWrite.readDataFromFile("ProdText");
		
		msg.log("Search by color");
	
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
