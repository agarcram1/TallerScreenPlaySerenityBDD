package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaInfomacionCliente extends PageObject {

    public static final Target CAMPO_NOMBRE = Target.the("Campo para ingresar el nombre")
        .locatedBy("//input[@id='first-name']");

    public static final Target CAMPO_APELLIDO = Target.the("Campo para ingresar el apellido")
        .locatedBy("//input[@id='last-name']");

    public static final Target CAMPO_CODIGO_POSTAL = Target.the("Campo para ingresar el codigo postal")
        .locatedBy("//input[@id='postal-code']");

    public static final Target BOTON_CONTINUAR = Target.the("Boton para continuar")
        .locatedBy("//input[@class='btn_primary cart_button']");

    public static final Target BOTON_FINALIZAR = Target.the("Boton para finalizar compra")
        .locatedBy("//a[text()='FINISH']");


}
