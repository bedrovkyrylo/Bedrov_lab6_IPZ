package Factory;
/**
 * Конкретна фабрика для GTK, яка створює компоненти для GTK
 */
public class F_GtkFactory extends F_GUIFactory {
    /**
     * Створює кнопку для GTK.
     *
     * @return новий об'єкт кнопки для GTK
     */
    public F_Button createButton() {
        System.out.println("Створення кнопки для GTK");
        return new F_GtkButton();
    }
    /**
     * Створює чекбокс для GTK.
     *
     * @return новий об'єкт чекбоксу для GTK
     */
    public Checkbox createCheckbox() {
        System.out.println("Створення чекбоксу для GTK");
        return new F_GtkCheckbox();
    }
}

