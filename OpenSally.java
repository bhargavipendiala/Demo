

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenSally 
{

	public static void main (String[] args)
	{
		System.out.println("Opening chrome browser");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manag\\Downloads\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sallybeauty.com/");
		driver.close();
	}
}
