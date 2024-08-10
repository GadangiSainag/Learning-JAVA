import java.util.ArrayList;
import java.util.Arrays;

public class LexicographicRank {
// ONLY VALID IF CHARACTERISTICS DOES NOT REPEAT
    static int factorialOF(int x) {
        int res = 1;
        for (int z = 1; z <= x; z++) {
            res *= z;
        }
        return res;
    }

    static int getRank(String str) {
        int rank = 0;
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        ArrayList<Character> charList = new ArrayList<>();
        for (char c : charArray) {
            charList.add(c);
        }
        int factorial = factorialOF(str.length());
        for (int i = 0; i < str.length(); i++) {
            int n = charList.indexOf(str.charAt(i));
            int x = str.length() - 1 - i;
            factorial/=(x+1);
            rank += n * factorial;
            charList.remove((Character) str.charAt(i));
        }

        return rank + 1;
    }

    public static void main(String[] args) {

//        System.out.println(getRank("SUCCESS"));

    }

}
