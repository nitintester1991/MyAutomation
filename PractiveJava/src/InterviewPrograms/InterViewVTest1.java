package InterviewPrograms;

class A{
	public void method1() {
		System.out.println("Class A, Method1");
	}
	public void method2() {
		System.out.println("Class A, Method2");
	}
}
class B extends A{
	public void method1() {
		System.out.println("Class B, Method1");
	}
	public void method2() {
		System.out.println("Class B, Method2");
	}
	public void method3() {
		System.out.println("Class B, Method3");
	}
}

public class InterViewVTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		obj.method1();
		obj.method2();
		
		B ob = new B();
		ob.method1();
		ob.method2();
		
		A ob2 = new B();
		
		
	}

}
