package entidade;

public class HtmlStatement extends Statement {

	public String getFirstValue(Customer aCustomer) {
		return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
	}

	public String getSecondValue(Customer aCustomer, Rental aRental) {
		return aRental.getMovie().getTitle() + ": " + String.valueOf(aRental.getCharge()) + "<BR>\n";
	}

	public String getThirdValue(Customer aCustomer) {
		return "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
	}

	public String getFourthValue(Customer aCustomer) {
		return "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + "</EM> frequent renter points<P>";
	}
}
