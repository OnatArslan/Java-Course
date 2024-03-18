package loop;

import java.util.Scanner;

public class ParseInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(number1 + number2);


        String uuid = "22090809809";
        long intuuid = Long.parseLong(uuid);
        System.out.println(2 + intuuid);
    }
}
