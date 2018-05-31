package com.selenium.training.demo.drivers;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class DriversDepot {
    private String browser="";
    public static WebDriver driver;

    public void openBrowser(){
        switch (browser){
            case "chrome":
                driver= new ChromeDriver();
                break;
            case"ie":
                driver=new InternetExplorerDriver();
                break;
            case"opera":
                driver=new OperaDriver();
                break;
            case"edge":
                driver=new EdgeDriver();
                break;
                default:
                    driver=new FirefoxDriver();
                    break;
        }
    }

    public void closeBrowser(){
        driver.quit();
    }
    public void  maxWindow(){
        driver.manage().window().maximize();
    }
    public  void applyImpWait(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
    public void navigateToUrl(String url){
        driver.get(url);
    }
    public void sleep(int ms){


        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



}
