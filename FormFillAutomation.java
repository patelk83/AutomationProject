

//Full form Automation
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



	public class FormFillAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		
		submitForm(driver);
		waitForAlertBanner(driver);
		
			
		
		
	}
	
	public static void submitForm(WebDriver driver) {
	
		driver.findElement(By.id("first-name")).sendKeys("Trump");
		driver.findElement(By.id("last-name")).sendKeys("Donald");
		driver.findElement(By.id("job-title")).sendKeys("President");
		driver.findElement(By.id("radio-button-3")).click();
		driver.findElement(By.id("checkbox-1")).click();
		
		driver.findElement(By.cssSelector("option[value='3']")).click();
		
		driver.findElement(By.id("datepicker")).sendKeys("06/09/2020");
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
		
	}
	
	public static void waitForAlertBanner(WebDriver driver) {
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
		
	}
	}
	
	
