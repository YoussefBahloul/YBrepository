package book;

import java.util.Scanner;

public class BookDatabase {
		public static void addBook() {
		Scanner kboard = new Scanner(System.in);
		do {
		System.out.println("What is the name of the book?");
		String name = kboard.nextLine(); 
		System.out.println("What is the name of the author?");
		String author = kboard.nextLine();
		System.out.println("What is the genre of the book?");
		String genre = kboard.nextLine();
		System.out.println("How many pages are in the book?");
		int pgcount = Integer.parseInt(kboard.nextLine());
		
		System.out.println("Would you like to add another book? 1 - Yes || 2 - No");
		Book.addBooktoDatabase(new Book(name, author, genre, pgcount));
		} while(kboard.nextLine().charAt(0) == '1');
		
		System.out.println("The number of books in the database currently is: " + Book.getNumBooks());
		
		
	}
		
	public static void main(String[] args) {
		addBook();

	}

}
