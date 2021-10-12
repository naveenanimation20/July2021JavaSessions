package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.stop();// inherited
		b.refuel();// inherited
		b.start();// overriden
		b.autoParking();// individual
		b.engine();

		b.getName();

		BMW.getName();

		b.speed = 300;
		System.out.println(b.speed);

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		Car.getName();

		// child class object can be referred by parent class ref variable:
		// top casting:
		Car c1 = new BMW();
		c1.stop();
		c1.refuel();
		c1.start();

		// child class object can be referred by grand parent class ref variable:
		Vehicle v1 = new BMW();
		v1.engine();

		// down casting: parent object can be referred by child class ref variable
		// BMW b1 = (BMW)new Car();

		// BMW b2 = (BMW)new Vehicle();

		Audi a = new Audi();
		a.childLock();
		a.start();
		a.stop();
		a.refuel();

		// BMW b3 = (BMW)new Audi();

	}

}
