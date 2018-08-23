package Exam;

public class Quiz3 {

	public static void main(String[] args) {
	
	
		 int arr[][] = new int[4][];
		 int n = 1;
			int i;	 
		 for( i = 0; i< arr.length; i++) {
			 
			 
	
	    arr[i]=new int[4-i];
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
