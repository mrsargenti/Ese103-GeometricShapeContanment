package ese103;

import java.io.*;
import circle.*;

public class Ese103 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Circle circleArray[] = new Circle[3];
		circleArray[0] = new Circle(0, 0, 1);
		circleArray[1] = new Circle(0.5, 0.5, 0.5);
		circleArray[2] = new Circle(1, 1, 1);
		Circle a, b;
		for(int i=0; i<circleArray.length; i++) {
			a = circleArray[i];
			b = circleArray[(i+1) % circleArray.length];
			if(a.contains(b))
				System.out.println(a + " contiene " + b);
			else
				System.out.println(a + " NON contiene " + b);
		}
	}
}
