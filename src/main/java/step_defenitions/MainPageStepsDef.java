package step_defenitions;

import io.cucumber.java.ru.И;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPageStepsDef {

    private static final By ABOUT_US = By.xpath("(//a[@href='/index.php/about'])[2]");
    private static final By SHOPPING_BUTTON = By.xpath("//div/preceding-sibling::a[@href='/index.php/magazin']");


    @И("^открываем страницу$")
    public void goToSiteFirst() {
        open("https://qahacking.guru/");
        $(ABOUT_US).click();
    }

    @И("^переходим на вкладку О НАС$")
    public void goToAboutUs() {
        $(ABOUT_US).click();
    }


    @И("^открываем главную страницу$")
    public void goToSiteSecond() {
        open("https://qahacking.guru/");
        $(SHOPPING_BUTTON).click();
    }


    @И("^переходим в магазин$")
    public void goToShop() {
        $(SHOPPING_BUTTON).click();
    }
}
