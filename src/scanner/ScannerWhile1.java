package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력하세요(exit: 종료): ");
            String str = scanner.nextLine();
            break;
        }
        System.out.println("scanner = " + scanner);
    }
}
