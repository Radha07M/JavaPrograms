package OutputPrograms;

class Temp
{
	Temp()
	{
		this(5);
		System.out.println("The is a constructor");
	}
	Temp(int x)
	{
		this(5, 15);
		System.out.println(x);// ==> 5
	}
	Temp(int x, int y)
	{
		System.out.println(x * y);// ==>75
	}
}
public class Program2 {	 
	public static void main(String[] args) {
		new Temp();
	}
}
