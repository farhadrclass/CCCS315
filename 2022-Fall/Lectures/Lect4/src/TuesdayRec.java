public class TuesdayRec{

    public static void main(String[] args){
        //N! = n*(n-1)*.....*1
        int n = 6; 
        int resultLoop = 0;
        long startTime = System.nanoTime(); // Help me to take the time
        resultLoop = fLoop(n); // not the best naming but need to differentiate between loop/ recurcion
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);// divide by 1000000 to get milliseconds.
        System.out.println("For n =  "+n+" After a loop " + resultLoop+ " And the time it took: " + (duration) + " nano-sec");
       
        // FROM HERE WE DO RECURSION
        int resultRec = 0;
        long startTimeRec = System.nanoTime(); // Help me to take the time
        resultRec  = fRec(n);
        long endTimeRec = System.nanoTime();
        long durationRec = (endTimeRec - startTimeRec);// divide by 1000000 to get milliseconds.

        System.out.println("For n =  "+n+" After a Recursive " + resultRec + " And the time it took: " + (durationRec) + " nano-sec");

    }

/**
     * Do the factorial in recursive way
     * 
     * @param n
     * @return
     */
    //Way one
    // public static int fRec(int n) {
    //     if(n<=0){
    //         return 1;
    //     }

    //     return n*fRec(n-1);
    // }

    //way 2 
    public static int fRec(int n) {
        System.out.println("I put the print here  "+n);
        if(n<=0){
            return 1;
        }
        int mySum = n*fRec(n-1);
        System.out.println("I put the print After thec call  "+n);        
        return mySum;
    }


    /**
     * Takes an int and calculate the factorial , in a loop
     * @param n
     * @return int the results
     */
    public static int fLoop(int n) {
        int mySum = 1;
        for (int i = n; i >= 0; i--) {
            if (i == 0){ // I need this case for when n=0 , then the n! is accaptable and eqaul to 1 
                mySum = mySum * 1;
            }
            else{
                mySum = i* mySum;
            }
        }
        return mySum;
    }
}