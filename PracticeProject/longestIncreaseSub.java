package Project;

public class longestIncreaseSub {
	
	static int max_start;
	
	static int list(int arr[], int s) {
		if (s == 1)
            return 1;
		
		int res, max_end = 1;
		
		for (int i = 1; i < s; i++) {
            res = list(arr, i);
            if (arr[i - 1] < arr[s - 1]
                && res + 1 > max_end)
                max_end = res + 1;
        }
		
		 if (max_start < max_end)
			 max_start = max_end;
		 
		 return max_end;
	}
	
	static int lis1(int arr[], int n) {
		max_start = 1;
		list(arr, n);
		return max_start;
	}
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub

        int arr[] = {79,199,299,1,120,29,57,10,69,12,34,67,87,66,99};
        int n = arr.length;
        System.out.println("Length of list is " + list(arr, n)
                           + "\n");
    }
}