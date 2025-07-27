package org.example.FlyweightDesignPattern;

import java.util.HashMap;
import java.util.Map;

//Step3: Flyweight Factory: returns shared TreeType instances
public class TreeFactory {
    private static Map<String, TreeFlyweight> treeTypes = new HashMap<>();

    public static TreeFlyweight getTreeType(String name, String color, String texture) {
        String key = name + "-" + color + "-" + texture;
        if(!treeTypes.containsKey(key)) {
            treeTypes.put(key, new TreeType(name, color, texture));
        }
        return treeTypes.get(key);
    }
}
