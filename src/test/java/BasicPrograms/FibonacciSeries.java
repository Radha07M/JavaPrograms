package BasicPrograms;


/* Output - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
 * next number is the sum of previous two numbers
 */
public class FibonacciSeries {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		System.out.print("Fibonacci Series: "+n1+", "+n2);
		
		for(int i=0; i <= 10; i++) {
			n3 = n1 + n2;
			System.out.print(", "+n3);
			n1=n2;
			n2=n3;
		}
	}
}
