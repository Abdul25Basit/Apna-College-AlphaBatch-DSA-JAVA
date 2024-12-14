import java.util.*;

public class pair_Sum_Optimized {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int target = 5;

        List<Integer> result = pairSum(list, target);
        if (result.isEmpty()) {
            System.out.println("No pair found.");
        } else {
            System.out.println("Pair found: " + result);
        }
    }

    public static List<Integer> pairSum(ArrayList<Integer> list, int target) {
        // Ensure the list is sorted
        Collections.sort(list);

        int leftP = 0;
        int rightP = list.size() - 1;

        while (leftP < rightP) {
            int sum = list.get(leftP) + list.get(rightP);

            if (sum == target) {
                return Arrays.asList(list.get(leftP), list.get(rightP));
            }

            if (sum < target) {
                leftP++;
            } else {
                rightP--;
            }
        }

        return Collections.emptyList(); // No pair found
    }
}
