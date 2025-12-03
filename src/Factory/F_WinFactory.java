package Factory;
/**
 * Конкретна фабрика для WinAPI, яка створює компоненти для WinAPI
 */
public class F_WinFactory extends F_GUIFactory {
    /**
     * Створює кнопку для WinAPI.
     *
     * @return новий об'єкт кнопки для WinAPI
     */
    public F_Button createButton() {
        System.out.println("Створення кнопки для WinAPI");
        return new F_WinButton();
    }

    /**
     * Створює чекбокс для WinAPI.
     *
     * @return новий об'єкт чекбоксу для WinAPI
     */
    public Checkbox createCheckbox() {
        System.out.println("Створення чекбоксу для WinAPI");
        return new F_WinCheckbox();
    }
}