/**
 * \file:   SingleLinkedListDriver.java
 * \author: Megha Ukkali
 * \date:   10/01/2019
 */

import java.util.Scanner;

public class SingleLinkedListDriver {

    public static void main(String args[]) {

        SingleLinkedList<String> list = new SingleLinkedList<>();

        Scanner in = new Scanner(System.in);
        Scanner add = new Scanner(System.in);
        Scanner op = new Scanner(System.in);
        Scanner last = new Scanner(System.in);
        Scanner set = new Scanner(System.in);

        boolean quit = false; // variable of type boolean, quit is assigned to false

        while (!quit) {

            System.out.println("Please select operations");

            System.out.println("1: Add Node\n2: Delete Node\n3: Swap nodes\n4: Display list\n" +
                    "5: Update existed Node data\n6: Get index of a Node\n7: Exit");
            String command = in.next();

            try {
                if (command.equalsIgnoreCase("1")) {

                    if (list.size() != 0) {

                        System.out.println("1: Add Node at front\n2: Add node at specified position\n" +
                                "3: Add node at last");
                        
                        String input3 = op.next();

                        if (input3.equalsIgnoreCase("1")) {

                            int index = 0;
                            System.out.println("Please enter item to add in the list");
                            String item = add.next();            
                            list.add(index, item);               

                        } else if (input3.equalsIgnoreCase("2")) {

                            System.out.println("Please enter index to add in the list");
                            int index = add.nextInt();           

                                System.out.println("Please enter item to add in the list");
                                String item = last.nextLine();  

                                list.add(index, item);           

                                System.out.println("Please enter index within range of size");


                        } else if (input3.equalsIgnoreCase("3")) {

                            System.out.println("Please enter item to add in the list");
                            String item = last.nextLine();      
                            list.add(item);

                        } else {

                            System.out.println("Please enter valid command");

                        }
                    } else {

                        System.out.println("Please enter first item in the list");
                        String ad = add.next();                 

                        list.add(list.size(), ad);              

                    }


                } else if (command.equalsIgnoreCase("2")) {

                    if (list.size() != 0) {

                        System.out.println("1: Delete Node at front\n2: Delete node at last\n" +
                                "3: Delete node at specific position");
                        String input3 = op.next();

                        if (input3.equalsIgnoreCase("1")) {

                            int index = 0;
                            list.remove(index);

                        } else if (input3.equalsIgnoreCase("2")) {

                            list.remove();

                        } else if (input3.equalsIgnoreCase("3")) {

                            System.out.println("Please enter index to delete item in the list");
                            int index = op.nextInt();

                            list.remove(index);

                        }
                    } else {

                        System.out.println("The list is empty. Can't delete the Node");
                        System.out.println();

                    }
                } else if (command.equalsIgnoreCase("3")) {

                    if (list.size() != 0) {
                        System.out.println("Enter i index to swap");
                        int i = add.nextInt();

                        System.out.println("Enter j index to swap");
                        int j = add.nextInt();

                        if (list.swapNodes(i, j)) {

                            System.out.println("After swapping:");
                            System.out.println(list.toString());

                        } else {

                            System.out.println("Can't swap the two nodes.");
                        }
                    } else {
                        System.out.println("There is no Nodes in the list");
                        System.out.println();
                    }

                } else if (command.equalsIgnoreCase("4")) {

                    if (list.size() != 0) {

                        System.out.println("The List contains: " + list.toString());

                    } else {

                        System.out.println("The list is empty.");

                    }
                } else if (command.equalsIgnoreCase("5")) {

                    if (list.size() != 0) {

                        System.out.println("Enter element to set");
                        String item = set.next();
                        System.out.println("Enter the index to set");
                        int index = op.nextInt();
                        list.set(index, item);

                    } else {

                        System.out.println("The list is empty.");

                    }
                } else if (command.equalsIgnoreCase("6")) {

                    if (list.size() != 0) {

                        System.out.println("Enter element to know index of Node");
                        String item = set.next();
                        System.out.println("The index of the Node is " + list.indexOf(item));

                    } else {

                        System.out.println("The list is empty.");

                    }
                } else if (command.equalsIgnoreCase("7")) {

                    quit = true;

                } else {
                    //If user give invalid command, it displays the message "Please enter valid command"
                    System.out.println("Please enter valid command");
                }
            }catch (IndexOutOfBoundsException io){
                System.out.println(io);
            }
        }
    }
}


/*
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
1
Please enter first item in the list
12
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
1
1: Add Node at front
2: Add node at specified position
3: Add node at last
1
Please enter item to add in the list
23
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
4
The List contains: 23 ==> 12
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
1
1: Add Node at front
2: Add node at specified position
3: Add node at last
2
Please enter index to add in the list
1
Please enter item to add in the list
45
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
4
The List contains: 23 ==> 45 ==> 12
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
1
1: Add Node at front
2: Add node at specified position
3: Add node at last
3
Please enter item to add in the list
67
size4
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
4
The List contains: 23 ==> 45 ==> 12 ==> 67
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
2
1: Delete Node at front
2: Delete node at last
3: Delete node at specific position
1
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
4
The List contains: 45 ==> 12 ==> 67
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
2
1: Delete Node at front
2: Delete node at last
3: Delete node at specific position
2
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
4
The List contains: 45 ==> 12
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
1
1: Add Node at front
2: Add node at specified position
3: Add node at last
1
Please enter item to add in the list
89
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
1
1: Add Node at front
2: Add node at specified position
3: Add node at last
1
Please enter item to add in the list
67
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
2
1: Delete Node at front
2: Delete node at last
3: Delete node at specific position
2
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
4
The List contains: 67 ==> 89 ==> 45
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
2
1: Delete Node at front
2: Delete node at last
3: Delete node at specific position
3
Please enter index to delete item in the list
1
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
4
The List contains: 67 ==> 45
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
1
1: Add Node at front
2: Add node at specified position
3: Add node at last
3
Please enter item to add in the list
34
size3
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
1
1: Add Node at front
2: Add node at specified position
3: Add node at last
78
Please enter valid command
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
4
The List contains: 67 ==> 45 ==> 34
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
3
Enter i index to swap
0
Enter j index to swap
2
After swapping:
34 ==> 45 ==> 67
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
3
Enter i index to swap
1
Enter j index to swap
1
Can't swap the two nodes.
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
4
The List contains: 34 ==> 45 ==> 67
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
5
Enter element to set
56
Enter the index to set
2
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
4
The List contains: 34 ==> 45 ==> 56
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
6
Enter element to know index of Node
45
The index of the Node is 1
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
6
Enter element to know index of Node
56
The index of the Node is 2
Please select operations
1: Add Node
2: Delete Node
3: Swap nodes
4: Display list
5: Update existed Node data
6: Get index of a Node
7: Exit
7

Process finished with exit code 0

 */