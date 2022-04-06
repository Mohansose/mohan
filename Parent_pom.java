package adactin.co;

import org.openqa.selenium.WebDriver;

public class Parent_pom {
	private  WebDriver driver;

	private  Ad_login a;
	
	private  Select_hotel b;
	
	private  Search_hotel c;
	
	private Payment_Addr d;
	public WebDriver getDriver() {
		return driver;
	}
	public Ad_login getA() {
		a=new Ad_login(driver);
		return a;
	}
	public Select_hotel getB() {
		b=new Select_hotel(driver);
		return b;
	}
	public Search_hotel getC() {
		c=new Search_hotel(driver);
		return c;
	}
	public Payment_Addr getD() {
		d=new Payment_Addr(driver);
		return d;
	}
	public Parent_pom(WebDriver driver2) {
       this.driver=driver2;
	}
	
}
