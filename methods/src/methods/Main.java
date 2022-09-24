package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int lookingFor = 8;
		boolean isItIn = false;

		for (int number : numbers) {

			if (number == lookingFor) {
				isItIn = true;
				break;
			}
		}

		if (isItIn) {
			giveMessage("Number is in the series: " + lookingFor);
		} else {
			giveMessage("Number is not in the series: " + lookingFor);

		}

	}

	public static void giveMessage(String message) {
		System.out.println(message);

	}

}
