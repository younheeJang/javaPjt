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
		
	for (int i = 1; i < 8 ; i += 3)//�������� 3�ܾ� �̱� ���ؼ� 
	{
		for(int j = 1 ; j < 10 ; j++)
		{
		
			
			for (int k = i; k < i + 3; k++)
				{System.out.print(k + "*" + j + "=" + k * j );
		System.out.print("\t");	//�������� ���η� 3�ܾ� ����ش�.
		}
		System.out.println();//�������� 3�ܾ� 3�ٷ� �����ش�
		
	}
		System.out.println();//�������� 3�ܾ� 9���� �����ش�
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