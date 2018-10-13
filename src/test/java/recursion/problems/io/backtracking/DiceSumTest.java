package recursion.problems.io.backtracking;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class DiceSumTest {
	
	@Autowired
	private DiceSum diceSum;

	@Test
	public void test() {
		log.info("Not yet implemented");
		
		diceSum.diceSum(2, 7).forEach(e -> log.info("| Found sum: {}", e));
	}

}
