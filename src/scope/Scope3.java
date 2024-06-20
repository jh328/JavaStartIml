package scope;

public class Scope3 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            System.out.println("if temp = " + temp);
        }
        System.out.println("main m = " + m);

    }
}
