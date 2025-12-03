package Factory;
/**
 * Конкретна фабрика для WinAPI, яка створює компоненти для WinAPI.
 */
class WinFactory extends GUIFactory {
    /**
     * Створює кнопку для WinAPI.
     *
     * @return новий об'єкт кнопки для WinAPI
     */
    public Button createButton() {
        System.out.println("Створення кнопки для WinAPI");
        return new WinButton();
    }

    /**
     * Створює чекбокс для WinAPI.
     *
     * @return новий об'єкт чекбоксу для WinAPI
     */
    public Checkbox createCheckbox() {
        System.out.println("Створення чекбоксу для WinAPI");
        return new WinCheckbox();
    }
}