package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaProductos extends PageObject {

    public static final Target LABEL_PRODUCTOS = Target.the("Label Productos")
            .locatedBy("//div[@class='product_label']");

    public static final Target ORDENAR_PRODUCTOS = Target.the("contenedor para ordenar productos")
            .locatedBy("//select[@class='product_sort_container']");

    public static Target opciondeOrden(String criterio) {
        return Target.the("opcion de ordenar por " + criterio)
                .locatedBy("//option[text()='{0}']")
                .of(criterio);
    }

    public static final Target NOMBRE_PRODUCTO = Target.the("clic en el nombre del producto")
            .locatedBy("//div[text()='Sauce Labs Backpack']");

    public static final Target BOTON_AGREGAR_CARRITO = Target.the("Boton para agregar al carrito")
            .locatedBy("//button[text()='ADD TO CART']");

    public static final Target BOTON_CARRITO = Target.the("Boton para ir al carrito")
            .locatedBy("//*[local-name()='svg']//ancestor::a");
}