package org.lucidant.nov2019;

/**
 * Java looks for local scope so this clash is allowed.
 * Prints "0" (with no line feed), increments the counter, leaves the loop.
 * Outside the loop, the loop scoped "i" is no longer visible so the static i is printed "99".
 */
public class WeirdLoop {
    private static final int i = 99;
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) { // line n1
            System.out.print(i);
            i++; // line n2
            break;
        }
        System.out.print(i);
    }
}
