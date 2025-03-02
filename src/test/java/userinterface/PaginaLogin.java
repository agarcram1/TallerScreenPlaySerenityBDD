package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaLogin extends PageObject {

    public static final Target CAJA_USERNAME = Target.the("Caja de texto para ingresar el usuario")
            .locatedBy("//input[@id='user-name']");

    public static final Target CAJA_PASSWORD = Target.the("Caja de texto para ingresar la contraseña")
            .locatedBy("//input[@id='password']");

    public static final Target BOTON_LOGIN = Target.the("Boton para iniciar sesion")
            .locatedBy("//input[@id='login-button']");


}
