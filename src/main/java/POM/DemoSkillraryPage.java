package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryPage 
{
	
//address of select category	
@FindBy(name="addresstype")
private WebElement selectDd;

//address of feedback
@FindBy(xpath="//a[text()='FEEDBACK']")
private WebElement feedbckBtn;

//Initialization
public DemoSkillraryPage(WebDriver driver) {
PageFactory.initElements(driver, this);
}

//Utilization

public WebElement getSelectedDd()
{
return selectDd;
}
public WebElement getFeedbckbtn()
{
return feedbckBtn;	
}
//Business Library

public void feedBckBtn()
{
feedbckBtn.click();	
}
}
