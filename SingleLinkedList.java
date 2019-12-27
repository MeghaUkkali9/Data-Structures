/**
 * \file:   SingleLinkedList.java
 * \brief:  This program implements SingleLinkedList 
 *          Implemented methods:
 *          addFirst(E item)
 *          addAfter(Node<E> node, E item)
 *          removeAfter(Node<E> node)
 *          removeFirst()
 *          removeLast()
 *          toString()
 *          get(int index)
 *          getNode(int index)
 *          set(int index, E anEntry)
 *          indexOf(Object item)
 *          add(int index, E item)
 *          add(E item)
 *          remove(int index)
 *          remove()
 *          swapNodes(int i, int j)
 *          size()
 *
 * \author: Megha Ukkali
 * \date:   10/01/2019
 */



public class SingleLinkedList<E> {
    
    private Node<E> head = null;
    private int size = 0;

    
    private static class Node<E> {
        private E data;
        private Node<E> next;

        private Node(E dataItem) {
            data = dataItem;
            next = null;
        }

        private Node(E dataItem, Node<E> nodeRef) {
            data = dataItem;
            next = nodeRef;
        }
    }

    private void addFirst(E item) {
        Node<E> temp = new Node<E>(item, head);
        head = temp;
        size++;
    }

    private void addAfter(Node<E> node, E item) {
        Node<E> temp = new Node<E>(item, node.next);
        node.next = temp;
        size++;
    }

    private E removeAfter(Node<E> node) {
        Node<E> temp = node.next;
        if (temp != null) {
            node.next = temp.next;
            size--;
            return temp.data;
        } else {
            return null;
        }
    }

    private E removeFirst() {
        Node<E> temp = head;
        if (head != null) {
            head = head.next;
            size--;
            return temp.data;
        } else {
            return null;
        }
    }

    private E removeLast() {
        Node<E> temp = head;
        Node<E> second = head;

        while (temp.next != null) {
            second = temp;
            temp = temp.next;
        }

        second.next = null;
        size--;

        return temp.data;
    }

    public String toString() {
        Node<E> nodeRef = head;

        StringBuilder result = new StringBuilder();

        while (nodeRef != null) {

            result.append(nodeRef.data);

            if (nodeRef.next != null) {

                result.append(" ==> ");

            }

            nodeRef = nodeRef.next;

        }

        return result.toString();
    }

    private Node<E> getNode(int index) {

        Node<E> node = head;

        for (int i = 0; i < index && node != null; i++) {

            node = node.next;

        }

        return node;
    }

    public E get(int index) {

        if (index < 0 || index >= size) {

            throw new IndexOutOfBoundsException(Integer.toString(index));
        }

        Node<E> node = getNode(index);

        return node.data;
    }

    public E set(int index, E anEntry) {

        if (index < 0 || index >= size) {

            throw new IndexOutOfBoundsException(Integer.toString(index));
        }

        Node<E> node = getNode(index);

        E result = node.data;
        node.data = anEntry;
        return result;
    }

    public void add(int index, E item) {

        if (index < 0 || index > size) {

            throw new
                    IndexOutOfBoundsException(Integer.toString(index));
        }

        if (index == 0) {
            addFirst(item);
        } else {

            Node<E> node = getNode(index - 1);
            addAfter(node, item);
        }
    }

    public boolean add(E item) {

        add(size, item);
        return true;
    }

    public boolean remove(int index) {
        if (index < 0 || index > size) {

            throw new
                    IndexOutOfBoundsException(Integer.toString(index));
        }

        if (index == 0) {
            removeFirst();
        } else {
            Node<E> node = getNode(index - 1);
            removeAfter(node);
        }

        return true;
    }

    public boolean remove() {

        if (size == 1) {
            removeFirst();
        } else {
            removeLast();
        }

        return true;
    }

    public int indexOf(Object item) {

        Node<E> node = head;

        for (int i = 0; i < size; i++) {

            if (node.data.equals(item)) {
                return i;
            }
            node = node.next;
        }

        return -1;
    }

    public int size() {

        Node<E> node = head;
        size = 0;

        while (node != null) {

            size++;
            node = node.next;

        }

        return size;
    }

    public boolean swapNodes(int i, int j) {
        if (i < 0 || i > size) {

            throw new
                    IndexOutOfBoundsException(Integer.toString(i));
        }

        if(i == j){

            return false;

        }else if (j < 0 || j > size){

            throw new
                    IndexOutOfBoundsException(Integer.toString(j));

        }else {
            Node<E> temp1 = getNode(i);
            Node<E> temp2 = getNode(j);

            E data1 = temp2.data;
            temp2.data = temp1.data;
            temp1.data = data1;

            return true;
        }
    }
}

