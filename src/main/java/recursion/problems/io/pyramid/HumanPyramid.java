package recursion.problems.io.pyramid;

import org.springframework.stereotype.Component;

@Component
public class HumanPyramid {
	private static double WT_ONE = 200d;

	public double weightOnBackOf(int row, int col) {
		return weightOnBackHelper(row, col);
	}
	
	private double weightOnBackHelper(int row, int col) {
		if (row == 0 && col == 0) {
			return 0;
		} else if (row > 0 && col == 0) {
			return WT_ONE/2 + weightOnBackHelper(row - 1, col)/2;
		} else if (row > 0 && col > 0 && row == col) {
			return WT_ONE/2 + weightOnBackHelper(row - 1, col - 1)/2;
		} else {
			return WT_ONE + weightOnBackHelper(row - 1, col - 1)/2 + weightOnBackHelper(row - 1, col)/2;
		}
	}
}
