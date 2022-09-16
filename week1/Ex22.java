package week1;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Type the password: ");
            String password = reader.nextLine();
            if (password.equals("carrot")) {
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
        System.out.println("Right!");

        System.out.println("The secret is: jryy qbar!");
    }
}
