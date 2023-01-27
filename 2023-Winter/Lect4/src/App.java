public class App {
    public static void main(String[] args) throws Exception {

        int n = 6;
        int resultLoop = 0;
        long startTime = System.nanoTime(); // Help me to take the time
        resultLoop = fLoop(n); // not the best naming but need to differentiate between loop/ recurcion
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);// divide by 1000000 to get milliseconds.
        System.out.println("For n =  " + n + " After a loop " + resultLoop + " And the time it took: " + (duration) + " nano-sec");



        // // FROM HERE WE DO RECURSION
        int resultRec = 0;
        long startTimeRec = System.nanoTime(); // Help me to take the time
        resultRec = fRec(n);
        long endTimeRec = System.nanoTime();
        long durationRec = (endTimeRec - startTimeRec);// divide by 1000000 to get         milliseconds.

        System.out.println("For n = "+n+" After a Recursive " + resultRec + " And the time it took: " + (durationRec) + " nano-sec");
    }

    /**
     * Calculate Factorial (Recursivly)
     * @param n
     * @return int 
     */
    public static int fRec(int n) {
       
        System.out.println("+++++++++ I put the print Before the rec  call  "+n); 
        if(n==0){
            return 1;
        }
        int myReturn =n*fRec(n-1); //I didn't need to define a variable, only to show what happens
    
        System.out.println("-------- I put the print After the rec call  "+n); 
        return myReturn;       

    }

    /**
     * Calculate Factrial in loop form, 0!=1
     * 
     * @param n
     * @return
     */
    public static int fLoop(int n) {
        int myRes = 1;
        for (int i = n; i >= 0; i--) {
            if (i == 0) { // I need this case for when n=0 , then the n! is accaptable and eqaul to 1
                myRes = myRes * 1;
            } else {
                myRes = myRes * i;
            }
        }
        return myRes;
    }

}


