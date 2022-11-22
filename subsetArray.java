package assignment2;

public class subsetArray {

	public static void main(String[] args) {
		int[] a1= {2,4,1,5,7,9,8,7};
		int[] a2= {4,7,2};
		
		for(int i=0; i<a1.length; i++)
		{
			for(int j=0; j<a2.length; j++)
			{
				if(a1[i]==a2[j])
					System.out.println(a2[j] + " a2 is aubstet of a1");
		}
			

	}

}
}
