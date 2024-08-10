public class LeftNonRepeated {
    static int returnIndex(String str){
        final int CHAR = 256;
        int[] arre= new int[CHAR];

        int res= -1;
        for (int i = str.length()-1; i > -1; i--) {
            arre[str.charAt(i)]++;
            if (arre[str.charAt(i)] == 1){
                res = i;
            }
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(returnIndex("abcacbducau)"));
    }
}
