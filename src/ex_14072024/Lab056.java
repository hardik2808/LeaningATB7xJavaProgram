package ex_14072024;

public class Lab056 {

    public static void main(String[] args) {

        byte b = 10;
        int a = b;
        int a1 = (int)b; // Widning - valid

        System.out.println(a1);

        int val = 300;
        //byte b1 = val; // implicit casting (Nerrowing)
        byte b1 = (byte)val; // Valid

        System.out.println(b1);
    }
}
