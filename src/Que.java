// CUSTOM MADE CLASS QUE
public class Que<T> {
    private T arre[];
    private int capacity;
    private int size;
    private T front, rear;


    public Que(int capacity) {
        this.capacity = capacity;
        this.arre = (T[]) new Object[this.capacity];
        this.size = 0;
    }

    public static void main(String[] args) {

    }

    public void enqueue(T x) {
//        Adds an element to the Queue
        if (size == 0) {
            arre[0] = x;
            front = x;
        } else if (size <= capacity) {
            arre[size] = x;
        } else {
            System.out.println("Out of space.");
        }
        rear = x;
        size++;
    }

    public void dequeue() {
//         removes First element from the Queue
        if (size == 0) {
            System.out.println("There is Nothing to Dequeue");
        } else if (size > 0) {
            arre[0] = null;
            int i = 0;
            while (i < size - 1) {
                arre[i] = arre[i + 1];
                i++;
            }
            arre[size - 1] = null;
            front = arre[0];
        }
        size --;

    }

    public int size() {
// Returns an integer size of Queue
        return size;
    }


    public T getFront() {
//        Returns First element in the Queue
        return front;
    }

    public T getRear() {
//        Reutrns the Last element in the Queue
        return rear;
    }

    public boolean isFull() {
//        Returns true , if all spaces are occupied and vice versa
        return capacity == size;
    }

    public boolean isEmpty() {
//        Returns true of there is no element present in Queue
        return size == 0;
    }

    public void displayAll() {
//         Custom method : Displays all elements of Queue (Built while testing)
        System.out.println("----- ALL -----");
        for (T i : arre) {
            System.out.print(i + " ");
        }
    }
}
