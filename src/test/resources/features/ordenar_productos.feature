#language: es

Característica:Ordenar y gestionar productos en swaglabs

  Escenario: Ordenar productos por precio y gestionar el  carrito de compras
    Dado un usuario iniciado sesion en la aplicacion swaglabs
    Cuando el usuario ordena los productos por precio de menor a mayor
    Y el usuario agrega un productos al carrito de compras
    Y el usuario elemina el producto del carrito de compras
    Entonces el verifica que el pedido se puede realizar correctamente