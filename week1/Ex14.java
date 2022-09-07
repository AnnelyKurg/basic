package week1;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = in.nextInt();
         if (number > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is not positive");
        }
    }
}
