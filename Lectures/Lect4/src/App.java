public class App {

    public static void main(String[] args) throws Exception {
        //
        int n = 6;

        int resultLoop = 0;

        long startTime = System.nanoTime(); // Help me to take the time
        resultLoop = f_loop(n);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);// divide by 1000000 to get milliseconds.

        System.out.println("After a loop " + resultLoop + " And the time it took: " + (duration) + " nano-sec");

        // FROM HERE WE DO RECURSION

        int resultRec = 0;

        long startTimeRec = System.nanoTime(); // Help me to take the time
        resultRec = f_Rec(n);
        long endTimeRec = System.nanoTime();
        long durationRec = (endTimeRec - startTimeRec);// divide by 1000000 to get milliseconds.

        System.out.println("After a Recursive " + resultRec + " And the time it took: " + (durationRec) + " nano-sec");

    }

    /**
     * Do the factorial in recursive way
     * 
     * @param n
     * @return
     */
    // public static int f_Rec(int n) {
    //     System.out.println("I put the print here  "+n);
    //     if (n <= 0){
    //         return 1;
    //     }
    //     return n*f_Rec(n-1);
    // }

    public static int f_Rec(int n) {
        System.out.println("I put the print here  "+n);
        if (n <= 0){
            return 1;
        }
        int myReturn = f_Rec(n-1); //This is for student to understand how the f_Rec call are done
        System.out.println("I put the print After thec call  "+n);

        return n*myReturn;
    }

    /**
     * Factorial throgh loops, we assume n is positive
     * 
     * @param n
     * @return
     */
    public static int f_loop(int n) {
        int mySum = 1;
        // if (n <= 0){
        // return 1;
        // }
        //Way 1
        // for (int i = 0; i <= n; i++) {
        //     // System.out.println(i+"--"+n+"----"+mySum);
        //     if (i == 0) {
        //         mySum = 1;
        //     } else {
        //         mySum = i * mySum;
        //     }
        // }

        // Way 2
        for (int i = n; i >= 0; i--) {
            // System.out.println(i+"--"+n+"----"+mySum);
            if (i == 0) {
                mySum = 1*mySum;
            } else {
                mySum = i * mySum;
            }
        }

        return mySum;

    }
}
