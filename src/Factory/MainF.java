package Factory;
/**
 * Головний клас для демонстрації використання фабрики та її конкретних реалізацій.
 */
public class MainF {
    public static void main(String[] args) {
        F_GUIFactory factory = new F_WinFactory();

        F_Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.paint();
        button.click();
        checkbox.paint();
        checkbox.click();
    }
}