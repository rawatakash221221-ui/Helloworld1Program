package Exercise_003;

public class Logical_Operators {
    public static void main(String[] args) {
        boolean x = true, y = false;

        System.out.println("x && y: " + (x && y)); // AND
        System.out.println("x || y: " + (x || y)); // OR
        System.out.println("!x: " + (!x));         // NOT
        System.out.println("y && Y:" + (y && y)); // false output
        System.out.println("!y: " +(!y)); // answer will be true
    }
}
