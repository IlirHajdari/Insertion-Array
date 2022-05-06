import java.util.Arrays;

public class SelectionSort {
	
	public static void selectionSortAscendingOrder(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n -1; i++) {
			int min = i;
			System.out.println("Sorting based on Number " + (i+1));
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {5,7,4,9,8,5,6,3};
		System.out.println("Ascending Order:");
		System.out.println();
		selectionSortAscendingOrder(arr);
		
	}
}
