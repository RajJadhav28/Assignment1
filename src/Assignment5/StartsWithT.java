package Assignment5;

public class StartsWithT {
	public static void main(String[] args) {
		String arr[]= {"Mango","Grapes","Pineapple","Orange","Guava"};
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			String s1=arr[i];
			if(s1.charAt(0)=='T') {
				System.out.println("found at position:"+(i+1));
				found=true;
			}
		}
		if(found==false) {
			System.out.println("No element found");
		}
	}
}
