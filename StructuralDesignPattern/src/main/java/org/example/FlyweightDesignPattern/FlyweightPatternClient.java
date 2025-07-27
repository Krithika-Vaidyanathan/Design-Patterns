package org.example.FlyweightDesignPattern;

//Client (Forest)
//If each tree stored name, color, texture for 1 million trees, that's 50GB.
//With Flyweight pattern, we only store 2 treetypes (100kb) + positions, saving huge memory.
//Only two treeType objects exist, reused for all trees.
//Each tree only stores its extrinsic data (x, y) saving memory.
public class FlyweightPatternClient {
    public static void main(String[] args) {
        TreeFlyweight oakType = TreeFactory.getTreeType("Oak", "Green", "Rough Bark");
        TreeFlyweight pineType = TreeFactory.getTreeType("Pine", "Dark green", "Smooth bark");

        Tree[] trees = {
                new Tree(10, 20, oakType),
                new Tree(30, 40, oakType),
                new Tree(50, 60, pineType),
                new Tree(70, 80, pineType)
        };

        for(Tree tree : trees) {
            tree.draw();
        }
    }
}
