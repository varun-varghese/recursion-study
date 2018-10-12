package recursion.problems.io.backtracking;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class DiceRoll {
	
	private List<List<Integer>> result;
	
	/**
	 * generate all possible sequences of values of dice roll
	 *
	 */
	public List<List<Integer>> getDiceRollSequence(int numDice) {
		result = new LinkedList<List<Integer>>();
		List<Integer> chosen = new LinkedList<Integer>();
		diceHelper(chosen, numDice);
		return result;
	}
	
	private void diceHelper(List<Integer> chosen, int numDice) {
		// TODO
		if (numDice == 0) {
			log.debug("|Before {}",result);
			log.debug("|Chosen {}", chosen);
			result.add(chosen.stream().collect(Collectors.toList()));
			log.debug("|After: {}", result);
		} else {
			for (int i = 1; i <= 6; i++) {
				// choose
				chosen.add(i);
				//result.add(chosen);
				// explore
				diceHelper(chosen, numDice - 1);
				// backtrack
				chosen.remove(chosen.size() - 1);
			}
		}
	}

}
