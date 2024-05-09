package pages_peloteo;

import controls.Button;
import org.openqa.selenium.By;
import controls.TextBox;

public class LoginPage {
    public TextBox emailTextBox = new TextBox(By.id("email"));
    public TextBox passwordTextBox = new TextBox(By.id("password"));
    public Button loginButton = new Button(By.xpath("//button[contains(@type, 'submit')]"));
    public Button registerButton = new Button(By.xpath("//a[contains(@href, '/register')]"));
}
