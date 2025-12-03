package Factory;
/**
 * Абстрактна фабрика для створення GUI компонентів (кнопок та чекбоксів).
 */
abstract class GUIFactory {
    /**
     * Створює кнопку.
     *
     * @return новий об'єкт кнопки
     */
    public abstract Button createButton();
    /**
     * Створює чекбокс.
     *
     * @return новий об'єкт чекбоксу
     */
    public abstract Checkbox createCheckbox();
}
