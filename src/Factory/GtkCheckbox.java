package Factory;
/**
 * Конкретний чекбокс для GTK.
 */
class GtkCheckbox implements Checkbox {
    /**
     * Малює чекбокс для GTK.
     */
    public void paint() {
        System.out.println("Малювання чекбоксу для GTK");
    }
    /**
     * Обробляє натискання чекбоксу для GTK.
     */
    public void click() {
        System.out.println("Натискання чекбоксу для GTK");
    }
}