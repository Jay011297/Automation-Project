package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://testautomationpractice.blogspot.com/");
				driver.manage().deleteAllCookies();
				
				//Dropdown handle with select class
				
				//first need to find the particular webelement on the web page
				
				WebElement DropdownC=driver.findElement(By.xpath("//select[@id='country']"));
				
			 //There are three methods to select the drodown values
			//selectby visitble text
			//select by value
			//select by index
				
			        Select S=new Select(DropdownC);
			//S.selectByIndex(1);
			//Thread.sleep(1000);
				
				
			//capture all the option of the dropdown, we used getOptions method
				List<WebElement> opt=S.getOptions();
				System.out.println("Number of options "+ opt.size());
				
			
			//printing the options in console window
				
				for(WebElement options:opt) {
					System.out.println(options.getText());
				}
				
				//S.selectByIndex(2);
				
				
				
				
				
			}
			


	}


