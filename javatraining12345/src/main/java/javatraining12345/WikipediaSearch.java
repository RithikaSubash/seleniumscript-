package javatraining12345;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class WikipediaSearch {
	    public static void main(String[] args) {
	        
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	       
	        WebDriver driver = new ChromeDriver();

	        try {
	          
	            driver.get("https://www.wikipedia.org/");

	            
	            driver.manage().window().maximize();

	          
	            WebElement searchBox = driver.findElement(By.id("searchInput"));
	            searchBox.sendKeys("Artificial Intelligence");

	           
	            searchBox.submit();

	           
	            Thread.sleep(2000);

	        
	            WebElement historySection = driver.findElement(By.xpath("//span[@id='History']"));
	            historySection.click();

	           
	            System.out.println("Section title: " + historySection.getText());

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	           
	            driver.quit();
	        }
	    }
	}


}
