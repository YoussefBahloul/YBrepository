package Histogram;

import java.util.Arrays;

public class NoDuplicates3 {
	

	private static int[] generate() {
		int length = (int)(Math.random()*21)+ 30;
		int[] arr = new int[length];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*30) + 1;
		}
		return arr;
	}
	private static int[] removeDup(int[] arr) {
		Arrays.sort(arr);
		int length = arr.length;
		int count = 0;
		int[] newArr = new int[arr.length];
		
		for(int i = 0; i < length - 1; i++) {
			if(arr[i] != arr[i+1]) {
				newArr[count++] = arr[i];
			}
		}
		newArr[count++] = arr[length - 1];
		for(int x = 0; x < count; x++) {
			System.out.print("| "+ newArr[x] + " |");
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] array = generate();
		Arrays.sort(array);
		for(int nums : array) {
			System.out.print("| " + nums + " |");
		}
		System.out.println();
		removeDup(array);
		
	}

}
