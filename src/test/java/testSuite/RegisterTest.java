package testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class RegisterTest extends TestBasePeloteo {
    @Test
    public void respuesta() throws InterruptedException {
        String name = "Samuel";
        String lastanme = "Escobar";
        String email = getRandomString(8) + "@gmail.com";
        String password = getRandomString(8);
        String phone = "77587417";
        String searchButtonText = "Buscar";
        loginPage.registerButton.click();
        Thread.sleep(1000);
        registerPage.nameTextBox.clearSetText(name);
        Thread.sleep(1000);
        registerPage.lastnameTextBox.clearSetText(lastanme);
        Thread.sleep(1000);
        registerPage.emailTextBox.clearSetText(email);
        Thread.sleep(1000);
        registerPage.passwordTextBox.clearSetText(password);
        Thread.sleep(1000);
        registerPage.phoneTextBox.clearSetText(phone);
        Thread.sleep(1000);
        registerPage.registerButton.click();
        Thread.sleep(1000);
        Assertions.assertEquals(searchButtonText, mainPage.searchButton.getText(),
                "ERROR! No se registro la cuenta correctamente");
    }

}
