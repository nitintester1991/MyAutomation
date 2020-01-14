package InterviewPrograms;

public class FactorialInterger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		float fact=1;
		for (int j=0; j<n;j++) {
			fact=fact*n;
			n=n-1;
		}
		System.out.println(fact);
	}

}
