package design;

public interface Employee {


	public abstract class AbstractClass implements Employee {

		final String empName = "Vann Desell";
		static String resignationDate = "01/01/2010v";

		public void farewell() {
			System.out.println(empName + "'s last day was" + resignationDate);
		}

		public abstract void farewell(int date);

	}
}






