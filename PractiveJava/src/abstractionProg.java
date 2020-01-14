abstract class bike{
	int no_tires;
	
	abstract void start();
}

class abstractionProg extends bike {
	void start() {
		System.out.println("This is Abstraction.");
	}
	
	public static void main(String[] args) {
		bike obj = new abstractionProg();
		obj.start();
	}
	
}
