package Scripts;

import org.testng.annotations.Test;

import POM.DemoSkillraryPage;
import POM.SkillraryHomePage;
import POM.TestingPage;
import generic_library.BaseClass;

public class TestCase1 extends BaseClass 
{
@Test
public void testc1() throws Throwable
{
SkillraryHomePage sc = new SkillraryHomePage(driver);
sc.gearsButton();
sc.skillraryDemoApp();
utilities.childBrowser(driver);
DemoSkillraryPage d = new DemoSkillraryPage(driver);
utilities.Dropdown(d.getSelectedDd(), pdata.getPropertydata("coursedd"));
TestingPage tp= new TestingPage(driver);
utilities.Scrolling(driver,tp.getFacebook());
Thread.sleep(3000);
tp.FacebookWebElement();
}
}
