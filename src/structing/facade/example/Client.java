package structing.facade.example;

public class Client {

	public static void main(String[] args) {
		Facade facade=new Facade();
		facade.methodA();
		facade.methodB();
		facade.methodC();
	}

}