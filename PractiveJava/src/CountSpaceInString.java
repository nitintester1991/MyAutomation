
public class CountSpaceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is my first string program. and I am trying  best";
		int space=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ') {
				space++;
			}
		}
		System.out.println("Total spaces in string is : "+space);
	}

}
