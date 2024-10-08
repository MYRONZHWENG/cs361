/**
 * 
 */
package employee;

/**
 * @author MyronWeng
 *
 */

// Resource: https://www.baeldung.com/java-type-casting

// Complete the provided code

public class DemoEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println();

		Employee emp1 = new Employee("John", "Smith", "123456790");

		PartTimeEmployee pEmp1 = new PartTimeEmployee("Jane", "Smith", "123456777", 17.5);

		//Employee emp2 = new Employee("Don", "Holmes", "123456799");

		//PartTimeEmployee pEmp2 = new PartTimeEmployee("Melissa", "Will", "123456666", 23.5);

		// Upcasting
		Employee emp3 = pEmp1;
		System.out.println("emp3");
		emp3.whoAmI();
		// TODO To complete
		/* emp3.whoAmI();
		 * prints PART TIME EMPLOYEE because 
		 * although emp3 is declared to be of
		 * type Employee, emp3 is actually
		 * referenced to a PartTimeEmployee 
		 * object. Thus, java resolves this 
		 * method access at run time and calls 
		 * the whoAmI() method from class 
		 * PartTimeEmployee.
		*/

		// emp3.getHourlyRate(); // returns syntax error because at compile time, getHourlyRate() method is not found in class Employee.

		// TODO To complete
		// Add the condition that test that emp3 is an instance of part time employee at
		// this time
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee"); // printed
		} else {
			System.out.println("emp3 not instance of part time employee");
		}

		// Downcasting 1
		// TODO Uncomment and run the code
		try {	
			PartTimeEmployee pEmp3 = (PartTimeEmployee) emp1;
		} catch (ClassCastException e) {
			System.out.println("a ClassCastException was caught");
		}
		// TODO To complete
		// This instruction compiles / does not compile
		// This instruction returns a ClassCastException at run time
		// because ...
		/*
		* The instruction "PartTimeEmployee pEmp3 = (PartTimeEmployee) emp1;"
		* compiles because PartTimeEmployee class extends the Employee class
		* but it throws a ClassCastException at run time because emp1 is not
		* actually an object of type PartTimeEmployee; it is of type Employee.
		*/

		// Downcasting 2
		// Requires the use of intanceof to avoid a run time cast exception
		// TODO Look at the solution below
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee"); // printed
			PartTimeEmployee pEmp4 = (PartTimeEmployee) emp3; // cast required
			System.out.println(pEmp4.getHourlyRate());
		} else {
			System.out.println("emp3 not instance of part time employee");
		}

		System.out.println();
	}
}
