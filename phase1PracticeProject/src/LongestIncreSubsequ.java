public class LongestIncreSubsequ
{
	static int maxtree; // storing  the largest increasing subsequence here

	static int List(int array[], int number)
	{
         // base case
		if (number == 1)
			return 1;
		
		int res, max_ending = 1;
		
		for (int index = 1; index < number; index++)
		{
			res = List(array, index);
			if (array[index - 1] < array[number - 1]
				&& res + 1 > max_ending)
				max_ending = res + 1;
		}
		if (maxtree < max_ending)
			maxtree = max_ending;
		
		//return length
		return max_ending;
	}
	
	//the wrapper function for list()
	static int lis(int arr[], int n)
	{
		// the max variable holds the result
		maxtree = 1;
		//the function list() stores its result in max
		List(arr, n);
		
		return maxtree;
	}
	
	//drive program to test above function
	public static void main(String args[])
	{
		int b[] = { 10,52,45,85,78,36,49,82,75,20,10,73,46, 56,50,82,30,99};
		int n = b.length;
		System.out.println("Length of lis is " + lis(b, n) + "\n");
	}
}