package practice;

public class Service {
@PrintAnnotation
public void method1() {
	System.out.println("complie content1");
}

@PrintAnnotation ("*")
public void method2() {
	System.out.println("complie content2");
}

@PrintAnnotation(value="#", number=20)
public void method3() {
	System.out.println("compile content3");
}
}
