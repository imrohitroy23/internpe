import java.util.HashSet;

public class singleDuplicate {
    public static int findSingleDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 3};
        int duplicate = findSingleDuplicate(nums);
        System.out.println("Single Duplicate: " + duplicate); 
    }
}
