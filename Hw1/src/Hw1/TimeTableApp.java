package Hw1;
import static java.lang.System.out;
import java.util.Scanner;
public class TimeTableApp {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		TimeTable storeTimeTable = new TimeTable();
		
		  
		  Scanner sc = new Scanner(System.in);
		  int num = 0;
		  do {
		   
		   out.println("Select your menu:");
		   num = sc.nextInt();
		   out.println();
		   
		   switch (num) {

		   case 1:
		    AddClass();
		    break;

		   case 2:
		     ViewClass();
		    break;

		   case 3:
		    PrintTimeTable();
		    break;

		   case 4:
		    ExitProgram();
		    break;

		   }

		  } while (num != 4);

		 }

		 public static void AddClass() {
			 
		  out.println("Add a class to my time table:");
		  
		  out.println("Please enter the day to add the class:");//요일과 시간에 대한 배열을 잘 잡아준 후에, 요일을 입력받는 폼을 만들어 준다.
		  
		  
		  out.println("Please enter the period to ass the class:");//교시를 입력받는 폼을 만들어 준다
		  
		  out.println("Please enter the name of the class:");//과목을 입력받는 폼을 만들어 준다
		  
		  out.println("Please enter the name of the tutor:");//담당교수 입력받는 폼을 만들어 준다
		  
		  out.println("Please enter the name of the room:");//강의실을 입력받는 폼을 만들어 준다
		  
		  
		  out.println("Class successfully added");
		  
		  
		  
		 }

		 public static void ViewClass() {

		  out.println("View the class at a specific time:");
		  out.println();
		  
		  out.println("Please enter the day of the class:");//입력받은 정보를 출력하기 위해 요일을 입력받는 폼을 만들어 준다.
		  
		  out.println("Please enter the period of the class:");//입력받은 정보를 출력하기 위해 시간을 교시를 입력받는 폼을 만들어 준다.
		 }

		 public static void PrintTimeTable() {

		  out.println("Print the time table");
		 }

		 public static void ExitProgram() {

		  out.println("Exit the program");
		 }

	
		 
		 
		 public static void addSchedule() {
			
			
			
			
			
		}
		
		public static void getSchedule() {
			
			
			
			
			
		}






}


