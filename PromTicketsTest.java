package conditionals;

public class PromTicketsTest {

	public static void main(String[] args) {
		PromTickets studentX = new PromTickets("you", "senior", "group");
		PromTickets.ticket(studentX);
		PromTickets.generate();
		System.out.println(studentX.name + " purchased a " + studentX.classification + " " + studentX.groupType + " ticket for " + "$" + PromTickets.ticket(studentX) + "." + " The confirmation number for this sale is " + PromTickets.generate() + ".");
		
		
		

	}

}
