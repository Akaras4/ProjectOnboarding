/*Problem statement
Given an alphanumeric string made up of digits and lower case Latin characters only, find the sum of all the digit characters in the string.

Input
The first line of the input contains an integer T denoting the number of test cases. Then T test cases follow.
Each test case is described with a single line containing a string S, the alphanumeric string.
Output
For each test case, output a single line containing the sum of all the digit characters in that string.
Constraints

Example
Input:
1
ab1231da
Output:
7

Explanation
The digits in this string are 1, 2, 3 and 1. Hence, the sum of all of them is 7.
*/

package digitChallenge;


public class digitSums {
	
	public static void digits(int n, String[] input) {
        int c = 0;
        while(c < n){
            String word = input[c];
            int tot = 0;
            for (char ch: word.toCharArray()) {
                try{
                    String val = Character.toString(ch);
                    tot = tot + Integer.parseInt(val);
                }
                catch(Exception e){
                }
            }
            System.out.println(tot);
            c++;
        }
    }

    public static void main(String[] args) {
        String [] input = {"abc123abc", "2ways2skin3cats", "ab1231da"};
        System.out.println("INPUT");
        System.out.println("3");
        System.out.println("abc123abc");
        System.out.println("2ways2skin3cats");
        System.out.println("ab1231da\n");
        System.out.println("OUTPUT");
        digits(3, input);
    }

}