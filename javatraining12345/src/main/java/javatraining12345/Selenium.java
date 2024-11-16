package javatraining12345;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Selenium {
	    public static void main(String[] args) {
	      
	        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

	       
	        WebDriver driver = new FirefoxDriver();

	        try {
	           
	            driver.manage().window().maximize();

	           
	            driver.get("http://google.com");

	           
	            System.out.println("Current URL: " + driver.getCurrentUrl());

	           
	            driver.navigate().refresh();

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	           
	            driver.quit();
	        }
	    }
	}



