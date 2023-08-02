package userInterface;


import driver.MyDriverMobil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class StarSesionGmailU{

    MyDriverMobil driver;


    @AndroidFindAll({@AndroidBy(id = "com.google.android.gm:id/welcome_tour_got_it")})
    public WebElement tapEntendidoButton;

    @AndroidFindAll({@AndroidBy(id = "com.google.android.gm:id/setup_addresses_add_another")})
    public WebElement tapAddEmail;

    @AndroidFindAll({@AndroidBy(className = "android.widget.TextView")})
    public WebElement tapTaxtViewEamil;

    @AndroidFindAll({@AndroidBy(className = "android.widget.Button")})
    public WebElement tapNetx;
    @AndroidFindAll({@AndroidBy(className = "android.widget.EditText")})
    public WebElement tapPassword;

    @AndroidFindAll({@AndroidBy(className = "android.widget.Button")})
    public WebElement tapIagree;
    @AndroidFindAll({@AndroidBy(id = "com.google.android.gm:id/action_done")})
    public WebElement tapMetoEmail;

    @AndroidFindAll({@AndroidBy(id = "com.google.android.gm:id/action_done")})
    public WebElement tapEmail;


    public StarSesionGmailU() {
       super();


        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }


    public void clickTapEntendidoButton() {
        tapEntendidoButton.click();
    }

    public void clicktapMetoEmail() {
        tapMetoEmail.click();
    }

}