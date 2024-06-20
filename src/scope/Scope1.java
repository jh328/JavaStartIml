package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10;
        if (true) {
            int x = 20;
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // int x 는 이제 사용 불가
        System.out.println("main m  = " + m);
        // System.out.println("x = " + x); x 사망 해서 사용 불가능.
    }
}


