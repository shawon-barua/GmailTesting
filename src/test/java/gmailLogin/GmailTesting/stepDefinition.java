package gmailLogin.GmailTesting;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class stepDefinition {

    public static WebDriver obj=null;

    @Given("^url opened$")

   public void url_opened() {

      System.setProperty("webdriver.gecko.driver",

            "D:\\geckodriver.exe");

      obj=new FirefoxDriver();

      obj.manage().window().maximize();

      obj.get("https://mail.google.com");

   }



   @Then("^enter user id and click next$")

   public void enter_user_id_and_click_next() throws InterruptedException {

      obj.findElement(By.id("Email")).sendKeys("YOURUSERID");

      obj.findElement(By.id("next")).click();

      Thread.sleep(2000);

   }



   @Then("^enter password$")

   public void enter_password() {

      obj.findElement(By.id("Passwd")).sendKeys("YOURPASSWORD");

   }



   @Then("^click login$")

   public void click_login() throws InterruptedException {

      obj.findElement(By.id("signIn")).click();

      Thread.sleep(6000);

   }



   @Then("^Close browser$")

   public void close_browser() {

      obj.quit();

   }

}