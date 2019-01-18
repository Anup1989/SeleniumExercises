package abstactionsConcept;

public interface Car {

	// Interface:
	// Always define only abstract methods
	// no method body
	// only method wihtout abstract keyword.
	// we achive 100% abstractions
	// Can not create object of interface.

	// only static and final veriqbles are defined

	final int wheels = 4;

	public void Start();

	public void Stop();

	public void Refuel();

}
