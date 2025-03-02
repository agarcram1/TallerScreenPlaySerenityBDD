#language: es

Característica: Usuario bloqueado en swaglabs

  Escenario: Intento de inocion de sesion con usuario bloqueado
    Dado un usuario esta bloqueado en la aplicacion swaglabs
    Cuando el usuario intenta iniciar sesion
    Entonces el usuario visualiza el mensaje de error "Epic sadface: Sorry, this user has been locked out."
