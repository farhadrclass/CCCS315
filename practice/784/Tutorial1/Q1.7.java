/*
Write a short Java method that takes an integer n and returns the sum of the squares of all positive integers less than or equal to n.
*/

import java.util.Scanner;

public class Lec1 {

    public static void main(String[] args) {
        int total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt( );
       
        for (int j=1; j <= n; j++)
           total = total + j * j;
        
        System.out.println("The sum of the squares is: " + total);

    }
}
