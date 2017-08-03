package tree;

/**
 * Created by teng.liu on 2017/8/2.
 */
public class BinaryTree {

    public Node<String> init() {
        Node<String> D = new Node<String>("D", null, null);
        Node<String> H = new Node<String>("H", null, null);
        Node<String> I = new Node<String>("I", null, null);
        Node<String> J = new Node<String>("J", null, null);
        Node<String> P = new Node<String>("P", null, null);
        Node<String> G = new Node<String>("G", P, null);
        Node<String> F = new Node<String>("F", null, J);
        Node<String> E = new Node<String>("E", H, I);
        Node<String> B = new Node<String>("B", D, E);
        Node<String> C = new Node<String>("C", F, G);
        Node<String> A = new Node<String>("A", B, C);
        return A;
    }


    public void firstTraversal(Node<String> root){

        System.out.print( root.getName() + " ");

        if(root.getLeft() != null){
            firstTraversal(root.getLeft());
        }

        if(root.getRight() != null){
            firstTraversal(root.getRight());
        }
    }

    public void middleTraversal(Node<String> root){

        if(root.getLeft() != null){
            middleTraversal(root.getLeft());
        }

        System.out.print( root.getName() + " ");

        if(root.getRight() != null){
            middleTraversal(root.getRight());
        }
    }

    public void lastTraversal(Node<String> root){

        if(root.getLeft() != null){
            lastTraversal(root.getLeft());
        }
        if(root.getRight() != null){
            lastTraversal(root.getRight());
        }
        System.out.print( root.getName() +  " ");
    }
}
