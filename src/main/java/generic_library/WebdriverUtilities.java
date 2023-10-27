package generic_library;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtilities
{
//drag and drop	
public void draganddrop(WebDriver driver, WebElement ele1, WebElement ele2)
{
Actions a = new Actions(driver);
a.dragAndDrop(ele1, ele2);
}

//double click

public void doubleClick(WebDriver driver, WebElement ele)
{
Actions a = new Actions(driver);
a.doubleClick();
}
//dropdown
public void Dropdown(WebElement ele, String text)
{
Select s = new Select(ele);
s.selectByVisibleText(text);
}
//mouseover
public void mouseovering(WebDriver driver, WebElement ele)
{
Actions a = new Actions(driver);
a.moveToElement(ele).perform();
}

//rightclick

public void rightClick(WebDriver driver, WebElement ele)
{
Actions a = new Actions(driver);
a.contextClick(ele).perform();
}

//Handling frame
public void frame(WebDriver driver, String value)
{
driver.switchTo().frame(value);
}

//Handling default content
public void frames(WebDriver driver)
{
driver.switchTo().defaultContent();	
}

//Handling child browser
public void childBrowser(WebDriver driver)
{
	Set<String> child = driver.getWindowHandles();
	for(String b : child)
	{
	driver.switchTo().window(b);	
	}

}
//Handling Scrolling
public void Scrolling(WebDriver driver, WebElement ele)
{
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView();", ele);
}
//Handling popup

public void popup(WebDriver driver)
{
driver.switchTo().alert().accept();
}
}
