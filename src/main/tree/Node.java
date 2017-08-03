package tree;

/**
 * Created by teng.liu on 2017/8/2.
 */
public class Node<T> {

    private T name;
    private Node<T> left, right;

    public Node(T name) {
        this.name = name;
    }

    public Node(T name, Node<T> left, Node<T> right) {
        this.name = name;
        this.left = left;
        this.right = right;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }
}
