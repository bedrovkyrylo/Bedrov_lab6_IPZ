package Prototype;
/**
 * Інтерфейс для графічних елементів, які можуть бути клоновані та мати ім'я
 */
public interface P_GraphicElement {
    /**
     * Створює клон графічного елементу.
     *
     * @param depth глибина клонування
     * @return новий об'єкт GraphicElement, який є клоном поточного
     */
    P_GraphicElement clone(int depth);
    /**
     * Отримує ім'я графічного елементу.
     *
     * @return ім'я елементу
     */
    String getName();

    /**
     * Встановлює нове ім'я для графічного елементу.
     *
     * @param name нове ім'я
     */
    void setName(String name);

    /**
     * Друкує представлення елементу з відступами.
     *
     * @param indent відступ для форматування
     */
    void print(String indent);
}