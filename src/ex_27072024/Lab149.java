package ex_27072024;

public class Lab149 {

    public static void main(String[] args) {

        int [][] arr_2d = {
                {87,64,32},
                {63,23,78},
                {54,56,87}
        };
        System.out.println(arr_2d.length);
        for (int i = 0 ; i < arr_2d.length; i++) {
            for (int j = 0; j < arr_2d.length; j++) {
                System.out.print(arr_2d[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
