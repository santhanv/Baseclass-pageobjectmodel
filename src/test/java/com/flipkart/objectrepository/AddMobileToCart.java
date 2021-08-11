package com.flipkart.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.resources.Commonaction;

public class AddMobileToCart extends Commonaction {
	public AddMobileToCart() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='✕']")
	private WebElement closealert;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement addmobilename;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchbutton;
	
	@FindBy(xpath="(//div[text()='REDMI Note 10 (Aqua Green, 64 GB)'])[1]")
	private WebElement getmobilename;
	
	@FindBy(xpath="(//div[text()='₹14,619'])[1]")
	private WebElement getmobilecost;
	
	@FindBy(xpath="(//div[text()='REDMI Note 10 (Aqua Green, 64 GB)'])[1]")
	private WebElement selectmobile;
	
	@FindBy(xpath="//button[text()='ADD TO CART']")
	private WebElement addtocart;
	
	public WebElement getClosealert() {
		return closealert;
	}
	public WebElement getAddmobilename() {
		return addmobilename;
	}
	public WebElement getSearchbutton() {
		return searchbutton;
	}
	public WebElement getGetmobilename() {
		return getmobilename;
	}
	public WebElement getGetmobilecost() {
		return getmobilecost;
	}
	public WebElement getSelectmobile() {
		return selectmobile;
	}
	public WebElement getAddtocart() {
		return addtocart;
	}

}
