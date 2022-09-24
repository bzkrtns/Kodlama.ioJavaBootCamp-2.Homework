package inheritance;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer();
		Employee employee = new Employee();

		customer.age = 20;
		customer.email = "exx@gmail.com";
		customer.firstName = "Ali";
		customer.id = 5;
		customer.lastName = "Demir";

		employee.age = 43;
		employee.firstName = "Veli";
		employee.id = 455;
		employee.lastName = "Has";
		employee.salary = 124.43;

		CustomerManager customerManager = new CustomerManager();
		EmployeeManager employeeManager = new EmployeeManager();

		customerManager.Add();
		customerManager.List();

		System.out.println("-----------------");

		employeeManager.Add();
		employeeManager.BestEmployeeOfTheMonth();
		employeeManager.List();

	}
}
