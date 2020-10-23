
/**
 *Author: Youssef Bahloul and Corbin Poisson
 *Date: Oct 22, 2020
 *Decription: A class that creates a fraction and methods for basic arithmetic involving two fractions.
 */
public class Fraction {
int num;
int den;


	public Fraction() {
		num = 1;
		den = 2;
	}
	
	public Fraction(int numVal, int denVal) {
		num = numVal;
		den = denVal;	
	}
//	public Fraction(int num, int den) {
//        this.num = num;
//        this.den = den;
//    }
	
	public static void add(Fraction frac1, Fraction frac2) {
		if (frac1.den == frac2.den) {
			int numerator = frac1.num + frac2.num;
			System.out.println(new Fraction(numerator, frac1.den));
//			System.out.println(numerator + "/" + frac1.den);
		}
		else {
			int denominator = frac1.den * frac2.den;
			int numerator = (frac1.num * frac2.den) + (frac2.num * frac1.den);
			System.out.println(new Fraction(numerator, denominator));
//			System.out.println(numerator + "/" + denominator);
		}
		
	}
	public static void subtract(Fraction frac1, Fraction frac2) {
		if (frac1.den == frac2.den) {
			int numerator = frac1.num - frac2.num;
			System.out.println(new Fraction(numerator, frac1.den));
//			System.out.println(numerator + "/" + frac1.den);
		}
		else {
			int denominator = frac1.den * frac2.den;
			int numerator = (frac1.num * frac2.den) - (frac2.num * frac1.den);
			System.out.println(new Fraction(numerator, denominator));
//			System.out.println(numerator + "/" + denominator);
		}
		
	}
	public static void multiply(Fraction frac1, Fraction frac2) {
		int numerator = frac1.num * frac2.num;
		int denominator = frac1.den * frac2.den;
		System.out.println(new Fraction(numerator, denominator));
//		System.out.println(numerator + "/" + denominator);
	
	}
	public static void divide(Fraction frac1, Fraction frac2) {
		int numerator = frac1.num * frac2.den;
		int denominator = frac1.den * frac2.num;
		System.out.println(new Fraction(numerator, denominator));
//		System.out.println(numerator + "/" + denominator);
	}
	
	public String toString() {
		if (num == den) {
			return "1";
			
		}
		else if (num == 0) {
			return "0";
		}
		else {
			return num + "/" + den;
		}
		
	}
}
