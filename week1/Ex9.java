package week1;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int anotherNumber = Integer.parseInt(reader.nextLine());

        System.out.println("Division " + (double)number/anotherNumber);
    }
}
