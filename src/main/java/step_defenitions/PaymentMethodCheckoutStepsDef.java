package step_defenitions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.И;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PaymentMethodCheckoutStepsDef {

    private static final By METHOD = By.xpath("//div[@class=\"name\"]");
    private static final By RADIO_METHOD = By.xpath(".//input[@name=\"payment_method\"]");
    private static final By NEXT = By.id("payment_submit");


    @И("^указываем способ оплаты \"(.*)\"$")
    public void selectMethod(String methodName) {
        SelenideElement method = $$(METHOD).findBy(Condition.text(methodName));
        method.$(RADIO_METHOD).click();
        $(NEXT).click();

    }
}