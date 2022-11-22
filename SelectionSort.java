package assignment2;

public class SelectionSort {

	public static void main(String[] args) {
		int [] arr={2,4,1,6,5,34,8,56};
		
		//Selection Sort
		for(int i=0; i<arr.length; i++)
		{
			int min_in=0;
			for(int j=i; j<arr.length; j++)
			{
				if(arr[j]>arr[min_in])
				{
					min_in=j;
				}
				int temp=arr[j];
				arr[j]=arr[min_in];
				arr[min_in]=temp;
			}
		}
	
		for(int prt : arr)
		{
			System.out.print(prt+" ");
		}

	}


}
