package Assignment4;

public class MergeArray2 {
	public static int[] merge(int arr1[], int arr2[]) {
		int n1=arr1.length;
		int n2=arr2.length;
		int mergedArray[]=new int[n1+n2];
		
		int i=0, j=0, k=0;
		while(i<n1 && j<n2) {
			if(arr1[i]<arr2[j]) {
				mergedArray[k++]=arr1[i++];
			}else {
				mergedArray[k++]=arr2[j++];
			}
		}
		return mergedArray;
		
	}
}
