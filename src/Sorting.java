public class Sorting {
    static int[] insertionSort(int[] arre) {
        int n = arre.length;
        for (int i = 1; i < n; i++) {
            int key = arre[i];
            int j = i - 1;
            while (j >= 0 && arre[j] > key) {
                arre[j + 1] = arre[j];
                j--;
            }
            arre[j + 1] = key;
        }
        return arre;
    }

    public static void main(String[] args) {


        for (Integer z: insertionSort(new int[]{161, 984, 401, 926, 994})) {
            System.out.println(z);
        }

    }
}