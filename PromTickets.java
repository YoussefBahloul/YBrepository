package conditionals;

/**
 *Author: Youssef Bahloul and Corbin Poisson
 *Date: Dec 18, 2020
 *Decription: Decides the cost of tickets as well as the 6 digit random code for students based on their gradelevel and group type
 */
public class PromTickets {
	String name;
	String classification;
	String groupType;
	
	
	
	public PromTickets(String name, String classification, String groupType) {
		this.name = name;
		this.classification = classification.toLowerCase();
		this.groupType = groupType.toLowerCase();
		
	}
	public static int ticket(PromTickets student) {
		int costOfTicket;

		if(student.classification.equals("senior")) {
			if(student.groupType.equals("solo")) {
				costOfTicket = 40;

			}
			else if(student.groupType.equals("couple")) {
				costOfTicket = 60;

			}
			else{
				costOfTicket = 100;

			}
		}
		else if(student.classification.equals("junior")) {
			if(student.groupType.equals("solo")) {
				costOfTicket = 45;

			}
			else if(student.groupType.equals("couple")) {
				costOfTicket = 68;

			}
			else{
				costOfTicket = 113;

			}
		}
		else if(student.classification.equals("sophomore")) {
			if(student.groupType.equals("solo")) {
				costOfTicket = 55;

			}
			else if(student.groupType.equals("couple")) {
				costOfTicket = 83;

			}
			else{
				costOfTicket = 138;

			}
		}
		else {
			if(student.groupType.equals("solo")) {
				costOfTicket = 65;

			}
			else if(student.groupType.equals("couple")) {
				costOfTicket = 98;

			}
			else{
				costOfTicket = 163;

			}
		}
		return costOfTicket;
		
	}
	public static String generate() {
		int count = 0;
		int rand = 0;
		String password = "";
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		
		while(count < 6) {
			rand = (int) (Math.random() * characters.length());
			password += characters.substring(rand , rand +1);
			count ++;
			
		}
		return password;
	}
	
//	public static void main(String[] args) {
//		PromTickets studentX = new PromTickets("Pierce", "freshman", "solo");
//		System.out.println(studentX.name + " purchased a " + studentX.classification + " " + studentX.groupType + " ticket for " + "$" + PromTickets.ticket(studentX) + "." + " The confirmation number for this sale is " + PromTickets.generate() + ".");
//		
//		
//	}

}

