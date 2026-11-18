package Task1.example;

import java.util.Scanner;
public class Main {
    public static int calculateArea(int length, int width) {
        return length * width;
    }
    public static double calculateArea(double length, double width) {
        return length * width;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer length: ");
        int intLength = scanner.nextInt();
        System.out.print("Enter integer width: ");
        int intWidth = scanner.nextInt();
        System.out.println("Integer area: " +
                calculateArea(intLength, intWidth));
        System.out.print("Enter double length: ");
        double doubleLength = scanner.nextDouble();
        System.out.print("Enter double width: ");
        double doubleWidth = scanner.nextDouble();
        System.out.println("Double area: " +
                calculateArea(doubleLength, doubleWidth));
        scanner.close();
    }
}
