package Week4.day1;



import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.get("https://erail.in/");
       WebElement from = driver.findElement(By.id("txtStationFrom"));
       from.clear();
       from.sendKeys("Ms",Keys.ENTER);
       WebElement to = driver.findElement(By.id("txtStationTo"));
       to.clear();
       to.sendKeys("Mdu",Keys.ENTER);
      
       driver.findElement(By.id("chkSelectDateOnly")).click();
       List<WebElement> Lst = driver.findElements(By.xpath("//table[@class = 'DataTable DataTableHeader TrainList TrainListHeader']"));
       System.out.println(Lst.size());
       List<WebElement> LstName = driver.findElements(By.xpath("//table[@class ='DataTable TrainList TrainListHeader']//tr//td[2]//a"));
       int size = LstName.size();
       List<String> value = new ArrayList<String>();
       System.out.println(Lst.size());
       for(int i=0; i<LstName.size(); i++) {
    	   String text= LstName.get(i).getText();
    	   
    	   System.out.println(text);
    	   value.add(text);
    	   
       }
       
       
       
	}

}
