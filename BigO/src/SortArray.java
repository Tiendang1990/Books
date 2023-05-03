import java.util.Arrays;

public class SortArray {
	public static void main (String[] args) {
		int[] array = {1,2,3,5,1,3,2,6,7};
		array= sortedArray(array);
		System.out.println(Arrays.toString(array));
		System.out.println("Time complexity is : O(n-1)*n + +4");
		}
	public static int[] sortedArray(int[] array) {
		for(int i =0; i<array.length; i++) {
			for(int j=i+1; j< array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i]= array[j];
					array[j] = temp;
				}
			}
		}
		return array;
		
	}
}
