package InterviewPrograms;

import java.util.HashSet;
import java.util.Set;

public class CodeSnippet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s = new HashSet();
		s.add(new Long(10));
		s.add(new Integer(10));
		
		for(Object object : s) {
			System.out.println(object);
		}
	}

}
