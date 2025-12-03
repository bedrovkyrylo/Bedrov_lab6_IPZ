package Factory;
/**
 * Конкретна кнопка для WinAPI
 */
public class F_WinButton implements F_Button {
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