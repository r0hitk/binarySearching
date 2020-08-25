package binarySearching;

public class BinarySearch {

	static int search(int[] array, int key) {

		int p, r, index;

		p = 0;
		r = array.length - 1;

		index = binarySearch(array, key, p, r);

		return index;

	}

	private static int binarySearch(int[] array, int key, int p, int r) {

		if (p <= r) {
			
		
			int mid;

			mid = (p + r) / 2;

			if (key < array[mid]) {

				return binarySearch(array, key, p, mid - 1);

			}

			else if (key == array[mid]) {

				return mid;

			}

			else {
				return binarySearch(array, key, mid + 1, r);
			}

		}
		else {
			return -1;
		}
	}

}
