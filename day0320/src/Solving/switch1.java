package Solving;

public class switch1 {
//프로그램의 기능 : 내가 원하는 달을 프로그램 내에 지정해놓고 그 달에 해당하는 수를
	//출력할 수 있다. 
	
	public static void main(String[] args) {
		String month = "february";
		
		int monthNumber;
		
		switch(month) {
		
		case "january":
			monthNumber =1;
			break;
			
		case "february":
			monthNumber =2;
			break;
			
		case "march":
			monthNumber =3;
			break;
			
		default :
		    monthNumber =0;
			break;
		
		}
        
		System.out.println(monthNumber);
		
	}

}
