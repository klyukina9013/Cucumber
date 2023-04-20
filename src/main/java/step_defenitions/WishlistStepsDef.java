package step_defenitions;

import io.cucumber.java.bg.И;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class WishlistStepsDef {

    private static final By COMEBACK = By.xpath("//a[@class=\"btn btn-arrow-left\"]");
    private static final By DELETE = By.xpath("//a[@href=\"/index.php/magazin/izbrannoe/delete?number_id=0\"]");
    private static final By BASKET = By.xpath("(//a[@href=\"/index.php/magazin/izbrannoe/remove_to_cart?number_id=1\"])[1]");

    @И("^нажимаем на кнопку Вернуться в магазин$")
    public void goToWishlist() {
        $(COMEBACK).click();
    }

    @И("^удаляем Выпуск подкаста из Списка пожеланий$")
    public void delPodcast() {
        $(DELETE).click();
    }

    @И("^добавляем Перекус для собачки в корзину$")
    public void addToBasket() {
        $(BASKET).click();
    }
}
