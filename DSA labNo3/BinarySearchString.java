public class BinarySearchString {

	static String[] a = { "Aiman", "Bisma", "Doha", "Fozia", "Hania", "Iqra", "Manahil" };
	static int min = 0;
    static int max = a.length - 1;
    static int mid;
	static String s = "Iqra";

	public static void main(String[] args) {
		System.out.println("String Found at : " + stringBinarySearch() + " position");
	}

	public static int stringBinarySearch() {
		while (min <= max) {
			mid = (min + max) / 2;
			if (a[mid].compareTo(s) < 0) { min = mid + 1; } else if (a[mid].compareTo(s) > 0) {
				max = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}