import java.util.*;

public class pair_sum_rotated_list {

    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(pairSum(list, target));

    }

    public static boolean pairSum(ArrayList<Integer> list, int target) {

        int n = list.size();

        // Finding the breakpoint (index of the smallest element)
        int BP = -1;
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                BP = i;
                break;
            }
        }
        
        // If no rotation (array is sorted), set BP to -1
        if (BP == -1) {
            BP = n - 1;
        }

        int leftP = (BP + 1) % n; // First element after rotation
        int rightP = BP;          // Last element before rotation

        // Now start looking for the pair
        while (leftP != rightP) {
            int currentSum = list.get(leftP) + list.get(rightP);

            if (currentSum == target) {
                System.out.println("Pair found: " + list.get(leftP) + ", " + list.get(rightP));
                return true;
            }

            if (currentSum < target) {
                // Move the left pointer to the right
                leftP = (leftP + 1) % n;
            } else {
                // Move the right pointer to the left
                rightP = (n + rightP - 1) % n;
            }
        }

        System.out.println("No pair found.");
        return false;
    }
}
