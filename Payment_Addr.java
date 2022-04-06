package adactin.co;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Addr {

	private WebDriver driver;
	@FindBy(id="first_name")
	private WebElement firstname;
	@FindBy(id="last_name")
	private WebElement lastname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement cardno;
	@FindBy(id="cc_type")
	private WebElement cardtype;
	@FindBy(id="cc_exp_month")
	private WebElement cardexpirymonth;
	@FindBy(id="cc_exp_year")
	private WebElement cardexpiryyear;
	@FindBy(id="cc_cvv")
	private WebElement cvvno;
	@FindBy(id="book_now")
	private WebElement book;
	@FindBy(name="my_itinerary")
	private WebElement itinerary;
	public WebElement getItinerary() {
		return itinerary;
	}
	@FindBy(xpath="(//input[@type='checkbox'])[23]")
	private WebElement myitinerary;
	@FindBy(xpath="(//input[@type='button'])[22]")
	private WebElement cancelhotel;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}
	public WebElement getCancelhotel() {
		return cancelhotel;
	}
	public WebElement getMyitinerary() {
		return myitinerary;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardno() {
		return cardno;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getCardexpirymonth() {
		return cardexpirymonth;
	}
	public WebElement getCardexpiryyear() {
		return cardexpiryyear;
	}
	public WebElement getCvvno() {
		return cvvno;
	}
	public WebElement getBook() {
		return book;
	}
	public Payment_Addr(WebDriver driver2) {
     this.driver=driver2;
     PageFactory.initElements(driver2, this);
	}
	
	
}
