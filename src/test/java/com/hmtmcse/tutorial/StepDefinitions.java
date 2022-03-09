package com.hmtmcse.tutorial;

import io.appium.java_client.MobileElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class StepDefinitions extends Capabilities {

    @Before
    public void test_prerequisite() throws MalformedURLException {
        System.out.println("Test Prerequisite");
        startAppium();
    }

    @Given("User launch installed app")
    public void user_launch_the_app() throws MalformedURLException {
        System.out.println("User launch installed app");
        launchApp();
    }

    @When("User click button login")
    public void user_click_button_login() {
        System.out.println("User click button login");
        MobileElement ellLogin = (MobileElement) androidDriver.findElementById("de.payback.client.android:id/welcome_loginbutton");

        ellLogin.click();
    }

    @When("User submit Kundennummer")
    public void user_submit_username_and_password() {
        System.out.println("User submit Kundennummer");


    }

    @Then("User should be logged in")
    public void user_should_be_logged_in() {
        System.out.println("User should be logged in");
    }

    @Given("User navigate to the Coupon Center")
    public void user_navigate_to_the_coupon_center() {
        System.out.println("User navigate to the Coupon Center");
    }

    @When("User filter the coupons by partner")
    public void user_filter_the_coupons_by_partner() {
        System.out.println("User filter the coupons by partner");
    }

    @When("User activate the first enabled Coupon")
    public void user_activate_the_coupons_by_partner() {
        System.out.println("User activate the first enabled Coupon");
    }

    @Then("First enabled Coupon should be activated")
    public void first_enabled_coupon_should_be_activated() {
        System.out.println("First enabled Coupon should be activated");
    }

    @After
    public void end() {
        System.out.println("Process End");
    }

}
