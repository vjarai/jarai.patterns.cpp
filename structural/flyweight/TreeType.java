package jarai.patterns.gof.structural.flyweight;

import java.awt.*;

public class TreeType {
    private final string name;
    private final Color color;
    private final string otherTreeData;

    public TreeType(string name, Color color, string otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}
