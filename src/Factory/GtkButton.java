package Factory;
/**
 * Конкретна кнопка для GTK.
 */
class GtkButton implements Button {
    /**
     * Обробляє натискання кнопки для GTK.
     */
    public void paint() {
        System.out.println("Малювання кнопки для GTK");
    }

    /**
     * Обробляє натискання кнопки для GTK.
     */
    public void click() {
        System.out.println("Натискання кнопки для GTK");
    }
}