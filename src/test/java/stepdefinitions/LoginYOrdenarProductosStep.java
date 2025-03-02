package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

public class LoginYOrdenarProductosStep {
    @Dado("un usuario iniciado sesion en la aplicacion swaglabs")
    public void usuarioHaIniciadosesion() {
    }

    @Cuando("el usuario ordena los productos por precio de menor a mayor")
    public void UsuarioOrdenaproductosPorPrecio() {
    }

    @Y("el usuario agrega un productos al carrito de compras")
    public void usuarioAgregaProductosAlCarrito() {
    }

    @Y("el usuario elemina el producto del carrito de compras")
    public void usuarioEliminaProductoDelCarrito() {
    }

    @Entonces("el verifica que el pedido se puede realizar correctamente")
    public void verificaPedidoRealizable() {
    }
}
