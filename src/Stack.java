import java.util.LinkedList;

class Mystack<T> {
    int totalSize;
    int currentIndex = 0;
    int top = currentIndex - 1;
    T[] arre;

    public Mystack(int size) {
        this.totalSize = size;
        this.arre = (T[]) new Object[totalSize];

    }

    int size() {
        return currentIndex;
    }

    T peek() {
        return arre[top];
    }

    void push(T x) {
        if (currentIndex < totalSize) {
            arre[currentIndex] = x;
            currentIndex++;
        } else {
            System.out.println("Cannot push more into a stack size of " + totalSize + ".");
        }
    }

    void pop() {
        if (currentIndex != 0) {
            arre[top] = null;
            currentIndex--;
        } else {
            System.out.println("Cannot pop out of an empty Stack.");
        }
    }

    boolean isEmpty() {
        return currentIndex == 0;
    }
}

public class Stack {
    public static void main(String[] args) {
//        Mystack(int size) : to create an object of stack class
//        push(int x) : to push an integer to stack
//        pop() : removes the recent element from the stack
//        size() : returns the size of stack
//        isEmpty() : returns a boolean if the stack is empty or not


    }
}
