package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {

    @Given("que el usuario esta en la pagina de inicio de sesion")
    public void que_el_usuario_esta_en_la_pagina_de_inicio_de_sesion() {
        // Aquí debes colocar el código para abrir el navegador y navegar a la URL de login.
        // Ejemplo (usando Selenium): driver.get("https://www.ejemplo.com/login");
        System.out.println("Paso Given: El usuario esta en la pagina de inicio de sesion.");
    }

    @When("el usuario ingresa credenciales validas")
    public void el_usuario_ingresa_credenciales_validas() {
        // Aquí debes colocar el código para ingresar las credenciales de usuario y contraseña.
        // Ejemplo (usando Selenium):
        // driver.findElement(By.id("username")).sendKeys("standard_user");
        // driver.findElement(By.id("password")).sendKeys("secret_sauce");
        System.out.println("Paso When: El usuario ingresa credenciales validas.");
    }

    @Then("es redirigido a la pagina de productos")
    public void es_redirigido_a_la_pagina_de_productos() {
        // Aquí debes colocar el código para verificar la redirección.
        // Ejemplo (usando Selenium):
        // Assert.assertTrue(driver.getCurrentUrl().equals("https://www.ejemplo.com/productos"));
        System.out.println("Paso Then: El usuario es redirigido a la pagina de productos.");
    }
}