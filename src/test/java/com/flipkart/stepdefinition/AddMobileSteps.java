package com.flipkart.stepdefinition;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.objectrepository.AddMobileToCart;
import com.flipkart.resources.Commonaction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddMobileSteps extends Commonaction {
	Commonaction c = new Commonaction();
	AddMobileToCart a = new AddMobileToCart();
	
	@Given("User lunch the flipkart application")
	public void user_lunch_the_flipkart_application() {
		launch("https://www.flipkart.com/");
	}

	@Given("User search a mobile")
	public void user_search_a_mobile() {
		try {
			c.button(a.getClosealert());
	}catch(Exception e) {
		c.input(a.getAddmobilename(), "redmi");
	}	
	}

	@When("User click the search button")
	public void user_click_the_search_button() {
	    c.button(a.getSearchbutton());
	}

	@When("User validate the name and cost the mobile")
	public void user_validate_the_name_and_cost_the_mobile() {
	    WebElement name = a.getGetmobilename();
	    System.out.println(name.getText());
	    WebElement cost = a.getGetmobilecost();
	    System.out.println(cost.getText());
	}

	@When("User select the mobile")
	public void user_select_the_mobile() {
		c.button(a.getSelectmobile());
	}

	@Then("User click the add to cart button")
	public void user_click_the_add_to_cart_button() {
	    String w1 = driver.getWindowHandle();
	    Set<String> w2 = driver.getWindowHandles();
	    for(String s : w2) {
	    	if(!w1.equals(s)) {
	    	driver.switchTo().window(s);
	    	c.button(a.getAddtocart());
	    }
	}
	}


}
