import org.junit.*;
import org.junit.Test;
import tree.BinaryTree;
import tree.Node;

/**
 * Created by teng.liu on 2017/8/2.
 */
public class TreeTest {


    private Node<String> root;

    @BeforeClass
    public void   getRoot(){
        root = new BinaryTree().init();
        System.out.println("before class running");

    }

    @Test
    public void firstTraversal(){
        new BinaryTree().firstTraversal(root);
        System.out.println("");
    }

    @Test
    public void middleTraversal(){
        new BinaryTree().middleTraversal(root);
        System.out.println("");
    }

    @Test
    public void lastTraversal(){
        new BinaryTree().lastTraversal(root);
        System.out.println("");
    }


}
