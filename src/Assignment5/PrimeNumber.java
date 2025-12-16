package Assignment5;

public class PrimeNumber {
	int flag=0;
	public void primeNumber(int num) {
		if(num==0 || num==1) {
			System.out.println("not a prime number");
		}else {
			for(int i=2;i<Math.sqrt(num);i++) {
				if(num%i==0) {
					System.out.println("Not a prime number");
					flag=1;
					break;
				}
			}
		}
		if(flag==0) {
			System.out.println("Prime number");
		}
	}
}
