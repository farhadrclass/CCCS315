/*
Write a short Java method that counts the number of vowels in a given character string.
*/

import java.util.Scanner;

public class Lec1 {

    public static void main(String[] args) {
        int total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an string: ");
        String text = input.next();

        
        for (int j=0; j < text.length( ); j++) {
            switch (text.charAt(j)) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
            total += 1;
            }
            }
            

        System.out.println("The number of the vowels is: " + total);

    }
}
