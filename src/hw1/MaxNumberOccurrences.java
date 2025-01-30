package hw1;

import java.util.Scanner;

public class MaxNumberOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int count = 0;

        System.out.print("Enter numbers: ");
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) break;

            if (num > max) {
                max = num;
                count = 1;
            } else if (num == max) {
                count++;
            }
        }

        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);

        scanner.close();
    }
}
