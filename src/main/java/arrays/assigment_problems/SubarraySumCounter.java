public class SubarraySumCounter {
    public static int count(int[] nums, int target) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == target) total++;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(count(new int[]{1, 1, 1}, 2));
        System.out.println(count(new int[]{1, -1, 0}, 0));
    }
}
