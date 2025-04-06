package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.id("login-username")).sendKeys("malusarevinayak01@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("Dhriti@2022");
        driver.findElement(By.xpath("//*[@id='js-login-btn']")).click();

    }
}
