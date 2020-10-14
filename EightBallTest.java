
/**
 *Author: Youssef Bahloul and Corbin Poisson
 *Date: Oct 13, 2020
 *Decription: The EightBall object.
 */
public class EightBallTest {

	public static void main(String[] args) {
		EightBall X = new EightBall();
		
		X.setShake(true);
		//if you call the method without a parameter of "true", the code will tell you that you need to shake the ball.
		X.getShake();
//		X.getPrediction();
		System.out.println(X.getPrediction());
		

	}

}
