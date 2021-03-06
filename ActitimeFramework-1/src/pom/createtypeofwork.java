package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generics.Autoconstant;
import generics.Basepage;
import generics.Excellibrary;

public class createtypeofwork extends Basepage implements Autoconstant
{
	public WebDriver driver;
	
 @FindBy(xpath="(//div[@class='menu_icon'])[2]")
 private WebElement settingsbutton;
 
@FindBy(xpath="//a[.='Types of Work']")
private WebElement typeofworkbutton;

@FindBy(xpath="//span[.='Create Type of Work']")
private WebElement createtypeofworkbutton;

@FindBy(xpath="//input[@id='name']")
private WebElement nametextfield;

@FindBy(xpath="//select[@name='active']")
private WebElement statusdropdownbutton;

@FindBy(xpath="//input[@type='submit']")
private WebElement createtypesumbitbutton;

@FindBy(xpath="//a[.='bahubali']/../..//a[contains(text(),'delete')]")
private WebElement deletebutton;


public createtypeofwork(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}

public void typeofwork() throws IOException
{
	settingsbutton.click();
	typeofworkbutton.click();
	createtypeofworkbutton.click();
	nametextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1,2));
    selectbyvisibletext(statusdropdownbutton, 3);
    createtypesumbitbutton.click();
    deletebutton.click();

}
}
