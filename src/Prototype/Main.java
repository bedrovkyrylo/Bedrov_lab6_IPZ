package Prototype;
/**
 * Головний клас для демонстрації клонування графічних елементів.
 */
class Main {
    /**
     * Головний метод для демонстрації клонування графічних елементів.
     */
        public static void main(String[] args) {

            GraphicGroup scene = new GraphicGroup("Scene");

            GraphicGroup layer1 = new GraphicGroup("Layer1");
            GraphicGroup layer2 = new GraphicGroup("Layer2");

            GraphicGroup groupA = new GraphicGroup("GroupA");

            PrimitiveGraphic circle = new PrimitiveGraphic("Circle");
            PrimitiveGraphic rect   = new PrimitiveGraphic("Rectangle");
            PrimitiveGraphic line   = new PrimitiveGraphic("Line");

            groupA.add(circle);
            groupA.add(rect);

            layer1.add(groupA);
            layer2.add(line);

            scene.add(layer1);
            scene.add(layer2);

            System.out.println("\n=== ORIGINAL SCENE ===");
            scene.print("");

            GraphicGroup sceneDepth0 = (GraphicGroup) scene.clone(0);
            System.out.println("\n=== CLONE depth=0 ===");
            sceneDepth0.print("");

            GraphicGroup layer1FromCopy0 = (GraphicGroup) sceneDepth0.getChild(0);
            GraphicGroup groupAFromCopy0 = (GraphicGroup) layer1FromCopy0.getChild(0);
            PrimitiveGraphic circleFromCopy0 = (PrimitiveGraphic) groupAFromCopy0.getChild(0);
            circleFromCopy0.setName("Circle_modified_via_depth0");

            System.out.println("\n=== AFTER MODIFY depth=0 ===");
            System.out.println("ORIGINAL:");
            scene.print("");
            System.out.println("COPY:");
            sceneDepth0.print("");

            GraphicGroup sceneDepth1 = (GraphicGroup) scene.clone(1);
            System.out.println("\n=== CLONE depth=1 ===");
            sceneDepth1.print("");

            GraphicGroup layer1FromCopy1 = (GraphicGroup) sceneDepth1.getChild(0);
            GraphicGroup groupAFromCopy1 = (GraphicGroup) layer1FromCopy1.getChild(0);
            PrimitiveGraphic rectFromCopy1 = (PrimitiveGraphic) groupAFromCopy1.getChild(1);
            rectFromCopy1.setName("Rectangle_modified_via_depth1");

            System.out.println("\n=== AFTER MODIFY depth=1 ===");
            System.out.println("ORIGINAL:");
            scene.print("");
            System.out.println("COPY:");
            sceneDepth1.print("");

            GraphicGroup sceneDepth2 = (GraphicGroup) scene.clone(2);
            System.out.println("\n=== CLONE depth=2 ===");
            sceneDepth2.print("");

            GraphicGroup layer2FromCopy2 = (GraphicGroup) sceneDepth2.getChild(1);
            PrimitiveGraphic lineFromCopy2 = (PrimitiveGraphic) layer2FromCopy2.getChild(0);
            lineFromCopy2.setName("Line_modified_via_depth2");

            System.out.println("\n=== AFTER MODIFY depth=2 ===");
            System.out.println("ORIGINAL:");
            scene.print("");
            System.out.println("COPY:");
            sceneDepth2.print("");
        }
    }