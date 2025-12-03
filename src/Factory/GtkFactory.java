package Factory;
/**
 * Конкретна фабрика для GTK, яка створює компоненти для GTK.
 */
class GtkFactory extends GUIFactory {
    /**
     * Створює кнопку для GTK.
     *
     * @return новий об'єкт кнопки для GTK
     */
    public Button createButton() {
        System.out.println("Створення кнопки для GTK");
        return new GtkButton();
    }
    /**
     * Створює чекбокс для GTK.
     *
     * @return новий об'єкт чекбоксу для GTK
     */
    public Checkbox createCheckbox() {
        System.out.println("Створення чекбоксу для GTK");
        return new GtkCheckbox();
    }
}

