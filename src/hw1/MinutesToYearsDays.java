package hw1;

import java.util.Scanner;

public class MinutesToYearsDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");
        long minutes = scanner.nextLong();

        long years = minutes / (60 * 24 * 365);
        long remainingDays = (minutes % (60 * 24 * 365)) / (60 * 24);

        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days.");

        scanner.close();
    }
}
