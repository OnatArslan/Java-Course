package loop;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println(PrimeCheck(2));

    }

    public static boolean PrimeCheck(int number) {
        boolean isPrime = true;
        if (number == 1 || number == 0) {
            isPrime = false;
        }else{
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        }
        return isPrime;

    }
}
