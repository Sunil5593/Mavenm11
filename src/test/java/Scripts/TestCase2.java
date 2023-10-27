package Scripts;

import org.testng.annotations.Test;

import POM.DemoSkillraryPage;
import POM.DownloadInvoicePage;
import POM.SkillraryHomePage;
import generic_library.BaseClass;

public class TestCase2 extends BaseClass 
{
@Test
public void testc1() throws Throwable
{
SkillraryHomePage sc = new SkillraryHomePage(driver);
sc.gearsButton();
sc.skillraryDemoApp();
utilities.childBrowser(driver);
DemoSkillraryPage ds = new DemoSkillraryPage(driver);
ds.feedBckBtn();
DownloadInvoicePage dp = new DownloadInvoicePage(driver);
dp.DownloadInvoicebtn();
}
}

