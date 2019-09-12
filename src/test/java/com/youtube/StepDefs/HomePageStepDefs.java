package com.youtube.StepDefs;

import org.junit.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;

import com.youtube.pages.HomePage;

import MyUtilities.ConfigurationReader;
import MyUtilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefs {
	
	HomePage page = new HomePage();

@Given("User is on Youtube HomePage")
public void user_is_on_Youtube_HomePage() {
    Driver.getDriver().get((ConfigurationReader.getProperty("url")));
}

@When("User Enters any name in Search-box")
public void user_Enters_any_name_in_Search_box() {
	 page.SearchBox.sendKeys("naruto shippuden");
	 page.searchButton.click();
}

@Then("System should display related videos with that name")
public void system_should_display_related_videos_with_that_name() {
   Assert.assertTrue(page.searchedItem.isDisplayed());
   System.out.println("<<< "+page.searchedItem.getText()+" >>>");
   page.searchedItem.click();
   
   Driver.closeDriver();

}


}