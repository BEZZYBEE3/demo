import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true; // Duplicate found
            }
            seen.add(num);
        }

        return false; // All elements are distinct
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        boolean result = containsDuplicate(nums);
        System.out.println("Contains duplicate: " + result);
    }
}
