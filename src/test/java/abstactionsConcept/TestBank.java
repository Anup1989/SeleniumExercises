package abstactionsConcept;

public class TestBank {

	public static void main(String[] args) {

		HDFCBank hdfcbank = new HDFCBank();
		hdfcbank.Credit();
		hdfcbank.Debit();
		hdfcbank.loan();
		hdfcbank.Funds();

		Bank b = new HDFCBank(); // Dynamic polymorphism.

		b.Credit();
		b.Debit();
		b.loan();

	}

}
