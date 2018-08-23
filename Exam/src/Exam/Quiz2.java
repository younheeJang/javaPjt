package Exam;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int arr[][] = new int[4][];
		 int n = 1;
			int i;	 
		 for( i = 0; i< arr.length; i++) {
			 
			 
	
	    arr[i]=new int[i+1];
	    for(int j = 0; j<arr[i].length; j++)
	    {
	    	arr[i][j]=n++;
	    	
	    	System.out.print(arr[i][j]);
	    System.out.print("\t");
	    }
		 
	    System.out.println();
		 }	
		
	}

}
