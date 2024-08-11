class Mystack {
    int totalSize;
    int currentIndex = 0;
    int[] arre;

    public Mystack(int size) {
        this.totalSize = size;
        this.arre = new int[this.totalSize];
    }

    int size() {
        return this.currentIndex;
    }

    int peek() {
        return this.arre[this.currentIndex - 1];
    }

    void push(int x) {
        if (this.currentIndex < this.totalSize) {
            this.arre[this.currentIndex] = x;
            this.currentIndex++;
        } else {
            System.out.println("Cannot push more into a stack size of " + this.totalSize + ".");
        }
    }

    void pop() {
        if (this.currentIndex != 0) {
            this.arre[this.currentIndex - 1] = 0;
            this.currentIndex--;
        } else {
            System.out.println("Cannot pop out of an empty Stack.");
        }
    }

    boolean isEmpty() {
        return this.currentIndex == 0;
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
