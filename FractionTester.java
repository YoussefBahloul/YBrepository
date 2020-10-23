
/**
 *Author: Youssef Bahloul and Corbin Poisson
 *Date: Oct 22, 2020
 *Decription: An instance of the Fraction class.
 */
public class FractionTester {

	public static void main(String[] args) {
//		Fraction fracX = new Fraction();
		Fraction fracX = new Fraction();
		Fraction fracY = new Fraction(2, 3);
//		Fraction.add(new Fraction(2, 5), new Fraction(2, 5));
		
		Fraction.add(fracX, fracY);
		Fraction.subtract(fracX, fracY);
		Fraction.multiply(fracX, fracY);
		Fraction.divide(fracX, fracY);
		
		
		
		

	}

}
