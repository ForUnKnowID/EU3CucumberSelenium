package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("\tThis is from Before");
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }



    @Before("@db")
    public void setUpDb(){
        System.out.println("\tConnecting to the Data base.......");
    }

    @After("@db")
    public void tearDownDb(){
        System.out.println("\t Disconnecting to the Data Base.......");
    }
}
