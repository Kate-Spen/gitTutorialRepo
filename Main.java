public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int length = numbers.length;
        System.out.println("The average is: " +
                average(numbers));
    }

    public static double average(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            double average = sum / length;
            return average;
        }
    }
}