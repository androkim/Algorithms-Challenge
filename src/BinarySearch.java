
public class BinarySearch {

	//class default constructor 
	public BinarySearch() {
		super();
	}
	
	public static void main(String[] args) {
		//Instantiate class BinarySearch
		BinarySearch object = new BinarySearch(); 
		//Initialize local variables with input
		int array1[] = {1, 1, 2, 3, 3, 4, 4, 8, 8};
		int array2[] = {3, 3, 4, 4, 5, 5, 6, 6, 8, 8, 9};
	    int length = ((array1).length/(array1[0]));
	    //call binary search method on BinarySearch class object
	    object.search(array1, 0, length-1);
	    object.search(array2, 0, length+1);
	}
	
	//create a Binary search based method to find the element
	//that appears once
	private void search(int array[], int left, int right)
	{
	     // Base cases
	    if (left > right)
	       return;
	 
	    if (left==right)
	    {
	        System.out.println("Output " + array[left]);
	        return;
	    }
	 
	    // Find the middle point, let's call it mid
	    int mid = (left + right) / 2;
	 
	    // If mid is even and element next to mid is
	    //same as mid, then output element lies on
	    // right side, else on left side
	    if (mid%2 == 0)
	    {
	        if (array[mid] == array[mid+1])
	            search(array, mid+2, right);
	        else
	            search(array, left, mid);
	    }
	    else  // If mid is odd
	    {
	        if (array[mid] == array[mid-1])
	            search(array, mid-2, right);
	        else
	            search(array, left, mid-1);
	    }
	}
}
