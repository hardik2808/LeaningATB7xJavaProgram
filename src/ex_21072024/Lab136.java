package ex_21072024;

public class Lab136 {
    public static void main(String[] args) {

        funcation_type1();
        String name = funcation_type2();
        System.out.println(name);
        funcation_type3("Hardik");
    }
        static void funcation_type1() {
            System.out.println("Without parameters without return");
        }
        static String funcation_type2() {
            System.out.println("Without parameters with return");
            return "Hardik";
        }
        static void funcation_type3(String name) {
            System.out.println("with parameter without return");
        }

        // 4. With Parameters and With Return Type
        static int function_type4(int a,int b){
            System.out.println("4. With Parameters and With Return Type");
            return a+b;
        }

}
