package day0330;

public class Cat extends Animal{

	
	private String name;
	public Cat() {
		// TODO Auto-generated constructor stub
	name =getClass().getSimpleName();
	
	
	}
@Override
public String Scream() {
	// TODO Auto-generated method stub
	
               return "¾ß¿Ë";
}

@Override
public String gerName() {
	// TODO Auto-generated method stub
return name;
}

}
