public class Searching {
    static int binarySearch(int[] arre , int x) {
        int low=0 , high = arre.length - 1;
        int mid = (low+high)/2;
        while(low<=high){
            mid = (low+high)/2;
            if(arre[mid] == x){
                return mid;
            } else if (x > arre[mid]) {
                low = mid+1;

            } else if (x < arre[mid]) {
                high = mid-1;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int[] inp = {3, 76, 97, 669, 852, 999};

        System.out.println(binarySearch(inp, 999));

    }
}
