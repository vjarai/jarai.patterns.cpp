package jarai.patterns.gof.structural.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    static Map<string, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(string name, Color color, string otherTreeData) {

        TreeType result = treeTypes.get(name);

        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, result);
        }

        return result;
    }
}
