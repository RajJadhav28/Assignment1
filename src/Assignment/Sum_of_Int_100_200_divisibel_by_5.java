package Assignment;

public class Sum_of_Int_100_200_divisibel_by_5 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=100;i<=200;i++) {
			if(i%2==0) {
				sum=sum+i;	
			}
		}
		System.out.println(sum);

	}

}
