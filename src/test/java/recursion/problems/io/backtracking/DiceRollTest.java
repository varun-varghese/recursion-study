package recursion.problems.io.backtracking;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class DiceRollTest {
	
	@Autowired
	private DiceRoll diceRoll;

	@Test
	public void testDiceRoll() {
		log.info("| Dice Roll Test");
		List<List<Integer>> res2 = diceRoll.getDiceRollSequence(2);
		log.info("| Res of 2: {}", res2);
		assertEquals(36, res2.size());
		
		List<List<Integer>> res3 = diceRoll.getDiceRollSequence(3);
		log.info("| Res of 3: {}", res3);
		assertEquals(216, res3.size());
	}

}
