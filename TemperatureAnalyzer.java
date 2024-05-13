import java.util.Scanner;

public class TemperatureAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int numDays = input.nextInt();

        int[] temperatures = new int[numDays];
        for (int i = 0; i < numDays; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temperatures[i] = input.nextInt();
        }

        double averageTemp = calculateAverage(temperatures);
        System.out.printf("The average temperature is: %.2f%n", averageTemp);

        int aboveAverageCount = countDaysAboveAverage(temperatures, averageTemp);
        System.out.println(aboveAverageCount + " days were above average.");
    }

    public static double calculateAverage(int[] array) {
        int total = 0;
        for (int temp : array) {
            total += temp;
        }
        return (double) total / array.length;
    }

    public static int countDaysAboveAverage(int[] array, double average) {
        int count = 0;
        for (int temp : array) {
            if (temp > average) {
                count++;
            }
        }
        return count;
    }
}
