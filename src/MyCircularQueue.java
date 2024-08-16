//Leetcode - 622. Design Circular Queue

import java.util.Arrays;

public class MyCircularQueue {
    private int arre[];
    private int front, rear; // Index
    private int capacity;
    private int size = 0;

    public MyCircularQueue(int k) {
        capacity = k;
        arre = new int[capacity];
        Arrays.fill(arre, -1);

    }

    public boolean enQueue(int value) {
        if (size == 0) {
            arre[0] = value;
            front = 0;
            rear = 0;
            size++;
        } else if (size < capacity) {
            if ((front + size) <= capacity - 1) {
                arre[front + size] = value;
                rear = front + size;
            } else if ((front + size) > capacity - 1) {
                arre[Math.abs(capacity - (front + size))] = value;
                rear = Math.abs(capacity - (front + size));
            }
            size++;
        } else {
            return false;
        }

        return true;
    }

    public boolean deQueue() {
        if (size == 0) {
            return false;
        } else if (size > 0) {
            arre[front] = -1;
            if (front == capacity - 1) {
                front = 0;
            } else {
                front += 1;
            }
            size--;
        }
        return true;
    }

    public int Front() {
        return arre[front];

    }

    public int Rear() {
        return arre[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return capacity == size;
    }


}
