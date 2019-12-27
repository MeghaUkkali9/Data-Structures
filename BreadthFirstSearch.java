
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch<T extends Comparable<T>> extends BinarySearchTree<T> {

    public  void breadthTraversal(){
        if(root == null){
            System.out.println("List is empty");
        }else{
            breadthSearchTraversal(root);
        }
    }

    private void breadthSearchTraversal(Node root) {

        Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while(!queue.isEmpty()) {
                Node<T> temp = queue.poll();
                System.out.print(temp.data+" ");
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
    }

}
