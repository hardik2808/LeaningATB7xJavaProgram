package ex_20072024;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        // Take user input number and check number is odd or even

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int user_input = sc.nextInt();
        System.out.println("Entered Number: " + user_input);

        if (user_input%2 == 0) {
            System.out.println("Even");
        } else  {
            System.out.println("Odd");
        }
    }
}
