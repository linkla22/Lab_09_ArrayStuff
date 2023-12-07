import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dataPoints = new int[100];

        Random random = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }

        System.out.print("Array values: ");
        for (int value : dataPoints) {
            System.out.printf("%d | ", value);
        }
        System.out.println();

        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }
        double average = (double) sum / dataPoints.length;

        System.out.printf("Sum of dataPoints: %d%n", sum);
        System.out.printf("Average of dataPoints: %.2f%n", average);
        int userValue = SafeInput.getRangedInt(scanner, "Enter a value between 1 and 100: ", 1, 100);

        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue) {
                count++;
            }
        }
        System.out.printf("The value %d was found %d times in the array.%n", userValue, count);
    }
}
