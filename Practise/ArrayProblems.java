package Practise;

public class ArrayProblems {
	
	public static int largestEle(int arr[]) {
		int ans = Integer.MIN_VALUE;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>ans) {
				ans = arr[i];
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr [] = {3,2,7,6};
		System.out.println(largestEle(arr));
	}

}
