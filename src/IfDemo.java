public class IfDemo {
    public static void main(String[] args) {
        int j = 0;
        if (j < 0) {
            System.out.println("J is less than 0! Resetting,");
            j = 0;
        } else {
            System.out.println("J is positive or 0. Resetting.");
        }
    }
}
