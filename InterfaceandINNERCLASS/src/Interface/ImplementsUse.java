package Interface;

class One {
    public void m1() {
        System.out.println("m1 is here");
    }
}

interface Itwo {
    void m2();
}

class Demo extends One implements Itwo {
   public   void m2() {
        System.out.println("Rahul");
        // No need to create a new instance of Demo here
        // Just call m1() directly
        
    }
}

public class ImplementsUse {
    public static void main(String args[]) {
        Demo d1 = new Demo();
        // Corrected method call syntax
        d1.m1();
        d1.m2();
    }
}
