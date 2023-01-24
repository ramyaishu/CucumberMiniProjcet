package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainClassPage
{
    public WebDriver driver;

    @FindBy(id = "userId")
    WebElement emailID;
    @FindBy(id = "pass")
    WebElement password;
    @FindBy(name = "company")
    WebElement companyName;
    @FindBy(name = "mobile number")
    WebElement mobileNumber;
    @FindBy(xpath = "//input[@placeholder='First Enter name']")
    WebElement firstName;
    @FindBy(xpath = "//input[@placeholder='Enter Last name']")
    WebElement lastName;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement buttonSubmit;
    @FindBy(id = "inp_val")
    WebElement firstCrush;
    @FindBy(xpath = "//button[text()='Checkout here']")
    WebElement checkOutHere;
    @FindBy(xpath = "//a[text()='SHub Youtube Channel']")
    WebElement optionCheckOut;
    @FindBy(id = "cars")
    WebElement cars;
    @FindBy(xpath = "//option[text()='Volvo']")
    WebElement carVolvo;
    @FindBy(id = "the_date")
    WebElement dateIcon;

    public MainClassPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }


    public String title()
    {
        System.out.println(driver.getTitle());
        return driver.getTitle();
    }
    public void credentials() throws InterruptedException {
        emailID.sendKeys("flower@gmail.com");
        Thread.sleep(1000);
        password.sendKeys("flower");
        Thread.sleep(1000);
        companyName.sendKeys("RRR ");
        Thread.sleep(1000);
        mobileNumber.sendKeys("345612345");
        // firstName.sendKeys("Rithu");
        //Thread.sleep(1000);
        //lastName.sendKeys("Shan");

    }
    public void clickSubmit()
    {
        buttonSubmit.submit();
    }




}
