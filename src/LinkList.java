// CUSTOM LINKED LIST

import java.util.NoSuchElementException;

public class LinkList<T> {
    private int size;
    private Node<T> head;


    void add(T x) {
        if (head == null) {
            head = new Node<T>(x);
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<T>(x);
        }
        size++;
    }

    int size() {
        return size;
    }

    T peek() {
        if (head != null) {
            return head.getData();
        } else {
            throw new NoSuchElementException("Empty LinkList");
        }
    }

    T getFirst() {
        return peek();
    }

    T getLast() {
        if (head == null) {
            throw new NoSuchElementException("Empty LinkList");
        }
        Node<T> currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    T get(int index) {
        Node<T> currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    void addFirst(T x) {
        if (head == null) {
            head = new Node<T>(x);
        } else {
            Node<T> newNode = new Node<>(x);
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    boolean isEmpty() {
        return head == null;
    }

    void clear() {
        head.next = null;
        size = 0;
    }

    boolean remove(T data) {
        if (head == null) {
            return false;

        }
        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return true;
        }
        Node<T> currentNode = head;
        while (currentNode.next != null && !currentNode.next.data.equals(data)) {
            currentNode = currentNode.next;
        }

        if (currentNode.next != null) {
            currentNode.next = currentNode.next.next;
            size--;
            return true;
        }
        return false;

    }

    void displayAll() {
        Node<T> currentnode = head;
        System.out.println("----- ALL DATA IN LINKLIST -----");
        while (currentnode != null) {
            System.out.println(currentnode.data);
            currentnode = currentnode.next;
        }
    }

    private static class Node<T> {
        T data;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        T getData() {
            return data;
        }
    }


}
