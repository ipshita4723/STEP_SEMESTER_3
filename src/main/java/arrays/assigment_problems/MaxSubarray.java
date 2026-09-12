public class MaxSubarray {
    public static int calculate(int[] values) {
        int best = values[0];
        int current = values[0];
        for (int i = 1; i < values.length; i++) {
            current = Math.max(values[i], current + values[i]);
            best = Math.max(best, current);
        }
        return best;
    }
    public static void main(String[] args) {
        System.out.println(calculate(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(calculate(new int[]{-3, -1, -2}));
    }
}
