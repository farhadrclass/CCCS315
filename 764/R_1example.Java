/*
Write a program that selects the largest number between three integers
*/

class practice764 {
    public static void main(String[] args) {
  
      Double x = -1.0, y = 4.5, z = -5.3, largest;
  
      if (x >= y) {

        if (x >= z) {
          largest = x;
        }
  
        else {
          largest = z;
        }
      } else {

        if (y >= z) {
          largest = y;
        }
  
        else {
          largest = z;
        }
      }
  
      System.out.println("Largest Number: " + largest);
    }
  }
