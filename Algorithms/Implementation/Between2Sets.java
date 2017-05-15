/**
 * Consider two sets of positive integers,  and . We say that a positive integer, , is between sets  and  if the following conditions are satisfied:
https://www.hackerrank.com/challenges/between-two-sets
All elements in  are factors of .
 is a factor of all elements in .
In other words, some  is between  and  if that value of  satisfies  for every  in  and also satisfies  for every  in . For example, if  and , then our possible  values are ,  and .

Given  and , find and print the number of integers (i.e., possible 's) that are between the two sets.

Input Format

The first line contains two space-separated integers describing the respective values of  (the number of elements in set ) and  (the number of elements in set ).
The second line contains  distinct space-separated integers describing .
The third line contains  distinct space-separated integers describing .

Constraints

Output Format

Print the number of integers that are considered to be between  and .

Sample Input

2 3
2 4
16 32 96
Sample Output

3
Explanation

There are three  values between  and :

:
All the elements in  evenly divide .
 evenly divides all the elements in .
:
All the elements in  evenly divide .
 evenly divides all the elements in .
:
All the elements in  evenly divide .
 evenly divides all the elements in .
Thus, we print  as our answer.
 */
 import java.io.*;
 import java.util.*;
 import java.text.*;
 import java.math.*;
 import java.util.regex.*;

 public class Solution {

  public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int m = in.nextInt();
         int[] a = new int[n];
         for(int a_i=0; a_i < n; a_i++){
             a[a_i] = in.nextInt();
         }
         int[] b = new int[m];
         for(int b_i=0; b_i < m; b_i++){
             b[b_i] = in.nextInt();
         }

         int lcm = lcm(a);
         int gcd = gcd(b);
         int count = 0;
         for(int i = lcm; i<=gcd; i++){
             if(gcd % i==0){ count++;}
         }
         System.out.println(count);
     }


     private static int gcd(int a, int b) {
         while (b > 0) {
             int temp = b;
             b = a % b;
             a = temp;
         }
         return a;
     }

     private static int gcd(int[] input) {
         int result = input[0];
         for (int i = 1; i < input.length; i++) {
             result = gcd(result, input[i]);
         }
         return result;
     }

     private static int lcm(int a, int b) {
         return a * (b / gcd(a, b));
     }

     private static int lcm(int[] input) {
         int result = input[0];
         for (int i = 1; i < input.length; i++) {
             result = lcm(result, input[i]);
         }
         return result;
     }
 }
