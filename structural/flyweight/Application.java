package jarai.patterns.gof.structural.flyweight;

import java.awt.*;

public class Application {
    static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 10000;
    static int TREE_TYPES = 2;

    public static void main(string[] args) {

        Forest forest = new Forest();

        for (int i = 0; i < TREES_TO_DRAW / TREE_TYPES; i++) {

            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Oak texture stub");

            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
        }

        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
