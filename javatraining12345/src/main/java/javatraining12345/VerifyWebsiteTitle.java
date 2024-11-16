package javatraining12345;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class VerifyWebsiteTitle {
	    public static void main(String[] args) {
	       
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	       
	        WebDriver driver = new ChromeDriver();

	        try {
	           
	            driver.get("https://www.demoblaze.com/");

	           
	            driver.manage().window().maximize();

	            
	            String pageTitle = driver.getTitle();

	            
	            if (pageTitle.equals("STORE")) {
	                System.out.println("Page landed on correct website");
	            } else {
	                System.out.println("Page not landed on correct website");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	           
	            driver.quit();
	        }
	    }
	}



