public class Counter {
    // to show the differenecr between public/private
    private int count; 
    public int dummy;

    public Counter(){}
    public Counter(int intit){
        count = intit;
        dummy = intit;
    }
    public void test(){
        System.out.println("HELLOOOO");

        //I can call priavte bye() here
        this.bye();
    }

    private void bye(){
        System.out.println("bye");
    }
    //Static vs non-static
    // Class level
    public static void testStatic(){
        System.out.println("Hello static");
       
    }
    //Object level
    public void testNoneStatic(){
        System.out.println("Not static");
    }

}
