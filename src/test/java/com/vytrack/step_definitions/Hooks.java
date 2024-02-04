package com.vytrack.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("\tThis is from Before");
    }

    @After
    public void tearDown(){
        System.out.println("\tThis is After ");
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
