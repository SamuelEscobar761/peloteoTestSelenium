package pages_peloteo;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class UserPage {
    public TextBox nameTextBox = new TextBox(By.id("firstname"));
    public TextBox lastnameTextBox = new TextBox(By.id("lastname"));
    public TextBox emailTextBox = new TextBox(By.id("email"));
    public TextBox phoneNumberTextBox = new TextBox(By.id("phone"));
    public Button saveChangesButton = new Button(By.xpath("//button[text()='Guardar cambios']"));
}
