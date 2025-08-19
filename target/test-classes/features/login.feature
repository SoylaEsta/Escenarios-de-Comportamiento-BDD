@Login
Feature: Inicio de sesion en la aplicacion de e-commerce

  Como usuario registrado
  Quiero poder iniciar sesion
  Para acceder a la lista de productos

  Scenario: Inicio de sesion exitoso con credenciales validas
    Given que el usuario esta en la pagina de inicio de sesion
    When el usuario ingresa credenciales validas
    Then es redirigido a la pagina de productos