package com.Maven_Pro;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class Automation_Run extends Base_Class{
	public static WebDriver driver=Base_Class.Launchbrowser_and_url();
public static void main(String[] args) throws IOException{
	geturl("http://automationpractice.com/index.php");
	Windowmax();
	Parent_Class a=new Parent_Class(driver);
	ClickonElement(a.getA().getSign());
	Sendkeys(a.getA().getUsername(),File_Read_Manager.getInstance().getInstanceA().getusername());
	Sendkeys(a.getA().getPassword(),File_Read_Manager.getInstance().getInstanceA().getpassword());
	ClickonElement(a.getA().getSigin());
	Actions(driver,a.getA().getDress());
	ClickonElement(a.getA().getEvedress());
	Actions(driver,a.getB().getPrintdress());
	ClickonElement(a.getB().getQuickview());
	Switchtof(a.getC().getPrinted());
	Sendkeys(a.getC().getQuantity(),File_Read_Manager.getInstance().getInstanceA().getinputvalue4());
	ClickonElement(a.getC().getSubmit());
	Default();
	Threadsleep();
	ClickonElement(a.getD().getProduct());
	Threadsleep();
	ClickonElement(a.getD().getProduct2());
	JavaScript("window.scrollBy(0,800)");
	ClickonElement(a.getE().getCheckout());
	JavaScript("window.scrollBy(0,800)");
	ClickonElement(a.getG().getCheckbox());
	ClickonElement(a.getG().getBiiling());
	JavaScript("window.scrollBy(0,300)");
	ClickonElement(a.getF().getPayment());
	JavaScript("window.scrollBy(0,500)");
	ClickonElement(a.getF().getBankwire());
	Threadsleep();
	JavaScript("window.scrollBy(0,500)");
	TakesScreenshot(driver,"C:\\Users\\MOHAN\\eclipse-workspace\\Maven_Pro\\ScreenShot\\Automation3.png");
}
}
