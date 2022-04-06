package adactin.co;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel {
	private WebDriver driver;
	@FindBy(id="radiobutton_0")
	private WebElement feasiblehotel;
	@FindBy(id="continue")
	private WebElement COntinue;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getFeasiblehotel() {
		return feasiblehotel;
	}
	public WebElement getCOntinue() {
		return COntinue;
	}
	public Search_hotel(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
	}
}
