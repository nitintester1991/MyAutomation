
public class ifStmt {
	public static void main(String args[]) {
		int x=19;
		int y=16;
		
		if(x>y) {
			if(x % 2 ==0)
			{
				System.out.println("X is Even Number");
			}
			else
				System.out.println("X is Odd Number");
			
			System.out.println("X>Y");
		}
		else if (x<y)
		{
			System.out.println("X<Y");
		}
		else
		{
			System.out.println("X=Y");
		}
	}
}
