package com.vytrack.pages;

import org.junit.Test;

public class DashboardPage extends BasePage {

    @Test
    public void test1(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsDriver();
    }

}
