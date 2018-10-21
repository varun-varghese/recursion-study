package recursion.problems.io.pyramid;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class HumanPyramid {
	private static double WT_ONE = 200d;
	private Map<String, Double> memoize;

	public double weightOnBackOf(int row, int col) {
		memoize = new HashMap<String, Double>();
		return weightOnBackHelper(row, col);
	}
	
	private double weightOnBackHelper(int row, int col) {
		if (row == 0 && col == 0) {
			return 0;
		} else if (contains(row, col) ) {
			return getVal(row, col);
		} else {
			if (row > 0 && col == 0) {
				double wt = WT_ONE/2 + weightOnBackHelper(row - 1, col)/2;
				memoize(row, col, wt);
				return wt;
			} else if (row > 0 && col > 0 && row == col) {
				double wt = WT_ONE/2 + weightOnBackHelper(row - 1, col - 1)/2;
				memoize(row, col, wt);
				return wt;
			} else {
				double wt = WT_ONE + weightOnBackHelper(row - 1, col - 1)/2 + weightOnBackHelper(row - 1, col)/2;
				memoize(row, col, wt);
				return wt;
			}
		}
	}
	
	private void memoize(int row, int col, double value) {
		memoize.put(getKey(row, col), value);
	}
	
	private boolean contains(int row, int col) {
		return memoize.containsKey(getKey(row, col));
	}
	
	private String getKey(int row, int col) {
		return String.format("%1$d,%2$d", row, col);
	}
	
	private Double getVal(int row, int col) {
		return memoize.get(getKey(row, col));
	}
}
