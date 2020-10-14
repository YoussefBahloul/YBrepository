
/**
 *Author: Youssef Bahloul and Corbin Poisson
 *Date: Oct 13, 2020
 *Decription: The class containing the constructors and methods for the EightBall object.
 */
import java.util.Random;

public class EightBall {
	private boolean shake;
	private final Random rand = new Random();
	private final String[] PREDICTIONS = {"No.", "You are doomed.", "Maybe.", "Yes.", "Try again later.", "Bruh", "What are you asking me for?"};
	private final String noPrediction = "You need to shake the ball before you can get a prediction.";
	//instance variables declared
	
	public EightBall() {
		shake = false;
		//default constructor
	}
	
	public EightBall(boolean boolValue) {
		shake = boolValue;
		//parameter constructor
	}
	public void setShake() {
		shake = false;
	}
	
	public void setShake(boolean boolValue) {
		shake = boolValue;
		
	}
	
	
	public boolean getShake() {
		return shake;
		
	}
	
	public String getPrediction() {
		if (shake == true) {
			return PREDICTIONS[rand.nextInt(PREDICTIONS.length)];
		}
		return noPrediction;
		}
		
		
	}
	

