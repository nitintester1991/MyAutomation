package InterviewPrograms;

class recor{

	int fuc(int n) {
		int result;
		result = fuc(n-1);
		return result;
	}
}

public class RecursiveSum {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recor rs = new recor();
		System.out.println(rs.fuc(12));
	}

}
