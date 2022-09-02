public class App {
    /**
     * What is does?
     * Inputs:
     * 
     * @param args
     *             Return
     */
    public static void main(String[] args) {
        Counter myCounter = new Counter(10);
        System.out.println("Hello, World!");
        System.out.println(myCounter.dummy);
        myCounter.test();
        // myCounter.bye();//since it is private it doesn't exits

        //For non-static you need the 
        myCounter.testNoneStatic();
        //For static-- Class level
        Counter.testStatic();

    }
}
// TODO test