package keywords;

import java.io.File;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import automation.getpageobjects.GetPage;
import automation.utils.DataReadWrite;

public class Home extends GetPage {

	WebDriver driver;

	public Home(WebDriver driver) {
		super(driver, "HomePage");
		this.driver = driver;
	}
	public void Ishomepage() {
		hardWait(3);
		element("Women").click();
		msg.log("Clicked on women");
	}
	public void MoveItemTOWishlist() {
		element("Heart").click();
		msg.log("Clicked on Heart");
	}
	public void SearchByBrand() {
		element("SearchBox").sendKeys("Gucc");
		msg.log("Search by Gucci");
		hardWait(3);
		element("CheckBox").click();
		msg.log("Search by Brand");
	}
	public void SearchByColor() {
		element("CheckBoxColor").click();
		msg.log("Search by color");
	}
	//	element("ConditionNew").click();
	//	msg.log("Search by Condition");
	//	element("ShoesSize").click();
	//	msg.log("Search by Shoe size");
		
		

}
