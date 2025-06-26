package com.sparta.selenium;


import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;

public class SwagLabTests {
    private WebDriver webDriver;
    private static final String DRIVER_LOCATION = "src/test/resources/chromedriver.exe";
    private static final String BASE_URL = "https://www.saucedemo.com/";
    private static final String INVENTORY_PAGE = "https://www.saucedemo.com/inventory.html";

    String username = "standard_user";
    String password = "secret_sauce";

    private static ChromeDriverService service;

    public static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
//        options.addArguments("--headless");
        options.addArguments("--remote-allow-origins=*");
        return options;
    }

    @BeforeAll
    public static void beforeAll() throws IOException {
        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(DRIVER_LOCATION))
                .usingAnyFreePort()
                .build();
        service.start();
    }
    @AfterEach
    public void afterEach() {
        webDriver.quit();
    }
    @AfterAll
    static void afterAll() {
        service.stop();
    }

    @BeforeEach
    public void setup() {
        webDriver = new RemoteWebDriver(service.getUrl(), getChromeOptions());
    }
    @Test
    @DisplayName("Check that the webdriver works")
    public void checkWebDriver() {
        webDriver.get(BASE_URL);
        Assertions.assertEquals(BASE_URL, webDriver.getCurrentUrl());
        Assertions.assertEquals("Swag Labs", webDriver.getTitle());
    }


    @Test
    @DisplayName("Tries to login Saucedemo wesbite")
    public void checkLogin() throws InterruptedException{
        webDriver.get(BASE_URL);
        WebElement usernameField = webDriver.findElement(By.id("user-name"));
        WebElement passwordField = webDriver.findElement(By.id("password"));
        WebElement loginButton = webDriver.findElement(By.id("login-button"));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
        Assertions.assertEquals(webDriver.getCurrentUrl(), INVENTORY_PAGE);
        Thread.sleep(1000);
    }


//    @Test
//    @DisplayName("Tries to login Saucedemo wesbite")
//    public void checkAddToCartButton() throws InterruptedException{
//        webDriver.get(BASE_URL);
//        WebElement usernameField = webDriver.findElement(By.id("user-name"));
//        WebElement passwordField = webDriver.findElement(By.id("password"));
//        WebElement loginButton = webDriver.findElement(By.id("login-button"));
//        WebElement BackpackAddToCartButton = webDriver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
//        String BasketNumOfItems = webDriver.findElement(By.className("shopping_cart_badge")).getText();
//
//        usernameField.sendKeys(username);
//        passwordField.sendKeys(password);
//        Thread.sleep(6000);
//
//        loginButton.click();
//        Thread.sleep(10000);
//
//        BackpackAddToCartButton.click();
//
//
//        Assertions.assertEquals(1, BasketNumOfItems);
//        Thread.sleep(6000);
//    }
}