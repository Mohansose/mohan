package adactin.co;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ad_login {
private WebDriver driver;
@FindBy(id="username")
private WebElement username;
@FindBy(id="password")
private WebElement password;
@FindBy(id="login")
private WebElement login;

public WebDriver getDriver() {
	return driver;
}
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLogin() {
	return login;
}
public Ad_login(WebDriver driver2) {
    this.driver=driver2;
    PageFactory.initElements(driver2, this);
}
}
