package Prototype;
/**
 * Клас для примітивного графічного елементу, що реалізує інтерфейс GraphicElement.
 */
class PrimitiveGraphic implements GraphicElement {
    private String name;

    /**
     * Конструктор для створення примітиву з ім'ям.
     *
     * @param name ім'я примітиву
     */
    public PrimitiveGraphic(String name) {
        this.name = name;
    }

    /**
     * Клонує примітив.
     *
     * @param depth глибина клонування
     * @return новий примітив
     */
    @Override
    public GraphicElement clone(int depth) {
        System.out.println("Cloning primitive: " + name + " (depth=" + depth + ")");
        return new PrimitiveGraphic(this.name + "_clone");
    }

    /**
     * Отримує ім'я примітиву.
     *
     * @return ім'я примітиву
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Встановлює нове ім'я для примітиву.
     *
     * @param name нове ім'я примітиву
     */
    @Override
    public void setName(String name) {
        System.out.println("Updating primitive name: " + this.name + " -> " + name);
        this.name = name;
    }

    /**
     * Друкує примітивний елемент.
     *
     * @param indent відступ для форматування
     */
    @Override
    public void print(String indent) {
        System.out.println(indent + "Primitive: " + name);
    }
}
