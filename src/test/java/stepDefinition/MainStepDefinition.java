package stepDefinition;

import Pages.MainClassPage;
import Pages.SelectorHubLinksPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class MainStepDefinition
{

    WebDriver driver = BaseClass.driver;
    MainClassPage mainClassPage = new MainClassPage(driver);
    SelectorHubLinksPage selectorHub = new SelectorHubLinksPage(driver);


    @When("^User needs to navigate the url$")
    public void user_needs_to_navigate_the_url() throws Throwable
    {
        mainClassPage.title();
    }


        @Then("^User needs to fill all the Details like Username,Password etc\\.\\.$")
    public void user_needs_to_fill_all_the_Details_like_Username_Password_etc() throws Throwable
    {
    mainClassPage.credentials();

    }

    @Then("^User need to fill name$")
    public void user_need_to_fill_name() throws Throwable {
       selectorHub.enterName();
    }

    @When("^User clicks the checkout link it direct to another Page$")
    public void user_clicks_the_checkout_link_it_direct_to_another_Page() throws Throwable {
        selectorHub.checkOut();

    }
    @When("^user needs to Select car from cars selection$")
    public void user_needs_to_Select_car_from_cars_selection() throws Throwable
    {
    selectorHub.selectCars();

    }

    @Then("^User needs to print the cars$")
    public void user_needs_to_print_the_cars() throws Throwable {


    }


    @Then("^User needs to click the submit button$")
    public void user_needs_to_click_the_submit_button() throws Throwable
    {
        selectorHub.clickSubmit();

    }
    @When("^The user click on the Testers Food link$")
    public void the_user_click_on_the_Testers_Food_link() throws Throwable {
    selectorHub.verifyTestersFoodLink();

    }

    @Then("^the link should be opened in another window$")
    public void the_link_should_be_opened_in_another_window() throws Throwable {
    }
    @When("^the user enters password$")
    public void the_user_enters_password() throws Throwable
    {
        selectorHub.verifyPasswordText();;

    }

    @Then("^the password should be \"([^\"]*)\"$")
    public void the_password_should_be(String arg1) throws Throwable
    {
        Assert.assertEquals("password", arg1);


    }

    @When("^the user enters text in the coffee time textbox$")
    public void the_user_enters_text_in_the_coffee_time_textbox() throws Throwable
    {

        selectorHub.verifyCoffeeTime();
    }
    @Then("^the text should be \"([^\"]*)\"$")
    public void the_text_should_be(String arg1) throws Throwable {
        Assert.assertEquals("yes", arg1);
    }
    @When("^user enters item in search box$")
    public void user_enters_item_in_search_box() throws Throwable {
        selectorHub.verifyDistribution();
    }

    @Then("^it displays in tables related to item$")
    public void it_displays_in_tables_related_to_item() throws Throwable {

    }








}
