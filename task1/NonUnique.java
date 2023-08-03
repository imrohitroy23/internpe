import java.util.HashMap;

public class NonUnique {
    public static int findNonUniqueDuplicate(int[] nums) {
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        for (int num : nums) {
            frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (frequencies.get(num) > 1) {
                return num; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 3};
        int nonUniqueDuplicate = findNonUniqueDuplicate(nums);
        System.out.println("Non-Unique Duplicate: " + nonUniqueDuplicate); 
    }
}
