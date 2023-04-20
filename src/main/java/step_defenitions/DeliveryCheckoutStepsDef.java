package step_defenitions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.И;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DeliveryCheckoutStepsDef {

    private static final By DELIVERY_METHOD = By.xpath("//div[@class=\"name\"]");
    private static final By RADIO_DELIVERY_METHOD = By.xpath(".//input[@name=\"sh_pr_method_id\"]");
    private static final By NEXT = By.xpath("//input[@type=\"submit\"]");

    @И("^указываем способ доставки \"(.*)\"$")
    public void selectDeliveryMethod(String methodName) {
        SelenideElement method = $$(DELIVERY_METHOD).findBy(Condition.text(methodName));
        method.$(RADIO_DELIVERY_METHOD).click();
        $(NEXT).click();
    }

}
