public class SwitchDemo {
    public static void main(String[] args) {
        int value = 2;

        switch(value) {
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
        }
        // prints both one and two.

        String value2 = "GOOD";

        switch(value2) {
            case "GOOD":
                System.out.println("Good");
                break;
            case "BAD":
                System.out.println("Bad");
                break;
            default:
                System.out.println("Not sure?");
        }

        String value3 = "MINISCULE";
        String size = "Unknown";

        switch (value3) {
            case "MINISCULE", "TEENYWEENY", "SMALL" -> size = "Small";
            case "MEDIUM" -> size = "Medium";
            case "LARGE", "EXTRALARGE" -> size = "Large";
        }
        System.out.println("Your size is " + size);
    }
}
