import java.util.*;

public class Pyramid {
    /**
     * Return a string that is a pyramid of size n, made of of asterisks and no spaces.
     *     for example:
     *
     *     size 3:
     *     *
     *     **
     *     ***
     *
     *     size 5:
     *     *
     *     **
     *     ***
     *     ****
     *     *****
     *
     * The newline character can be written as \n .
     * The tests will not be affected by a newline character at the beginning or end of the entire pyramid.
     *
     * Here's a hint: you could use a for loop inside of a for loop for this problem. The outer for loop
     * can determine the current 'row', and the inner for loop can print an asterisk an amount of times based on the
     * current 'row'.
     *
     * @param n the size of the pyramid.
     * @return a string representation of the pyramid.
     */
    public String returnPyramid(int n){
        Scanner in = new Scanner (System.in); int r = 0, i, j; // r - denotes the number of rows System.out.println ("-----To print the half pyramid enter the number of rows-----"); r = in.nextInt (); System.out.print ("n"); for (i = 1; i <= r; ++i) { for (j = 1; j <= i; ++j) System.out.print ("* "); System.out.print ("n"); } } }

    