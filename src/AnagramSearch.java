import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Hashtable;

public class AnagramSearch {
    static final int CHAR = 256;
    static boolean areAnagram(String txt, String pat, int z) {

        int[] count = new int[CHAR];
        for (int i = 0; i < pat.length(); i++) {
            count[txt.charAt(i + z)]++;
            count[pat.charAt(i)]--;
        }
        for (Integer j : count) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isPresent(String txt, String pat) {
        for (int i = 0; i < txt.length() - pat.length(); i++) {
            if (areAnagram(txt, pat, i)) {
                return true;
            }
        }
        return false;
    }
    static boolean efficientSolution(String txt, String pat){
        int[] countText = new int[CHAR];
        int[] countPat = new int[CHAR];

        for(int i=0;i<pat.length();i++){
            countPat[pat.charAt(i)]++;
            countText[txt.charAt(i)]++;
        }
        for( int j = pat.length(); j< txt.length(); j++){
            if(Arrays.equals(countPat,countText)){
                return true;
            }
            countText[txt.charAt(j)]++;
            countText[txt.charAt(j-pat.length())]--;
        }
        return false;
    }
    public static void main(String[] args) {
//        System.out.println(isPresent("geeksforgee", "fao"));
        System.out.println(efficientSolution("geeksforgee", "fro"));
    }


}
