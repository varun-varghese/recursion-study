package recursion.problems.io.backtracking;

import static org.junit.Assert.*;

import java.util.List;
import java.util.stream.Collectors;

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
	public void testDiceSum() {
		log.info("Not yet implemented");
		
		diceSum.diceSum(2, 7).stream()
			.map(e -> sumAll(e))
			.forEach(e -> assertSame(7, e));
	}
	
	private int sumAll(List<Integer> chosen) {
		return chosen.stream().collect(Collectors.summingInt(Integer::intValue));
	}

}
