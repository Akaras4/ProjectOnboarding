package tripletChallenge;

/* 
Write a program that accepts sets of three numbers, and prints the second-maximum number among the three.
Input
First line contains the number of triples, N.
The next N lines which follow each have three space separated integers.
Output
For each of the N triples, output one new line which contains the second-maximum integer among the three.
Constraints

The three integers in a single triplet are all distinct. That is, no two of them are equal.
Sample Input
3
1 2 3
10 15 5
100 999 500
Sample Output
2
10
500
*/

public class triplet {
	
	public static void triples(int n, int[][] input) {
        int c = 0;
        while(c < n){
            int x = input[c][0];
            int y = input[c][1];
            int z = input[c][2];
            if(x > y && x < z){
                System.out.println(x);
            }
            if(x > z && x < y){
                System.out.println(x);
            }
            if(y > x && y < z){
                System.out.println(y);
            }
            if(y > z && y < x){
                System.out.println(y);
            }
            if(z > x && z < y){
                System.out.println(z);
            }
            if(z > y && z < x){
                System.out.println(z);
            }
            if(x == y && x == z){
                System.out.println(x);
            }
            c++;
        }
    }

    public static void main(String[] args) {
        int[][] input = {{1, 2, 3}, {10, 15, 5}, {100, 999, 500}};
        System.out.println("INPUT");
        System.out.println("3");
        System.out.println("1 2 3");
        System.out.println("10 15 5");
        System.out.println("100 999 500\n");
        System.out.println("OUTPUT");
        triples(3, input);
    }

}
