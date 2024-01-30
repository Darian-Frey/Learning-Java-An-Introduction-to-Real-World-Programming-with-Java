import java.util.ArrayList;

public class ForDemo {
    public static void main(String[] args) {
        /*
        for (int i = 0; i < 100; i++) {
            System.out.println(" Int i + " + i);
            int j = i;
            System.out.println("Int j = " + j);
        }

        for (int x = 0, y = 10; x < y; x++, y--) {
            System.out.println(x + "," + y);
            //do something cool with (x, y).
        }
        */

        int [] arrayOfInts = new int [] {1, 2, 3, 4 };
        int total = 0;

        for (int i : arrayOfInts) {
            System.out.println(i);
            total = total + i;
        }
        System.out.println("Total: " + total);

        // arrayList is a popular collection class
        ArrayList<String> list = new ArrayList<String>();
        list.add("foo");
        list.add("bar");

        for (String s : list)
            System.out.println(s);
    }
}
