package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Opportunities"                                
     , summary=""
     , relativeUrl=""
     , connection="Test"
     )             
public class Opportunities {

	@LinkType()
	@FindBy(linkText = "Opportunities")
	public WebElement opportunities;
			
}
