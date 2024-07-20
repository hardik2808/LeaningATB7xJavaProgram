package ex_20072024;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mark: ");
        int score = sc.nextInt();
        char grade = 'F';
        if (score >= 90 && score <=100) {
            grade = 'A';
        } else if (score >= 80 && score <=89) {
            grade = 'B';
        } else if (score >= 70 && score <=79) {
            grade = 'C';
        } else if (score >= 60 && score <=60) {
            grade = 'A';
        } else if (score <= 0 || score > 100) {
            grade = 'O';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = "+grade);
        sc.close();
    }
}
