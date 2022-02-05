package entidade;

import java.util.Enumeration;

public abstract class Statement {

	abstract String getFirstValue(Customer aCustomer);

	abstract String getSecondValue(Customer aCustomer, Rental aRental);

	abstract String getThirdValue(Customer aCustomer);

	abstract String getFourthValue(Customer aCustomer);

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
}
