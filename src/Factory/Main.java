package Factory;
/**
 * Головний клас для демонстрації використання фабрики та її конкретних реалізацій.
 */
public class Main {
    public static void main(String[] args) {
        GUIFactory factory = new WinFactory();

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.paint();
        button.click();
        checkbox.paint();
        checkbox.click();
    }
}