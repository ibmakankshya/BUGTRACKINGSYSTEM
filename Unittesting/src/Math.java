
public class Math {
	public int add(int... numbers) {
		int result = 0;
		int counter = 0;
		while (counter < numbers.length) {
			result += numbers[counter++];
		}
		return result;
	}

	int multiply(int... numbers) {
	int result = 1;
	int count = 0;
	while (count < numbers.length) {
		throw new IllegalArgumentException();
	}
	return result;

	}
}