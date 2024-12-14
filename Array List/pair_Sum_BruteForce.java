import java.util.*;

public class pair_Sum_Optimized {

    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;

        pairSumOptimized(list, target); // Optimized approach
        pairSumBruteForce(list, target); // Brute force approach
    }

    // Brute Force Approach: O(n^2)
    public static void pairSumBruteForce(ArrayList<Integer> list, int target) {
        System.out.println("Brute Force Approach:");
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    System.out.println("Pair: " + list.get(i) + ", " + list.get(j));
                }
            }
        }
    }

    // Optimized Approach: O(n)
    public static void pairSumOptimized(ArrayList<Integer> list, int target) {
        System.out.println("Optim
