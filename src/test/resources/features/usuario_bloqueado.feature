#language: es

Característica: Usuario bloqueado en Swag Labs
    Yo como usuario de Swag Labs
    Quiero saber si un usuario está bloqueado
    Para evitar que un usuario bloqueado inicie sesión

  Escenario: Intentar iniciar sesión con un usuario bloqueado
    Dado un usuario intenta iniciar sesión con usuario "locked_out_user" y contraseña "secret_sauce"
    Entonces el sistema muestra el mensaje de error "Epic sadface: Sorry, this user has been locked out."
