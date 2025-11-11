package Assignment4;

import java.util.HashSet;

class duplicateElement1{
	public HashSet<Integer> duplicate(int arr[]){
		HashSet<Integer> uniqueElements=new HashSet<Integer>();
		HashSet<Integer>duplicateElements=new HashSet<Integer>();
		HashSet<Integer>allElements=new HashSet<Integer>();
		
		int duplicate=0;
		for(int num:arr) {
			if(!allElements.add(num)) {
				duplicateElements.add(num);
				duplicate++;
				uniqueElements.remove(num);
			}else {
				uniqueElements.add(num);
			}
		}
		return duplicateElements;
	}
}
public class Duplicate2 {

}
