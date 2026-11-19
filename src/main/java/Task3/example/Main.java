package Task3.example;

import java.util.Scanner;

public class Main {

    public static int sumOfDigits(int x) {
        if (x < 10) {
            return x;
        }
        return (x % 10) + sumOfDigits(x / 10);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        System.out.println("Sum of digits: " + sumOfDigits(number));
    }
}
