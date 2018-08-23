package InputOutput;

import java.io.*;

//ASC code 값 입력받기



public class InputEx1 {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
/*
		System.out.println("문자입력 : ");
	//int i = System.in.read(); //read에서 자체적으로 i=0으로 바꿈
	
		char i = (char)System.in.read();
		
		System.out.println("ASC값 : " +i);
	*/
		
		System.out.println("문자입력:");
		
	    int i = System.in.read();
	   
		
		System.out.println("ASC값 : "+i);
	}

}
