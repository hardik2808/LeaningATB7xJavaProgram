package Practice;

public class SecondLargest {

    public static void main(String[] args) {

        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        int max = 0;
        int smax = 0;
        for (int i = 1; i < salaries.length; i++) {

            if(salaries[i] > max) {
                smax = max;
                max = salaries[i];
            } else if (salaries[i] > smax && salaries[i] != max) {
                smax = salaries[i];
            }
        }
        System.out.println(smax);
    }
}
