class Test
{
	public static void main(String args[])
	{
		Vehicle v = new TwoWheeler();
		v.run();
		Vehicle v1 = new OneWheeler();
		v1.run();
		Vehicle v2 = new ThreeWheeler();
		v2.run();
	}
}
