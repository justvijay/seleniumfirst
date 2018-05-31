package com.selenium.training.demo.utils;


import com.selenium.training.demo.Hooks;
import com.selenium.training.demo.Locators;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Every;
import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.List;


;import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class RegressionTestSuite extends Hooks {
    Locators locators=new Locators();
    @Test
    public void runMain(){
        locators.search("deodorant");
      // locators.selectFilter("new arrivals");
      locators.selectFilter("");
      List<Double> actualList=locators.getAllrating();
   assertThat(actualList,everyItem(greaterThanOrEqualTo(3.0)));


    }
}
