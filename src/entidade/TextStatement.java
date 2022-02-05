package entidade;

import java.util.Enumeration;

public class TextStatement extends Statement {

	public String getFirstValue(Customer aCustomer) {
		return "Rental Record for " + aCustomer.getName() + "\n";
	}

	public String getSecondValue(Customer aCustomer, Rental aRental) {
		return "\t" + aRental.getMovie().getTitle() + "\t" + String.valueOf(aRental.getCharge()) + "\n";
	}

	public String getThirdValue(Customer aCustomer) {
		return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
	}

	public String getFourthValue(Customer aCustomer) {
		return "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
	}
}
