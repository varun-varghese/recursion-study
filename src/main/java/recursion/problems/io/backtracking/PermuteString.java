package recursion.problems.io.backtracking;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class PermuteString {

	public void permute(String input) {
		permuteHelper(input, "");
	}

	private void permuteHelper(String input, String chosen) {
		log.debug("|in:{} |ch:{}", input, chosen);
		if (input.isEmpty()) {
			log.info(chosen);
		} else {
			for (int i = 0; i < input.length(); i++) {
				//choose
				String chosenLetter = input.substring(i, i + 1); //choose i
				String newChosen = chosen + chosenLetter;
				String newInput = input.substring(0, i) + input.substring(i + 1, input.length()); //remove i
				
				//explore
				permuteHelper(newInput, newChosen);
				
				//backtrack (noting to do since original strings remains the same)
			}
		}
		
	}
}
