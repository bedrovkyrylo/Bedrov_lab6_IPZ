package Factory;
/**
 * Абстрактна фабрика для створення GUI компонентів (кнопок та чекбоксів)
 */
public abstract class F_GUIFactory {
    /**
     * Створює кнопку.
     *
     * @return новий об'єкт кнопки
     */
    public abstract F_Button createButton();
    /**
     * Створює чекбокс.
     *
     * @return новий об'єкт чекбоксу
     */
    public abstract Checkbox createCheckbox();
}
