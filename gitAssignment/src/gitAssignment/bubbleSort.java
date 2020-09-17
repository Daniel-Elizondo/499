package gitAssignment;

public class bubbleSort {
	
	public static void main(String[] args) {
		//Hello Github
		int[] arr = {12,445,6,5674,2,346,7232,9};
		int n = 7;
		
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
