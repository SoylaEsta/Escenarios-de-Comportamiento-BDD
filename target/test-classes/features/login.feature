# language: Español
Feature: Inicio de sesión en www.Saucedemo.com

# Narrativa que describe la funcionalidad
# y su valor para el negocio.
Como usuario registrado,
quiero poder iniciar sesión
para acceder a la lista de productos.


@Login
Scenario: Inicio de sesión exitoso con credenciales válidas
  
  # Precondición: ¿Dónde debe comenzar el usuario?
  Given que el usuario está en la página de login de Sauce Demo
  
  # Acción: ¿Qué hace el usuario?
  When ingresa credenciales válidas
  
  # Resultado: ¿Cuál es el resultado esperado?
  Then es redirigido a la página de productos