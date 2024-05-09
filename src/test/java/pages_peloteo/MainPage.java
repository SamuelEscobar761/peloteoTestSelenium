package pages_peloteo;

import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;
import controls.Button;

public class MainPage {
    public Button userButton = new Button(By.xpath("///a[text()='Usuario'])"));
    public Button searchButton = new Button(By.xpath("//button[text()='Buscar']"));
    public Label activityName = new Label(By.xpath(""));
    public Button activityDetailsButton = new Button(By.xpath(""));
    public TextBox searchTextBox = new TextBox(By.xpath(""));

}
