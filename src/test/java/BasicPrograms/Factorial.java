package BasicPrograms;


//input= 1/1! + 2/2! + 3/3! + 4/4! + 5/5!
//Output : 2.70833
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		float fact=1;
		float Sum=0.0f;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			Sum=Sum+(i/fact);
		}
		
		System.out.printf("%.5f",Sum);
	}

}
