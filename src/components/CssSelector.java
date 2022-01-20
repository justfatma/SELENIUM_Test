package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector {

    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Selenium\\Gecko Driver\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.id("L2AGLb")).click();


      //Aşağıdaki iki ifade aynıdır.
        // div#footer       divlerin içinde id si footer olanları ver.
        // div[id=footer]


        //  #  id anlamındadır.                         #footer    id si footer olanları ver
        //  .  class ismi anlamındadır.                 .gNO89b    class ismi gNO89b olanları ver
        //  *  contains anlamındadır.
        //  $  ile biten anlamındadır.
        //  >  alt kısım yani child anlamındadır.
    }
}
