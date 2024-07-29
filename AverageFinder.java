import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of numbers:");
        int numNumbers = scanner.nextInt();

        double sum = 0;
        for (int i = 0; i < numNumbers; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            double num = scanner.nextDouble();
            sum += num;
        }

        double average = sum / numNumbers;
        System.out.println("The average is: " + average);
    }
}
