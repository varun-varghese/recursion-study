package recursion.problems.io.karel;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Karel {
	
	/*
	 * 5  .  .  .  .  .
	 * 
	 * 4  .  .  .  .  .
	 * 
	 * 3  .  .  .  .  .
	 * 
	 * 2  .  .  X  .  .
	 * 
	 * 1  .  .  .  .  .
	 * 
	 *    1  2  3  4  5
	 * 
	 * Suppose that Karel is sitting on the intersection of 2nd Street and 3rd Avenue
	 * Write a recursive function that returns the number of paths to get back to 
	 * origin from the specified starting position. No unnecessary steps are taken. 
	 * Handle 0 edge cases.
	 */
	public int numPathsHome(int street, int avenue) {
		log.trace("| Now calculating street:{}, avenue:{}", street, avenue);
		if (street == 1 && avenue == 1) {
			return 0;
		} else if (street == 1 && avenue > 1) {
			return 1 + numPathsHome(1, avenue - 1);
		} else if (street > 1 && avenue == 1) {
			return 1 + numPathsHome(street - 1, 1);
		} else {
			return 2 + numPathsHome(street - 1, avenue - 1);
		}
	}
	
}
