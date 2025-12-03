package Factory;
/**
 * Конкретний чекбокс для WinAPI
 */
public class F_WinCheckbox implements Checkbox {
    /**
     * Малює чекбокс для WinAPI.
     */
    public void paint() {
        System.out.println("Малювання чекбоксу для WinAPI");
    }
    /**
     * Обробляє натискання чекбоксу для WinAPI.
     */
    public void click() {
        System.out.println("Натискання чекбоксу для WinAPI");
    }
}
