class Vehicle
{
	void run()
	{
		System.out.println("Running vehicle");
	}
}

class TwoWheeler extends Vehicle
{
	void run()
	{
		System.out.println(" in twowheeler Giving accelerator and brake");
	}
}
class OneWheeler extends Vehicle
{
	void run()
	{
		System.out.println("In onewheeler giving accelerator and brake");
	}
}
class ThreeWheeler extends Vehicle
{
	void run()
	{
		System.out.println("In Threewheeler giving accelerator and brake ");
	}
}



