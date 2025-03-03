package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaProductos extends PageObject {

    public static final Target LABEL_PRODUCTOS = Target.the("Etiqueta de Productos")
            .locatedBy("//div[@class='product_label']");

    public static final Target ORDENAR_PRODUCTOS = Target.the("Menú desplegable para ordenar productos")
            .locatedBy("//select[@class='product_sort_container']");

    public static Target opcionDeOrden(String criterio) {
        return Target.the("opcion de ordenar por " + criterio)
                .locatedBy("//option[text()='{0}']")
                .of(criterio);
    }

    public static Target BOTON_AGREGAR_CARRITO_POR_NOMBRE(String nombreProducto) {
        return Target.the("Botón para agregar al carrito del producto: " + nombreProducto)
                .locatedBy("//div[contains(text(), '" + nombreProducto + "')]/ancestor::div[@class='inventory_item']//button[text()='ADD TO CART']");
    }
    public static final Target BOTON_CARRITO = Target.the("Boton para ir al carrito")
            .locatedBy("//*[local-name()='svg']//ancestor::a");
}
