package utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class commonMethods {
	
	public static boolean validator(String actual, String expected) {
		
		if(actual.equalsIgnoreCase(expected)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static List<String> printTextForWebElements(List<WebElement> options) {
		
		List<String> texts = new ArrayList<String>();
		
		int i=0;
		for(WebElement option: options) {
			texts.add(i,option.getText());
			i++;
		}
		
		System.out.println("The number of items in the list are: "+ texts.size());
		return texts;
	}

}
