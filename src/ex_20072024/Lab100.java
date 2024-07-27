package ex_20072024;

public class Lab100 {
    public static void main(String[] args) {

        char code = 'A';
        int val = switch (code) {
            case 'A':
                yield 65;
            default:
                throw new IllegalStateException("invalid"+code);
        };
        System.out.println(val);
    }
}
