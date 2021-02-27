package book;

import java.util.Scanner;

public class Book {
	private String name = "";
	private String author = "";
	private String genre = "";
	private int pgcount;
	private static int numBooks = 0;
	private static Book[] books = new Book[0];
	
	public Book(String name, String author, String genre, int pgcount) {
		this.name = name;
		this.author = author;
		this.genre = genre;
		this.pgcount = pgcount;
	}
	
	public static int getNumBooks() {
		return numBooks;
	}
	public static void addBooktoDatabase(Book b) {
		
		Book[] newBooks = new Book[books.length + 1];
		
		for(int i = 0; i < books.length; i++) {
			newBooks[i] = books[i];
		}
		newBooks[numBooks] = b;
		numBooks++;
		books = newBooks;
		
		}
	

	}

