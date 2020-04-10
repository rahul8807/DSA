package tree.searchtree;

public class BinarySearchTreeNode<T extends Comparable> {
    private T data;
    private BinarySearchTreeNode<T> left;
    private BinarySearchTreeNode<T> right;

    public BinarySearchTreeNode() {
    }

    public BinarySearchTreeNode(T data) {
        this.data = data;
    }

    public BinarySearchTreeNode(T data, BinarySearchTreeNode<T> left, BinarySearchTreeNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinarySearchTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinarySearchTreeNode<T> left) {
        this.left = left;
    }

    public BinarySearchTreeNode<T> getRight() {
        return right;
    }

    public void setRight(BinarySearchTreeNode<T> right) {
        this.right = right;
    }
}
