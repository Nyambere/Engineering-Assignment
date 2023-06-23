/**
 * I had a break point at the calculateAverage function call,
 * Where on running the for-each loop, realized that I needed to cast the result to
 * double before assigning it to average value hence the cast (double), as with it total
 * being an int the fractional part was automatically being dropped.
 * <p>
 * A similar way to handle it would have been to declare total as double to ensure that the result
 * of the division is also a double.
 */
public class AverageCalculator {
    public static double calculateAverage(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        double average = (double) total / numbers.length;
        return average;
    }
    public static void main(String[] args) {
        int[] data = {5, 10, 15, 19, 29};
        double result = calculateAverage(data);
        System.out.println("The average is: " + result);
    }
}
