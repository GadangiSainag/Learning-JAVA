import static java.util.Arrays.fill;

public class LeftRepeated {
    static int returnIndex(String str) {
        final int CHAR = 256;

        boolean[] arre = new boolean[CHAR];
        fill(arre, false);

        int res = -1;

        for (int i = str.length() - 1; i > -1; i--) {
            if (arre[str.charAt(i)]) {
                res = i;
            } else {
                arre[str.charAt(i)] = true;
            }

        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(returnIndex("abber"));

    }
}
