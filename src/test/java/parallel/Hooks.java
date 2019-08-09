package parallel;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	//WebDriver driver;
	@Before
	public void initializeTest() {
		System.out.println("intialize Test");
		System.setProperty("webdriver.chrome.driver", "‪ExeFiles\\chromedriver.exe");
		//driver=new ChromeDriver();
		//driver.manage().window().maximize();
		
		//base.stepInfo="ChromeDriver";
	}
	
	@After
	public void tearDownTest() {
		System.out.println("teardown the test");
		//base.driver.quit();
	}

}
