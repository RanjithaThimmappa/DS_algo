package stepDefinitions;

import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;

import context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.GraphPage;
import pageFactory.HomePage;
import pageFactory.TreePage;
import utilities.commonMethods;

public class Graph_SD {
	
	TestContext testContext;
	WebDriver driver;
	HomePage hp;
	
	public Graph_SD(TestContext testContext) { 
		this.testContext = testContext;
		this.driver = testContext.getDriver();
		this.hp = testContext.getHp();
	}
	
	@When("User clicks on Graph - GetStarted button")
	public void user_clicks_on_graph_get_started_button() {
		commonMethods.actionsClick(hp.graph_getStarted, driver);
	}

	@When("User clicks on Graph link")
	public void user_clicks_on_graph_link() {
		hp.graphLink.click();
	}

	@Then("The user should be directed to the Graph link page")
	public void the_user_should_be_directed_to_the_graph_link_page() {
		assertEquals(hp.graphLinkPage_Text.getText(), "Graph");
	}

	@When("User clicks on Graph Representations link")
	public void user_clicks_on_graph_representations_link() {
		hp.graphRepresentationsLink.click();
	}	

	@Then("The user should be directed to the Graph Representations link page")
	public void the_user_should_be_directed_to_the_graph_representations_link_page() {
		assertEquals(hp.graphRepresentations_Text.getText(), "Graph Representations");
	}

	@When("User clicks on Graph option")
	public void user_clicks_on_graph_option() {
		hp.graphOption_DSDropdown.click();
	}

	@Then("User should be redirected to Graph page")
	public void user_should_be_redirected_to_graph_page() {
		assertEquals(hp.graphPage_Text.getText(), "Graph");
	}

}
