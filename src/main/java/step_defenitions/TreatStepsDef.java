package step_defenitions;

import com.codeborne.selenide.Condition;
import io.cucumber.java.bg.И;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class TreatStepsDef {

    private static final By SELECT_COLOR = By.id("jshop_attr_id1");
    private static final By PRICE = By.id("pricelist_from_1");
    private static final By QUANTITY = By.id("quantity");
    private static final By RED = By.xpath("//option[@value=\"2\"]");
    private static final By WISHLIST = By.xpath("//input[@value=\"В список пожеланий\"]");


    @И("^меняем цвет на красный$")
    public void changeColor() {
        $(PRICE).shouldHave(Condition.text("122.30 DogCoin"));
        $(SELECT_COLOR).click();
        $(RED).click();
        $(PRICE).shouldHave(Condition.text("127.30 DogCoin"));
    }

    @И("^меняем количество на (\\d+)$")
    public void changeQuantity(String number) {
        $(QUANTITY).clear();
        $(QUANTITY).sendKeys(number);
    }

    @И("^добавляем Перекус для собачки в Список пожеланий$")
    public void treatGoToWishlist() {
        $(WISHLIST).click();
    }
}
