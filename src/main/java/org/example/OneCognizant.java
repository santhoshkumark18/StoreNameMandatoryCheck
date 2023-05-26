package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class OneCognizant {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\2269280\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://packages.yatra.com/holidays/dom/search.htm?parentPageId=0e473a62-6c6e-4236-98c6-17bf03ba9cad&destination=Ladakh&departureCityId=555");
       List<WebElement> lst = driver.findElements(By.xpath("//p[@class='package-name']/a"));
       for(WebElement e : lst) {
           System.out.println(e.getText());
       }
        //System.out.println(ele.getText());
    }
}
