#language: es

Característica: Ordenar productos en Swag Labs
    yo como usuario de Swag Labs
    quiero ordenar productos y realizar una compra
    para poder comprar los productos que necesito


  Escenario: Ordenar productos y realizar compra
    Dado un usuario inicia sesión con usuario "standard_user" y contraseña "secret_sauce"
    Cuando ordena los productos por "Price (low to high)"
    Y agrega los productos "Sauce Labs Backpack" y "Sauce Labs Bike Light" al carrito
    Y elimina el producto "Sauce Labs Backpack" del carrito
    Y finaliza la compra
    Entonces la compra se completa exitosamentes