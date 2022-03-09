package com.hmtmcse.tutorial;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Capabilities {

    protected AndroidDriver androidDriver;
    private AppiumDriverLocalService service;

    protected void startAppium() {
        service = AppiumDriverLocalService.buildDefaultService();

        service.start();

        String service_url = service.getUrl().toString();

        System.out.println("Appium Service Address: " + service_url);
    }

    protected void launchApp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "12");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("appPackage", "de.payback.client.android");
        capabilities.setCapability("appActivity", "de.payback.app.deeplinks.StarterActivity");

        String service_url = service.getUrl().toString();

        androidDriver = new AndroidDriver(new URL(service_url), capabilities);

        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void stopServer() {
        service.stop();
    }
}
