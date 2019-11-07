import java.util.Arrays;

public class BinarySearChar {

	public static void main(String[] args) {

		char charArray[] = { 'a', 'b', 'd', 'e' };

		Arrays.sort(charArray);

		char search = 'b';

		int intResult = Arrays.binarySearch(charArray, search);
		System.out.println("Result of binary search of 'b' is : " + intResult);

		
		search = 'c';
		intResult = Arrays.binarySearch(charArray, search);
		System.out.println("Result of binary search of 'c' is : " + intResult);

	}
}