public class Dp {

    public static int Lis(int[] arre) {
//        Longest Increasing Subsequence
        int[] lisArre = new int[arre.length];
        lisArre[0] = 1;
        for (int i = 0; i < arre.length; i++) {
            lisArre[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arre[j] < arre[i]) {
                    lisArre[i] = Math.max(lisArre[i], lisArre[j] + 1);
                }
            }
        }
        int res = lisArre[0];
        for (Integer p : lisArre) {
            res = Math.max(res, p);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] exampleArre = {356, 56, 903, 424, 664, 880, 514, 892, 184, 820};
        System.out.println(Lis(exampleArre));
    }
}
