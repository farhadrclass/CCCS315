/*
Write a program that consists of three classes, A, B, and C, such thatBextends A and that C extends B. Each class should define an instance variable named “x” 
(that is, each has its own variable named x). Describe a way for a method in C to access and set A’s version of x to a given value, without changing B or C’s version. 
*/

public class A {
    int x = 1;
    public void setIt(int y) { x = y; }
    public int getIt( ) { return x; }
    }

public class B extends A {
   int x = 2;
   public void setIt (int y) { x = y; }
   public int getIt( ) { return x; }
   public void superSetIt (int y) { super.x = y; }
   public int superGetIt( ) { return super.x; }
   }

public class C extends B {
    int x = 3;
    public void setIt (int y) { x = y; }
    public int getIt( ) { return x; }
    public void superSetIt (int y) { super.x = y; }
    public int superGetIt( ) { return super.x; }
    public void superDuperSetIt(int y) { super.superSetIt(y); }
    public int superDuperGetIt( ) { return super.superGetIt( ); }
    public static void main(String[ ] args) {
    C c = new C( );
    System.out.println("C's is " + c.getIt( ));
    System.out.println("B's is " + c.superGetIt( ));
    System.out.println("A's is " + c.superDuperGetIt( ));
    c.superDuperSetIt(4);
    System.out.println("C's is " + c.getIt( ));
    System.out.println("B's is " + c.superGetIt( ));
    System.out.println("A's is " + c.superDuperGetIt( ));
    }
    }
