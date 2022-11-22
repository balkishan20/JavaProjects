package assignment2;

public class Arraydup {

	public static void main(String[] args) {
		int[] arr= {1,1,2,4,2,5,6,7,4,9};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j]==arr[i])
				{
					System.out.print(arr[j] + " ");
				}
			}
		}
	}
	
	

}
