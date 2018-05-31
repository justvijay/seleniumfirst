package com.selenium.training.demo;


import com.selenium.training.demo.drivers.DriversDepot;
import org.junit.After;
import org.junit.Before;

public class Hooks {
    DriversDepot driversDepot=new DriversDepot();
    @Before
    public void openUp(){
        driversDepot.openBrowser();
        driversDepot.navigateToUrl("http://www.boots.com/");
        driversDepot.maxWindow();
        driversDepot.applyImpWait();


    }
    //@After
    public void shutDown(){
       driversDepot.closeBrowser();
    }

}
