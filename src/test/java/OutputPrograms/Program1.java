package OutputPrograms;

abstract class A {
    abstract void m1();
 
    void m2()
    {
        System.out.println("This is a m2 method.");
    }
}
class B extends A {
    
    void m1() {}   //Body Required or create one subclass and implement that method
}

public class Program1 {	
    public static void main(String[] args) {
    	B b = new B();
        b.m1();
        b.m2();
        
		String s = "Sachin";     
		s.concat(" Kamath");
		System.out.println(s); //Sachin
	}
}
