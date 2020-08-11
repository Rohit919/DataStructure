package divideAndConqure;

public class DACMaxAndMin {
	static class Pair {
		int max;
		int min;
	}

	public static Pair getMinMax(int arr[], int low, int high) {
		// Base Case
		Pair minmax = new Pair();
		Pair mml = new Pair();
		Pair mmr = new Pair();
		int mid;

		/* If there is only one element */
		if (low == high) {
			minmax.min = arr[low];
			minmax.max = arr[low];
			return minmax;
		}

		/* If there is only two element */
		if (high == low + 1) {
			if (arr[low] >= arr[high]) {
				minmax.min = arr[high];
				minmax.max = arr[low];
			} else {
				minmax.min = arr[low];
				minmax.max = arr[high];
			}
			return minmax;
		}

		/* If there is more than two element */
		mid = (low + high) / 2;
		mml = getMinMax(arr, low, mid);
		mmr = getMinMax(arr, mid + 1, high);

		/* Compare minimum for two parts */
		if (mmr.min >= mml.min) {
			minmax.min = mml.min;
		} else {
			minmax.min = mmr.min;
		}

		/* Compare maximum for two parts */
		if (mmr.max >= mml.max) {
			minmax.max = mmr.max;
		} else {
			minmax.max = mml.max;
		}
		return minmax;
	}

	public static void main(String[] args) {
		int arr[] = {1000, 11, 445, 1, 330, 3000}; 
        Pair minmax = getMinMax(arr, 0, arr.length - 1); 
        System.out.printf("\nMinimum element is %d", minmax.min); 
        System.out.printf("\nMaximum element is %d", minmax.max); 
	}
}
