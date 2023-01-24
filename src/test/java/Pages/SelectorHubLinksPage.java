package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class SelectorHubLinksPage
{
    WebDriver driver;
    Actions actions;
    Select select;
    JavascriptExecutor js;

    @FindBy(xpath = "//*[local-name()='svg' and @iconid='editon']/*[local-name()='path'][1]")
    WebElement writeArrow;
    @FindBy(xpath = "//input[@placeholder='First Enter name']")
    WebElement firstName;
    @FindBy(xpath = "//input[@placeholder='Enter Last name']")
    WebElement lastName;
    @FindBy(xpath = "//div[@class='dropdown']//button [@class='dropbtn']")
    WebElement checkOutHere;
    @FindBy(xpath = "//div[@class='dropdown']//div[@class='dropdown-content']//a[contains(text(),'Join Training')]")
    WebElement joinTraining;
    @FindBy(id = "cars")
    WebElement cars;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement buttonSubmit;
    @FindBy(xpath="//iframe[@id='pact']")
    WebElement frame;
    @FindBy(id="userPass")
    WebElement userpassword;
    @FindBy(id="jest")
    WebElement jest;
    @FindBy(xpath = "//div[@id='tablepress-1_filter']")
    WebElement searchBox;
    @FindBy(xpath = "//tbody[@class='row-hover']/tr/td")
    List<WebElement> items;


    public SelectorHubLinksPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
        actions=new Actions(driver);
        js = (JavascriptExecutor)driver;


    }

    public void enterName() throws InterruptedException {
        actions.moveToElement(writeArrow).
                click().build().perform();
        Thread.sleep(3000);
        firstName.sendKeys("Ram");

        js.executeScript("document.querySelector(\"input[placeholder='Enter Last name']\").disabled=false");
        driver.findElement(By.xpath("//input[@placeholder='Enter Last name']")).sendKeys("kumar");
       // js.executeScript("document.querySelector(\"input[placeholder='Enter Last name']\").disabled=false");
    }
    public void checkOut() throws InterruptedException {
        actions.moveToElement(checkOutHere);
        Thread.sleep(3000);
        actions.moveToElement(joinTraining).click().build().perform();
        String parent= driver.getWindowHandle();
        Set<String> set=driver.getWindowHandles();
        driver.switchTo().window(parent);
    }
    public void selectCars()
    {
       select = new Select(cars);
        select.selectByValue("audi");
        select.getOptions();
        System.out.println(select.getOptions());
    }
    public void clickSubmit()
    {
        buttonSubmit.submit();
    }
    public String verifyTestersFoodLink() throws InterruptedException {
        //JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.switchTo().frame(frame);
        Thread.sleep(3000);
        WebElement ele = (WebElement)
                js.executeScript("return document.querySelector('#snacktime').shadowRoot.querySelector('a')");
       // WebElement ele1 = (WebElement)js.executeScript("return documnet ('#snacktime').shadowRoot.querySelector('a')") ;
        js.executeScript("arguments[0].click();", ele);
        Thread.sleep(3000);
        Set<String> handle = driver.getWindowHandles();
        for( String h: handle)
        {
            driver.switchTo().window(h);
        }
        Thread.sleep(3000);
        return driver.getTitle();
    }
    public void verifyPasswordText() throws InterruptedException {
        userpassword.click();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("password12345").perform();;
        Thread.sleep(2000);

    }
    public void verifyCoffeeTime () throws InterruptedException {
        driver.switchTo().frame(frame);
        jest.click();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("yes").perform();
        Thread.sleep(2000);

    }
    public void verifyDistribution() throws InterruptedException {
        searchBox.sendKeys("mac");
        Thread.sleep(2000);
        for (WebElement text:items)
        {
            String value= text.getText();
            System.out.println(value);
        }

    }





}
