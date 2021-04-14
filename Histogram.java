package Histogram;

public class Histogram {
	private static String c1 = "",
			c11 ="",
			c21 ="",
			c31 ="",
			c41 ="",
			c51 ="",
			c61 ="",
			c71 ="",
			c81 ="",
			c91 ="";
	private static int[] generate() {
		int length = (int)(Math.random()*51) + 50; 
		int[] arr1 = new int[length];
		for(int i = 0; i < arr1.length - 1; i++) {
			arr1[i] = (int)(Math.random() * 100) + 1;
			
		}
		return arr1;
	}
	
	private static void count() {
		int[] arr1 = generate();
		for(int i = 0; i < arr1.length; i++) {
			if(1<=arr1[i] && arr1[i]<=10) {
				c1+= "*";
			}
			if(11<=arr1[i] && arr1[i]<=20) {
				c11+= "*";
			}
			if(21<=arr1[i] && arr1[i]<=30) {
				c21+= "*";
			}
			if(31<=arr1[i] && arr1[i]<=40) {
				c31+= "*";
			}
			if(41<=arr1[i] && arr1[i]<=50) {
				c41+= "*";
			}
			if(51<=arr1[i] && arr1[i]<=60) {
				c51+= "*";
			}
			if(61<=arr1[i] && arr1[i]<=70) {
				c61+= "*";
			}
			if(71<=arr1[i] && arr1[i]<=80) {
				c71+= "*";
			}
			if(81<=arr1[i] && arr1[i]<=90) {
				c81+= "*";
			}
			if(91<=arr1[i] && arr1[i]<=100) {
				c91+= "*";
			}
		}
		
	}
	private static void print() {
		count();
		System.out.println("1 - 10 | " + c1);
		System.out.println("11 - 20 | " + c11);
		System.out.println("21 - 30 | " + c21);
		System.out.println("31 - 40 | " + c31);
		System.out.println("41 - 50 | " + c41);
		System.out.println("51 - 60 | " + c51);
		System.out.println("61 - 70 | " + c61);
		System.out.println("71 - 80 | " + c71);
		System.out.println("81 - 90 | " + c81);
		System.out.println("91 - 100 | " + c91);
	}

	public static void main(String[] args) {
		print();

	}

}
