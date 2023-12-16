package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArrayPage {
	
	
	
	//@FindBy(xpath = "//h4[text() = 'Array']") public WebElement arrayPage;
	//@FindBy(xpath = "//a[text()='arrays-in-python']") public  WebElement arrayinpythonLink;
	//@FindBy(xpath = "//a[text()='Arrays Using List']") public  WebElement arrayusinglistLink;
	//@FindBy(xpath = "//a[text()='Basic Operations in Lists']") public  WebElement basicoperationsinlistsLink;
	//@FindBy(xpath = "//a[text()='Applications of Array']") public  WebElement applicationofarraysLink;
	
	
    public ArrayPage(WebDriver driver) {
     
      PageFactory.initElements(driver, this);
    }
}
