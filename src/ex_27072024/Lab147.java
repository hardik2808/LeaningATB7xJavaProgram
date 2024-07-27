package ex_27072024;

import java.util.Arrays;

public class Lab147 {

    public static void main(String[] args) {

        // Find max in array

        int [] salaries = {7, 67, 4, 35, 67, 89, 34};

        int max = 1;
        int min = salaries[0];

        for ( int i = 0; i < salaries.length; i++) {

            if (max < salaries[i]) {
                max  = salaries[i];
            }
            if ( min > salaries[i]) {
                min = salaries[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        Arrays.sort(salaries);
        System.out.println(salaries[salaries.length-1]);
        System.out.println(salaries[0]);
    }
}
