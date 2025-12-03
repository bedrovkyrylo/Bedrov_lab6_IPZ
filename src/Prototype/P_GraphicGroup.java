package Prototype;

import java.util.ArrayList;
import java.util.List;
/**
 * Клас для групи графічних елементів, що реалізує інтерфейс GraphicElement
 */
public class P_GraphicGroup implements P_GraphicElement {
    private String name;
    private List<P_GraphicElement> children = new ArrayList<>();

    /**
     * Конструктор для створення групи з ім'ям.
     *
     * @param name ім'я групи
     */
    public P_GraphicGroup(String name) {
        this.name = name;
    }

    /**
     * Додає елемент до групи.
     *
     * @param element графічний елемент для додавання
     */
    public void add(P_GraphicElement element) {
        System.out.println("Adding element to group " + name + ": " + element.getName());
        children.add(element);
    }

    /**
     * Отримує елемент групи за індексом.
     *
     * @param index індекс елементу
     * @return елемент групи
     */
    public P_GraphicElement getChild(int index) {
        return children.get(index);
    }

    /**
     * Клонує групу на заданій глибині.
     *
     * @param depth глибина клонування
     * @return нова копія групи
     */
    @Override
    public P_GraphicElement clone(int depth) {
        System.out.println("Cloning group: " + name + " (depth=" + depth + ")");
        P_GraphicGroup copy = new P_GraphicGroup(this.name + "_clone");

        if (depth <= 0) {
            System.out.println("  Performing shallow clone, children NOT cloned.");
            copy.children.addAll(this.children);
        } else if (depth == 1) {
            System.out.println("  Cloning only direct children with depth=0.");
            for (P_GraphicElement child : children) {
                copy.children.add(child.clone(0));
            }
        } else {
            System.out.println("  Recursively cloning children...");
            for (P_GraphicElement child : children) {
                copy.children.add(child.clone(depth - 1));
            }
        }
        return copy;
    }

    /**
     * Отримує ім'я групи.
     *
     * @return ім'я групи
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Встановлює нове ім'я групи.
     *
     * @param name нове ім'я групи
     */
    @Override
    public void setName(String name) {
        System.out.println("Updating group name: " + this.name + " -> " + name);
        this.name = name;
    }

    /**
     * Друкує групу та її елементи.
     *
     * @param indent відступ для форматування
     */
    @Override
    public void print(String indent) {
        System.out.println(indent + "Group: " + name);
        String childIndent = indent + "  ";
        for (P_GraphicElement child : children) {
            child.print(childIndent);
        }
    }
}
