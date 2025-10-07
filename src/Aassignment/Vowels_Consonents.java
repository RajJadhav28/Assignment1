package Aassignment;

public class Vowels_Consonents {
	public static void main(String[] args) {
		String s="Raj";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				System.out.println("Vowels:"+s.charAt(i));
			}else if(s.charAt(i)>='a'&& s.charAt(i)<='z'){
				System.out.println("consonents:"+s.charAt(i));
			}
		}
	}
}
