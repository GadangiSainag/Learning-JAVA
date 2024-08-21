import java.util.*;

public class ActualPlayGround {
    public static void main(String[] args) {

//        int[] nums1 = {1, 2, 3, 0, 0, 0};
//        int m = 3;
//        int[] nums2 = {2, 5, 6};
//        int n = 3;
//        int[] res;
//        res = merge(nums1, m, nums2, n);
//        for (Integer i : res) {
//
//            System.out.print(i + " ");
//        }
        String s= "fsdfgs";


        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    public static int lengthOfLastWord(String s) {
        int len = 0;
        int n = s.length();

        while (n >= 1) {

            if (s.charAt(n - 1) != 32 || len != 0) {
                if (s.charAt(n - 1) == 32) {
                    return len;
                } else {
                    len++;
                }
            }
            n--;

        }
        return len;
    }

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        Hashtable<Integer, Integer> myMap = new Hashtable<>();

        for( Integer i : nums){
            myMap.put(i, myMap.getOrDefault(i, 1)+1);
        }

        int maxInt=nums[0];

        for(Map.Entry<Integer, Integer> k : myMap.entrySet()){
            if (k.getValue() > myMap.get(maxInt)){
                maxInt = k.getKey();
            }
        }
        if (myMap.get(maxInt) > n/2) {
            return maxInt;
        }
        throw new NoSuchElementException("No element");
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int b = n - 1, a = m - 1;
        while (b >= 0) {
            if (nums2[b] > nums1[a]) {
                nums1[m + n - 1] = nums2[b];
                b--;
                a--;
            }
        }

        return nums1;
    }

    public static int distributeCandies(int[] candyType) {
        int n = candyType.length;
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : candyType) {
            set.add(i);
        }
        if (set.size() <= n / 2) {
            return set.size();
        }
        return 1;
    }

    public static boolean lemonadeChange(int[] bills) {
        if (bills[0] != 5) {
            return false;
        }
        int d5 = 0, d10 = 0, d20 = 0, total = 0;
        for (Integer i : bills) {
            if (i == 5) {
                d5++;
            } else if (i == 10) {
                if (d5 >= 1) {
                    d5--;
                    d10++;
                } else {
                    return false;
                }
            } else if (i == 20) {
                if (d5 >= 1 && d10 >= 1) {
                    d5--;
                    d10--;
                } else if (d5 >= 3 && d10 == 0) {
                    d5 -= 3;
                } else {
                    return false;
                }
            }
            total += 5;
        }
        return true;
    }


}
