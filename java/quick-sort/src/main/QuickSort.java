package main;

/*
 * Quick sort by using last index value as pivot value
*/
public class QuickSort{
	
	public static void main(String[] args) {
	
		float[] array= {1,-1,5,3,4,100,9,-1,100};
		sort(0,array.length-1,array);
		for(float i:array)
			System.out.println(i);
	}
	
	public static void sort(int low, int high,float arr[]) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi =  partition(0,high,arr);
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(low,pi-1,arr);
            sort(pi+1,high,arr);
        } 
    } 
	
	public static int partition(int low,int high,float[] arr) {
		
//		define pivot variable(last index of array)
		float pivot=arr[high];
		int i=low-1;
		
		while(low<high) {
			if(arr[low]<=pivot) {
				i++;
				float temp=arr[i];
				arr[i]=arr[low];
				arr[low]=temp;
			}
			low++;
		}
		i++;
		float temp=arr[i];
		arr[i]=arr[low];
		arr[low]=temp;
		
		return i;
	}
	
	
}
