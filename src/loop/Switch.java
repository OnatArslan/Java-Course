package loop;

public class Switch {
    public static void main(String[] args) {
        int value = 3;

        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }
        /* This is new switch statement this is come with jdk9 */
        switch (value) {
            case 1 -> {
                System.out.println("Value was 1");
            }
            case 2,3,4,5,6 -> {
                System.out.println("Value was  " + value);
            }default -> System.out.println("Value was not 1 or 2");
        }
    }
}
