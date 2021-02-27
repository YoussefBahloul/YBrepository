package SlotMachine;

import java.util.Scanner;
import java.util.Random;

public class SlotMachine {
	private static int earnings;
	private static int numSpins;
	private static int[] slots = new int[3];
	private static String[] aOrAn = new String[3];
	
	private static String getA(int val) {
		  if (val == 8) {
		    return "an";
		  }
		  else {
		    return "a";
		  }
		}
	
	public static void spin() {
		Scanner kboard = new Scanner(System.in);
		Random rand = new Random();
		
			
		do {
		for(int i = 0; i < slots.length; i++) {
			slots[i] = rand.nextInt(9);	
		}
		System.out.println("You spun " + getA(slots[0]) + " " + slots[0] + ", " + getA(slots[1]) + " " + slots[1] + ", and " + getA(slots[2]) + " " + slots[2] + ".");
		if (slots[0] == slots[1] && slots[0] == slots[2]) {
			earnings+= 1000;
		}
		else if (slots[0] == slots[1]) {
			earnings+= 250;
		}
		else if (slots[0] == slots[2]) {
			earnings+= 250;
		}
		else if (slots[1] == slots[2]) {
			earnings+= 250;
		}
		else {
			earnings-= 10000;
		}
		numSpins++;
		System.out.println("Would you like to spin again? 1 - Yes || 2 - No");
		}while(kboard.nextLine().charAt(0) == '1');
		System.out.println("Your current earnings are: " + "$" + earnings);
		}
	
//	
//	public static void spinWithoutArray() {
//		Scanner kboard = new Scanner(System.in);
//		do {
//		int slot1 = (int)(Math.random() * 10) + 1;
//		int slot2 = (int)(Math.random() * 10) + 1;
//		int slot3 = (int)(Math.random() * 10) + 1;
//		String aOrAn = "";
//		
//		System.out.println("You spun a " + slot1 + ", a " + slot2 + ", and a " + slot3);
//		
//		if(slot1 == slot2 && slot1 == slot3) {
//			earnings+= 1000;
//		}
//		else if(slot1 == slot2) {
//			earnings+= 25;
//		}
//		else if(slot1 == slot3) {
//			earnings+= 25;
//		}
//		else if(slot2 == slot3) {
//			earnings+= 25;
//		}
//		else {
//			earnings-=10000;
//		}
//		numSpins++;
//		System.out.println("Would you like to spin again? 1 - Yes || 2 - No");
//		}while(kboard.nextLine().charAt(0) == '1');
//		System.out.println("Your current earnings are: " + earnings);
//	}

	public static void main(String[] args) {
		spin();

	}

}
