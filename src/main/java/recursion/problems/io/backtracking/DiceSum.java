package recursion.problems.io.backtracking;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DiceSum {
	
	private List<List<Integer>> result;
	
	public List<List<Integer>> diceSum(int numDice, int expectedSum) {
		log.info("| Finding dice sum for {} dice, with expected value {}", numDice, expectedSum);
		result = new LinkedList<List<Integer>>();
		List<Integer> chosen = new LinkedList<Integer>();
		
		diceHelper(chosen, numDice, expectedSum);
		return result;
	}

	private void diceHelper(List<Integer> chosen, int dice, int sum) {
		// base
		if (dice == 0) {
			if (sumAll(chosen) == sum) {
				log.debug("| Found a sum {}", chosen);
				result.add(chosen.stream().collect(Collectors.toList()));
			}
		} else {
			for (int i = 1; i <= 6; i++) {
				// chosen
				chosen.add(i);
				
				// explore
				diceHelper(chosen, dice - 1, sum);
				
				// backtrack
				chosen.remove(chosen.size() - 1);
			}
		}
	}
	
	private int sumAll(List<Integer> chosen) {
		return chosen.stream().collect(Collectors.summingInt(Integer::intValue));
	}

}
