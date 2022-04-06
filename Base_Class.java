package adactin.co;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
public static WebDriver driver;

	public static WebDriver Launchbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MOHAN\\Test\\Driver1\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}

	public static void geturl(String url) {
		driver.get(url);
	}
	public static  void Sendkeys(WebElement b,String a) {
      b.sendKeys(a);
	}
	public static void getoptions() {        
	String a = driver.getTitle();
	System.out.println(a);
    String b = driver.getCurrentUrl();
    System.out.println(b);
	}
	public static void Get_Text(WebElement b) {
		b.getText();
	}
    public static void Get_Attribute(WebElement c,String d) {
	c.getAttribute(d);
   }
	public static void Windowmax() {
		driver.manage().window().maximize();
	}
	public static void Navigateto(String url) {
	    driver.navigate().to(url);
	}
	public static void Navigateback() {
		driver.navigate().back();
	}
	public static void Navigateforward() {
		driver.navigate().forward();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void Navigaterefresh() {
		driver.navigate().refresh();
	}
	public static void Threadsleep(int a) {
		try {
			Thread.sleep(a);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void Switchto()  {
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();
}
	public static void Switchtof(WebElement a) {
		driver.switchTo().frame(a);
	}
	public static void Default() {
		driver.switchTo().defaultContent();
	}
	public static void Actions(WebDriver driver,WebElement l) {
		Actions p=new Actions(driver);
     p.moveToElement(l).build().perform();
	}
	public static void Robot(WebElement ele) {
		Robot a = null;
		try {
			a = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 4; i++) {
			a.keyPress(KeyEvent.VK_DOWN);
			a.keyRelease(KeyEvent.VK_DOWN);
			a.keyPress(KeyEvent.VK_ENTER);
			a.keyRelease(KeyEvent.VK_ENTER);
			ele.click();
		}
	}
	public static void windowhandle(WebDriver driver,String d) {
		String Parent = driver.getWindowHandle();
		System.out.println(Parent);
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		for (String childwin : child) {
			if (!Parent.equals(childwin)) {
			driver.switchTo().window(childwin);
			System.out.println(driver.switchTo().window(childwin).getTitle());
			driver.close();
			driver.switchTo().window(Parent);
			}
		}
	}
	public static void Dropdown(WebElement d,String type,String data) {
		Select a=new Select(d);
		if (type.equalsIgnoreCase("byIndex")) {
			int value = Integer.parseInt(data);
			a.selectByIndex(value);
		}else if (type.equalsIgnoreCase("byvalue")) {
			a.selectByValue(data);
		}else if (type.equalsIgnoreCase("byvisibletext")) {
			a.selectByVisibleText(data);
		}
	}
	
	public static void Checkbox(WebElement select) {
		boolean q = select.isSelected();
		System.out.println(q);
		boolean u = select.isDisplayed();
		System.out.println(u);
		boolean k = select.isEnabled();
		System.out.println(k);
	}
	public static void JavaScript(String c) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript(c);
	}

public static void ClickonElement(WebElement element) {
	element.click();
}
public static void TakesScreenshot(String png) {
	TakesScreenshot ts=(TakesScreenshot) driver;
	File Source = ts.getScreenshotAs(OutputType.FILE);
	File Destination=new File(png);
	try {
		FileHandler.copy(Source,Destination);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void ClosetheBrowser() {
  driver.close();
}
}
