package ex_20072024;

import java.util.Scanner;

public class Lab089 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("Can vote");
        } else
            System.out.println("Can't vote");
    }
}
