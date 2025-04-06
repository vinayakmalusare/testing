package org.example;

import graphql.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver( );
        driver.get("http://jqueryui.com/resources/demos/droppble/default.html");
        Actions action = new Actions(driver);

        WebElement drag = driver.findElement(By.id("draggable"));

        WebElement drop = driver.findElement(By.id("droppable"));

        action.dragAndDrop(drag, drop).build().perform();

        String actualText = driver.findElement(By.cssSelector("#droppable p")).getText( );

        System.out.println(actualText);

    }
}
