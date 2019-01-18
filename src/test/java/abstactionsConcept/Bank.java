package abstactionsConcept;

public abstract class Bank {

	int amount = 100;
	final int rate = 10;
	static int loanrate = 8;

	// Partial abstraction
	// Abstraction means to hide data or hiding the implamention logic
	// Can not create an objec to abstract classes.

	public abstract void loan(); // abstract method : doesn't have method body.

	// in abstract class can
	// Non- abstractions methods
	public void Credit() {

		System.out.println(" Bank Credit");
	}

	public void Debit() {

		System.out.println(" Bank Debit");
	}

}
