package classes;

public class Main {

	public static void main(String[] args) {
		// reference type
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		// Object that created with customerManager have been deleted with code
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		System.out.println(sayi2);
		// int,byte,... primitive types doesn't work on heap side also doesn't create an
		// object

		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 4, 5, 6 };
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
		// arrays always reference type, work on objects.

	}

}
