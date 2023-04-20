package step_defenitions;

import com.codeborne.selenide.Condition;
import io.cucumber.java.ru.И;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class BasketStepsDef {
    private static final By TOTAL = By.xpath("//td[@class=\"value\"]");
    private static final By BUTTON_CHECKOUT = By.xpath("//a[@class=\"btn btn-arrow-right\"]");

    @И("^нажимаем оформить заказ$")
    public void setButtonCheckout() {
        $(TOTAL).shouldHave(Condition.text("381.90 DogCoin"));
        $(BUTTON_CHECKOUT).click();

    }
}
