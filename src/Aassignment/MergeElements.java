package Aassignment;

public class MergeElements {
	public static int[] merge(int arr1[], int arr2[]) {
		
		int n1=arr1.length;
		int n2=arr2.length;
		
		int mergeArray[]=new int[n1+n2];
		int i=0,j=0, k=0;
		
		while(i<n1 && j<n2) {
			if(arr1[i]<arr2[j]) {
				mergeArray[k++]=arr1[i++];
			}else {
				mergeArray[k++]=arr2[j++];
			}
		}
		while(i<n1) {
			mergeArray[k++]=arr1[i++];
		}
		while(j<n2) {
			mergeArray[k++]=arr2[i++];
		}
		return mergeArray;
	}
}
