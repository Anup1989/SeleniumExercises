package abstactionsConcept;

public class TestCar {
	public static void main(String[] args) {

		BMW bmw = new BMW();
		bmw.Start();
		bmw.Stop();
		bmw.Refuel();
		bmw.ThreadSefty();

		Car c = new BMW(); // Dynamic polymorphism means we can create reference ofject of the parent class
							// with child class.
		c.Start();
		c.Stop();
		c.Refuel();

	}
}
