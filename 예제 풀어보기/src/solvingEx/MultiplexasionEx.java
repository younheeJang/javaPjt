package solvingEx;

public class MultiplexasionEx {

	public static void main(String[] args) {
	
	
		
/*for(int i=1; i<8; i+=3) 
{
  for(int j=1; j<10; j++) 
  {
		
    for(int k=i; k<i+3; k++)
    {
		System.out.println(k+"*"+j+"="+k*j);
		System.out.println("\t");
	    }
    System.out.println();
	}
	  System.out.println();
}
*/
		
	for (int i = 1; i < 8 ; i += 3)//구구단을 3단씩 뽑기 위해서 
	{
		for(int j = 1 ; j < 10 ; j++)
		{
		
			
			for (int k = i; k < i + 3; k++)
				{System.out.print(k + "*" + j + "=" + k * j );
		System.out.print("\t");	//구구단을 가로로 3단씩 띄어준다.
		}
		System.out.println();//구구단을 3단씩 3줄로 나눠준다
		
	}
		System.out.println();//구구단을 3단씩 9개로 나눠준다
}


/* for (int i = 1 ; i < 8 ; i += 3)
{
    for (int j = 1 ; j < 10 ; j++)
    {
    
        for (int k = i ; k < i + 3 ; k++)
        {
        
            System.out.print (k + " * " + j + " = " + k * j);
            System.out.print ("\t");
        }
        System.out.println ();
    }
    System.out.println();
}*/
	
		
	}

}