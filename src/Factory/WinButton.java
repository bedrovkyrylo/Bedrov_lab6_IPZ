package Factory;
/**
 * Конкретна кнопка для WinAPI.
 */
class WinButton implements Button {
    /**
     * Малює кнопку для WinAPI.
     */
    public void paint() {
        System.out.println("Малювання кнопки для WinAPI");
    }
    /**
     * Обробляє натискання кнопки для WinAPI.
     */
    public void click() {
        System.out.println("Натискання кнопки для WinAPI");
    }
}