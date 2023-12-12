package stepDefinitions;

import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.GraphPage;
import pageFactory.HomePage;
import pageFactory.TreePage;
import utilities.DriverFactory;
import utilities.commonMethods;

public class Graph_SD {
	
	WebDriver driver;
	GraphPage gp;
	TreePage tp;
	
	@Before
	public void setUp(){
		
		this.driver = DriverFactory.initializeDriver("Chrome");
		this.gp = new GraphPage(driver);
		this.tp = new TreePage(driver);
	}
	
	@When("User clicks on Graph - GetStarted button")
	public void user_clicks_on_graph_get_started_button() {
		commonMethods.actionsClick(gp.graph_getStarted, driver);
	}

	@When("User clicks on Graph link")
	public void user_clicks_on_graph_link() {
		gp.graphLink.click();
	}

	@Then("The user should be directed to the Graph link page")
	public void the_user_should_be_directed_to_the_graph_link_page() {
		assertEquals(gp.graphLinkPage_Text, "Graph");
	}

	@When("User clicks on Graph Representations link")
	public void user_clicks_on_graph_representations_link() {
		gp.graphRepresentationsLink.click();
	}	

	@Then("The user should be directed to the Graph Representations link page")
	public void the_user_should_be_directed_to_the_graph_representations_link_page() {
		assertEquals(gp.graphRepresentations_Text, "Graph Representations");
	}

	@When("User clicks on Graph option")
	public void user_clicks_on_graph_option() {
		gp.graphOption_DSDropdown.click();
	}

	@Then("User should be redirected to Graph page")
	public void user_should_be_redirected_to_graph_page() {
		assertEquals(gp.graphPage_Text, "Graph");
	}
	
	@After
	public void tearDownMethod() {
		driver.quit();
	}

}
