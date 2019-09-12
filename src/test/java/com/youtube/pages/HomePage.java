package com.youtube.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MyUtilities.Driver;

public class HomePage {
	
	
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
		}
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement SearchBox;
	
	@FindBy (id = "search-icon-legacy")
	public WebElement searchButton;
	
	
	@FindBy(css = "#video-title")
	public WebElement searchedItem;
	
	

}
