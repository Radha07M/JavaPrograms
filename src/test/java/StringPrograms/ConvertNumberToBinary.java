package StringPrograms;

public class ConvertNumberToBinary {
	public void print() {
		try {
			
		}
		finally {
			System.out.println("");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10,count=0;
		
		String strBinary = Integer.toBinaryString(num);
		for(int i=0;i<strBinary.length();i++) {
			if(strBinary.charAt(i)=='1') {
				count++;
			}
		}
		System.out.println("Equivalent Binary String of number: "+num+" is : "+strBinary);
		System.out.println("No of 1s in the binary String is: "+count);
		
		
		
	}
}



