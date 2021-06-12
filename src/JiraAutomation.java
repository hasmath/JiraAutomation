import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JiraAutomation {

	static WebDriver driver ;
	@Test
	public void testUrl() throws InterruptedException{
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",path+"\\Resources\\chromedriver.exe");
	    driver = new ChromeDriver();
		
	    //open JIRA in localhost 8080 port
	    driver.get("http://localhost:8080/secure/WelcomeToJIRA.jspa");	
		Thread.sleep(5000);
		
		//enter username
		driver.findElement(By.id("login-form-username")).sendKeys("jirauser");
		Thread.sleep(2000);
		
		//enter password
		driver.findElement(By.id("login-form-password")).sendKeys("jirauser");
		Thread.sleep(5000);
		
		//click on log in button
		driver.findElement(By.id("login-form-submit")).click();
		Thread.sleep(5000);
		
		//click on create new project
		driver.findElement(By.id("emptyProject")).click();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//select project type from the list
		driver.findElement(By.xpath("//*[@id='project-template-group-software']/div[2]/ol/li[1]")).click();
		Thread.sleep(5000);
		
		//click on next button
		driver.findElement(By.xpath("//*[@id='add-project-dialog']/div[3]/div[2]/button")).click();
		Thread.sleep(5000);
		
		//click on select button 
		driver.findElement(By.xpath("//*[@id='add-project-dialog']/div[4]/div[2]/button[2]")).click();
		Thread.sleep(5000);
		
		//enter project name
		driver.findElement(By.id("name")).sendKeys("Test Project");
		Thread.sleep(5000);
		
		//click on submit button
		driver.findElement(By.xpath("//*[@id='add-project-dialog']/div[5]/div[2]/button[2]")).click();
		Thread.sleep(5000);
		
		//create an issue
		driver.findElement(By.xpath("//*[@id='ghx-content-group']/div[2]/div[2]/div[3]/div[2]/form/div[2]/textarea")).sendKeys("Test Issue1");
		Thread.sleep(5000);
		WebElement textbox = driver.findElement(By.xpath("//*[@id='ghx-content-group']/div[2]/div[2]/div[3]/div[2]/form/div[2]/textarea"));
		textbox.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		//create another issue
		driver.findElement(By.xpath("//*[@id='ghx-content-group']/div[2]/div[2]/div[3]/div[2]/form/div[2]/textarea")).sendKeys("Test Issue2");
		Thread.sleep(5000);
		WebElement textbox2 = driver.findElement(By.xpath("//*[@id='ghx-content-group']/div[2]/div[2]/div[3]/div[2]/form/div[2]/textarea"));
		textbox2.sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		
		//click on an issue
		driver.findElement(By.xpath("//*[@id='ghx-content-group']/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/a")).click();
		Thread.sleep(15000);
		
		//click on 3 dots(...) at the top of an open issue 
		driver.findElement(By.id("AJS_DROPDOWN__201")).click();
		Thread.sleep(15000);
		
		//click on delete button from the modal
		driver.findElement(By.linkText("Delete")).click();
		Thread.sleep(10000);
		
		
		//click on delete button to confirm delete
		driver.findElement(By.id("delete-issue-submit")).click();
		Thread.sleep(10000);
		
		//click on issue to see the details view of an issue
		driver.findElement(By.xpath("//*[@id='ghx-content-group']/div[2]/div[2]/div[2]/div[2]/div[1]")).click();
		Thread.sleep(10000);
		
		//click on issue from the left sidebar to see the issue list
		driver.findElement(By.xpath("//*[@id='sidebar']/div/div[1]/nav/div/div[2]/ul/li[5]/a")).click();
		Thread.sleep(10000);
		
		
	}
}

