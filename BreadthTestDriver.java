
public class BreadthTestDriver {

        public static void main(String[] args) {

            BreadthFirstSearch<Integer> binaryTree1 = new BreadthFirstSearch<>();

            //Used add() method of the BinarySearchTree class to insert the element in the Binary tree
            binaryTree1.add(50);
            binaryTree1.add(30);
            binaryTree1.add(10);
            binaryTree1.add(20);
            binaryTree1.add(40);
            binaryTree1.add(70);
            binaryTree1.add(60);
            binaryTree1.add(80);
            binaryTree1.add(8);
            binaryTree1.add(34);

            System.out.println("Binary Tree 1: ");
            //Used toString() to display the representation of the tree.
            System.out.println(binaryTree1.toString());

            System.out.println("Breadth-first traversal order is: ");
            //breadthTraversal() method to print the level order traversal of BreadthFirstTraversal algorithm
            binaryTree1.breadthTraversal();
            System.out.println();
            System.out.println();


        }
    }

/*
OUTPUT:

Binary Tree 1:
50
  30
    10
      8
        null
        null
      20
        null
        null
    40
      34
        null
        null
      null
  70
    60
      null
      null
    80
      null
      null

Breadth-first traversal order is:
50 30 70 10 40 60 80 8 20 34

Binary Tree 2:
34
  2
    1
      null
      null
    24
      null
      null
  67
    60
      null
      null
    69
      null
      null

Breadth-first traversal order is:
34 2 67 1 24 60 69

Binary Tree 3:
8
  4
    2
      null
      null
    5
      null
      null
  10
    null
    null

Breadth-first traversal order is:
8 4 10 2 5
Process finished with exit code 0

*/