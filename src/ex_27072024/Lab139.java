package ex_27072024;

import java.util.Scanner;

public class Lab139 {

    public static void main(String[] args) {

        int[] marks = new int[3];
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = 93;
        marks[2] = 97;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        //System.out.println(marks[10]);


        boolean[] is_married = {true, false,true,false};

        for (int i = 0; i < marks.length; i++) {
            System.out.println(i +" -> "+ marks[i]);
        }

        String shopinglist[] = {"Milk", "Butter", "Bread", "Curd"};
        for (int i = 0; i < shopinglist.length; i++) {
            System.out.println(shopinglist[i]);
        }
    }
}
