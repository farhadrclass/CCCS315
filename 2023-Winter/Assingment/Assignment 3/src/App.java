import java.util.Random; // this creates random for our program 

public class App {

    //sample code for methods, create your own
    public static int mySort(int[] arr) {
        // YOUR CODE GOES HERE

        return 0;
    }

    public static void main(String[] args) throws Exception {
        int numItem = 100; // This decide how big you array is
        int[] myArr = new int[numItem];
        Random myRand = new Random(); // creating Random object
        // Range for random to select from
        int min = 5;
        int max = 1000;

        int indexMin = 0;

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = myRand.nextInt(max - min + 1) + min; // storing random integers in an array
        }

        // Now sort it
        double startTime = System.nanoTime();
        // YOURSORTINGMETHOD();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime); // divide by 1000000 to get milliseconds.
        System.out.println("the time it took to sort is " + duration);
    }
}
