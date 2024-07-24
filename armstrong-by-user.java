import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int originalnumber = number;
        int remainder;
        int result = 0;

        while (originalnumber != 0) {
            remainder = originalnumber % 10;
            result += Math.pow(remainder, 3);
            originalnumber /= 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number");
        else
            System.out.println(number + " is not an Armstrong number");
        
        scanner.close();
    }
}