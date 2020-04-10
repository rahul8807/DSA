package tree.searchtree;

import java.util.Comparator;
import java.util.Objects;

public class BinarySearchTree<T extends Comparable> {

    private Comparator<T> compare = (x, y) -> x.compareTo(y);

    private BinarySearchTreeNode<T> root;


    public BinarySearchTreeNode<T> insert(T data) {
        return insertData(this.root, data);
    }

    public BinarySearchTreeNode<T> insertData(BinarySearchTreeNode<T> root, T data) {
        if (root == null) {
            this.root = new BinarySearchTreeNode<>(data);
        } else if (compare.compare(data, root.getData()) < 0) {
            if (root.getLeft() == null) {
                root.setLeft(new BinarySearchTreeNode<>(data));
            } else {
                insertData(root.getLeft(), data);
            }
        } else {
            if (root.getRight() == null) {
                root.setRight(new BinarySearchTreeNode<>(data));
            } else {
                insertData(root.getRight(), data);
            }
        }
        return root;
    }


    public BinarySearchTreeNode<T> findNodeUsingRecurssion(BinarySearchTreeNode<T> root, T data) {
        if (root == null) {
            return null;
        } else {
            if (root.getData().equals(data)) {
                return root;
            } else if (compare.compare(data, root.getData()) < 0) {
                findNodeUsingRecurssion(root.getLeft(), data);
            } else {
                findNodeUsingRecurssion(root.getRight(), data);
            }
        }
        return null;
    }


}
