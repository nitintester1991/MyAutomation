
public class calculateAngleInTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calcAngle(9,60)+" degree.");
	}

	public static int calcAngle(int h, int m) {
		//validate the input
		if(h<0 || m<0 || h>12 || m>60)
			System.out.println("Wrong Input");		
		if(h==12)
			h=0;
		if(m==60)
			m=0;
		
		//Calculate the Angle
		int hour_angle = (int)(0.5 * (h*60 + m));
		int minut_angle = (int)(6*m);
		//Difference between the Angles
		int angle = Math.abs(hour_angle - minut_angle);		
		angle = Math.min(360-angle, angle);
		
		return angle;
	}

}
