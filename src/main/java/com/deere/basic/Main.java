package com.deere.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
//        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
//        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create New Account")).click();
        driver.findElement(By.name("firstname")).sendKeys("swati");
        driver.findElement(By.name("lastname")).sendKeys("bankar");
        driver.findElement(By.name("reg_email__")).sendKeys("7686965");
        driver.findElement(By.id("password_step_input")).sendKeys("welcome123");
      
        
        Select selectDay = new Select(driver.findElement(By.id("day")));
        selectDay.selectByVisibleText("20");
        
        Select selectMonth = new Select(driver.findElement(By.id("month")));
        selectMonth.selectByVisibleText("Dec");
        
        Select selectYear = new Select(driver.findElement(By.id("year")));
        selectYear.selectByVisibleText("1992");
        

        
        
        driver.findElement(By.xpath("//input[@value='-1']")).click();
        Select selectpro = new Select(driver.findElement(By.name("preferred_pronoun")));
        selectpro.selectByVisibleText("She: \"Wish her a happy birthday!\"");
       // driver.findElement(By.name("websubmit")).click();
                
//        String actualTitle = driver.getTitle();
//        System.out.println(actualTitle);
        
//      By loc =  By.id("authUser");
//     WebElement el =driver.findElement(loc);
  
    }

}
