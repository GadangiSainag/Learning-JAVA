public class MinHeap {
    int[] arre;
    int capacity;
    int size;

    MinHeap(int capacity) {
        this.capacity = capacity;
        size = 0;
        arre = new int[this.capacity];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            double randi = Math.random();
            System.out.println(randi + "\t" + (int) Math.ceil(  randi * 10000));
        }


    }

    int left(int index) {
        return (2 * index) + 1;
    }

    int right(int index) {
        return (2 * index) + 2;
    }

    int parent(int index) {
        return (index - 1) / 2;
    }

}
