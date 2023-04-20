package step_defenitions;

import com.codeborne.selenide.Condition;
import io.cucumber.java.ru.И;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class FinalCheckoutStepsDef {

    private static final By ASSERT_DELIVERY = By.xpath("//div[@class=\"shipping_info\"]/span");
    private static final By ASSERT_PAYMENT = By.xpath("//div[@class=\"payment_info\"]/span");
    private static final By ACCEPT_ALL = By.id("agb");
    private static final By FINAL_BUTTON = By.xpath("//input[@value=\"Подтвердить заказ\"]");
    private static final By THANKS = By.xpath("//div[@class=\"uk-container\"]/p");


    @И("^проверяем Вид доставки и Вид платежа$")
    public void checkDataOfDeliveryAndPayment() {
        $(ASSERT_DELIVERY).shouldHave(Condition.text("Экспресс"));
        $(ASSERT_PAYMENT).shouldHave(Condition.text("Онлайн оплата"));
    }

    @И("^подтверждаем правила и право возврата$")
    public void setAcceptAll() {
        $(ACCEPT_ALL).click();
    }

    @И("^подтверждаем заказ$")
    public void setFinalButton() {
        $(FINAL_BUTTON).click();
        $(THANKS).shouldHave(Condition.text("Спасибо за заказ"));
    }

}
