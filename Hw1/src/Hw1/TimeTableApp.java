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
		  
		  out.println("Please enter the day to add the class:");//���ϰ� �ð��� ���� �迭�� �� ����� �Ŀ�, ������ �Է¹޴� ���� ����� �ش�.
		  
		  
		  out.println("Please enter the period to ass the class:");//���ø� �Է¹޴� ���� ����� �ش�
		  
		  out.println("Please enter the name of the class:");//������ �Է¹޴� ���� ����� �ش�
		  
		  out.println("Please enter the name of the tutor:");//��米�� �Է¹޴� ���� ����� �ش�
		  
		  out.println("Please enter the name of the room:");//���ǽ��� �Է¹޴� ���� ����� �ش�
		  
		  
		  out.println("Class successfully added");
		  
		  
		  
		 }

		 public static void ViewClass() {

		  out.println("View the class at a specific time:");
		  out.println();
		  
		  out.println("Please enter the day of the class:");//�Է¹��� ������ ����ϱ� ���� ������ �Է¹޴� ���� ����� �ش�.
		  
		  out.println("Please enter the period of the class:");//�Է¹��� ������ ����ϱ� ���� �ð��� ���ø� �Է¹޴� ���� ����� �ش�.
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


