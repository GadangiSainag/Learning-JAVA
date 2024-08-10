public class PatternSearch {
    static void naiveSolution(String txt , String pat ){
        for (int i =0 ; i< pat.length(); i++){
            if (txt.charAt(i)== pat.charAt(i)){
                for (int j =i; j< pat.length();j++){
                    if (pat.charAt(j) == txt.charAt(j)){
                        System.out.print(j+ "");
                    }else{
                        break;
                    }
                }
            }
        }

    }
    public static void main(String[] args){
    naiveSolution("abbabbabbba", "abba");
    }
}
