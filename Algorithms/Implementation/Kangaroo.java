/**
 * There are two kangaroos on an x-axis ready to jump in the positive direction (i.e, toward positive infinity). The first kangaroo starts at location  and moves at a rate of  meters per jump. The second kangaroo starts at location  and moves at a rate of  meters per jump. Given the starting locations and movement rates for each kangaroo, can you determine if they'll ever land at the same location at the same time?

Input Format

A single line of four space-separated integers denoting the respective values of , , , and .

Constraints

Output Format

Print YES if they can land on the same location at the same time; otherwise, print NO.

Note: The two kangaroos must land at the same location after making the same number of jumps.

Sample Input 0

0 3 4 2
Sample Output 0

YES
Explanation 0

The two kangaroos jump through the following sequence of locations:

Thus, the kangaroos meet after  jumps and we print YES.

Sample Input 1

0 2 5 3
Sample Output 1

NO
Explanation 1

The second kangaroo has a starting location that is ahead (further to the right) of the first kangaroo's starting location (i.e., ). Because the second kangaroo moves at a faster rate (meaning ) and is already ahead of the first kangaroo, the first kangaroo will never be able to catch up. Thus, we print NO.
 */


 import java.io.*;
 import java.util.*;
 import java.text.*;
 import java.math.*;
 import java.util.regex.*;

 public class Solution {

     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int x1 = in.nextInt();
         int v1 = in.nextInt();
         int x2 = in.nextInt();
         int v2 = in.nextInt();
         int n=0;


         if(v2>v1){
             System.out.print("NO");
             System.exit(0);
         }

    //Not the best way, help me improve this
     while(n<5000){
         if(x1+(n-1)*v1==x2+(n-1)*v2){
             System.out.print("YES");
              System.exit(0);
         }
         n++;
       }

         System.out.print("NO");
     }
 }
