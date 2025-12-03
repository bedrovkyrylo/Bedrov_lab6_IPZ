package Prototype;
/**
 * Головний клас для демонстрації клонування графічних елементів.
 */
public class MainP {
    /**
     * Головний метод для демонстрації клонування графічних елементів.
     */
        public static void main(String[] args) {

            P_GraphicGroup scene = new P_GraphicGroup("Scene");

            P_GraphicGroup layer1 = new P_GraphicGroup("Layer1");
            P_GraphicGroup layer2 = new P_GraphicGroup("Layer2");

            P_GraphicGroup groupA = new P_GraphicGroup("GroupA");

            P_PrimitiveGraphic circle = new P_PrimitiveGraphic("Circle");
            P_PrimitiveGraphic rect   = new P_PrimitiveGraphic("Rectangle");
            P_PrimitiveGraphic line   = new P_PrimitiveGraphic("Line");

            groupA.add(circle);
            groupA.add(rect);

            layer1.add(groupA);
            layer2.add(line);

            scene.add(layer1);
            scene.add(layer2);

            System.out.println("\n=== ORIGINAL SCENE ===");
            scene.print("");

            P_GraphicGroup sceneDepth0 = (P_GraphicGroup) scene.clone(0);
            System.out.println("\n=== CLONE depth=0 ===");
            sceneDepth0.print("");

            P_GraphicGroup layer1FromCopy0 = (P_GraphicGroup) sceneDepth0.getChild(0);
            P_GraphicGroup groupAFromCopy0 = (P_GraphicGroup) layer1FromCopy0.getChild(0);
            P_PrimitiveGraphic circleFromCopy0 = (P_PrimitiveGraphic) groupAFromCopy0.getChild(0);
            circleFromCopy0.setName("Circle_modified_via_depth0");

            System.out.println("\n=== AFTER MODIFY depth=0 ===");
            System.out.println("ORIGINAL:");
            scene.print("");
            System.out.println("COPY:");
            sceneDepth0.print("");

            P_GraphicGroup sceneDepth1 = (P_GraphicGroup) scene.clone(1);
            System.out.println("\n=== CLONE depth=1 ===");
            sceneDepth1.print("");

            P_GraphicGroup layer1FromCopy1 = (P_GraphicGroup) sceneDepth1.getChild(0);
            P_GraphicGroup groupAFromCopy1 = (P_GraphicGroup) layer1FromCopy1.getChild(0);
            P_PrimitiveGraphic rectFromCopy1 = (P_PrimitiveGraphic) groupAFromCopy1.getChild(1);
            rectFromCopy1.setName("Rectangle_modified_via_depth1");

            System.out.println("\n=== AFTER MODIFY depth=1 ===");
            System.out.println("ORIGINAL:");
            scene.print("");
            System.out.println("COPY:");
            sceneDepth1.print("");

            P_GraphicGroup sceneDepth2 = (P_GraphicGroup) scene.clone(2);
            System.out.println("\n=== CLONE depth=2 ===");
            sceneDepth2.print("");

            P_GraphicGroup layer2FromCopy2 = (P_GraphicGroup) sceneDepth2.getChild(1);
            P_PrimitiveGraphic lineFromCopy2 = (P_PrimitiveGraphic) layer2FromCopy2.getChild(0);
            lineFromCopy2.setName("Line_modified_via_depth2");

            System.out.println("\n=== AFTER MODIFY depth=2 ===");
            System.out.println("ORIGINAL:");
            scene.print("");
            System.out.println("COPY:");
            sceneDepth2.print("");
        }
    }