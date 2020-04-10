package tree.searchtree;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {

    @Test
    public void insertData() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insert(8);
        binarySearchTree.insert(6);
        binarySearchTree.insert(10);
        binarySearchTree.insert(5);
        binarySearchTree.insert(15);
        binarySearchTree.insert(30);

    }

}
