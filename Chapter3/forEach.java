package Chapter3;

public class forEach {

	public static void main(String[] args) {
		int arr[]  = {1,2,3,4};
		int sum = 1;
		for(int i : arr) {
			sum*=i;
		}
		System.out.println(sum);

	}

}
