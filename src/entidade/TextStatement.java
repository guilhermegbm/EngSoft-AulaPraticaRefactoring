package entidade;

import java.util.Enumeration;

public class TextStatement extends Statement {

	public String value(Customer aCustomer) {
		Enumeration rentals = aCustomer.getRentals();
		String result = this.getFirstValue(aCustomer);
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			//show figures for this rental
			result += this.getSecondValue(aCustomer, each);
		}
		//add footer lines
		result += this.getThirdValue(aCustomer);
		result += this.getFourthValue(aCustomer);
		return result;
	}

	private String getFirstValue(Customer aCustomer) {
		return "Rental Record for " + aCustomer.getName() + "\n";
	}

	private String getSecondValue(Customer aCustomer, Rental aRental) {
		return "\t" + aRental.getMovie().getTitle() + "\t" + String.valueOf(aRental.getCharge()) + "\n";
	}

	private String getThirdValue(Customer aCustomer) {
		return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
	}

	private String getFourthValue(Customer aCustomer) {
		return "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
	}
}
