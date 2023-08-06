package ArrayPrograms;

public class sortWithoutMethod {

	public static void main(String[] args) {
		int[] arr= {1,6,2,7,4};

		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp=0;
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}
	}
}