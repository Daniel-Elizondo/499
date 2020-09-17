package gitAssignment;

public class bubbleSort {
	
	public static void main(String[] args) {
		
		int[] arr = {6,2,52,5,2,57,654,1,7};
		int n = 3;
		
		int[] sortedArr = sort(arr);
		
		for (int i = 0; i < sortedArr.length; i++)
			System.out.print(sortedArr[i] + ",");
		
		int[] multArr = mult(sortedArr, n);
		
		System.out.println();
		for (int i = 0; i < multArr.length; i++)
			System.out.print(multArr[i] + ",");
	}
	
	public static int[] sort(int[] arr) {
		int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                }
        
        return arr;
	}
	
	public static int[] mult(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) 
			arr[i] = arr[i] * n;
		return arr;
	}
}
