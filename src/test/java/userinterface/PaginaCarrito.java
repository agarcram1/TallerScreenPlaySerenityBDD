package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaginaCarrito extends PageObject {

    public static Target BOTON_ELIMINAR_DEL_CARRITO(String nombreProducto) {
        return Target.the("Botón para eliminar del carrito el producto: " + nombreProducto)
                .locatedBy("//div[contains(text(), '" + nombreProducto + "')]/ancestor::div[@class='cart_item']//button[text()='REMOVE']");
    }

    public static final Target BOTON_CHECKOUT = Target.the("Boton para ir al checkout")
            .locatedBy("//a[text()='CHECKOUT']");

    public void waitForElementToBePresent(WebDriver driver, By locator, int timeoutInSeconds) {
        new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                .until(ExpectedConditions.presenceOfElementLocated(locator));
        }

        public static final Target MENSAJE_COMPRA_EXITOSA = Target.the("Mensaje de compra exitosa")
            .locatedBy("//h2[contains(@class, 'complete-header')]");


}

