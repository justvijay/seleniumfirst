package com.selenium.training.demo;

import com.selenium.training.demo.drivers.DriversDepot;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Locators extends DriversDepot {

    public void search(String product){

        driver.findElement(By.cssSelector("#SimpleSearchForm_SearchTerm")).sendKeys(product);
        driver.findElement(By.cssSelector("#SimpleSearchForm_SearchTerm")).sendKeys(Keys.ENTER);
        sleep(3000);
    }
       public void selectFilter(String filterValue) {


            List<WebElement> allFilters = driver.findElements(By.cssSelector(".owl-item.active>a"));
            for (WebElement filter : allFilters) {
                if (filter.getText().equalsIgnoreCase(filterValue)) {
                    filter.click();
                    break;
                }
            }



            sleep(5000);

        }
        public List<Double> getAllrating() {
            List<Double> collectedRatings = new ArrayList<>();
            List<WebElement> ratings =
                    driver.findElements(By.cssSelector(".product_rating"));
            for (WebElement rating : ratings) {
                String starString= rating.getText().replace("(out of 5) Star Rating","");
                Double starDouble = Double.parseDouble(starString);
                collectedRatings.add(starDouble);
            }
            return collectedRatings;
        }

}
