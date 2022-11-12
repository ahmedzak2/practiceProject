package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {




   /*
   *  we use webdriver element in order to do the find element, so we can use it in all page
    */
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public LoginPage clickFormAuthenication(){
        // to open the page of link  it must return the handler of new paege beacuse your action change page
         clickLink("Form Authentication");

        return new LoginPage(driver);

    }

    public ShiftingContent clickshiftingContent(){
        // to open the page of link  it must return the handler of new paege beacuse your action change page

        clickLink("Shifting Content");
        return new ShiftingContent(driver);

    }
    public DropDown clickDropdown(){
        clickLink("Dropdown");
        return new DropDown(driver);
    }
    public ForgotPassword retiveEmail(){
        clickLink("Forgot Password");
    return new ForgotPassword (driver);
    }
public Hovers clickHovers(){
        clickLink("Hovers");
return new Hovers(driver);
    }
    public KeyPress clickOnKeyPress(){
        clickLink("Key Presses");
        return new KeyPress(driver);
    }
    public HorizontalSlider clickonHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSlider(driver);
    }
    private void clickLink(String lintText){
        driver.findElement(By.linkText(lintText)).click();
    }

}
