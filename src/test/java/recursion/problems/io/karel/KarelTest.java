package recursion.problems.io.karel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class KarelTest {
	
	@Autowired
	private Karel karel;

	@Test
	public void test() {
		log.info("| Actual for 2,1: {}", karel.numPathsHome(2, 1));
		assertEquals(1, karel.numPathsHome(2, 1));
		
		log.info("| Actual for 2,2: {}", karel.numPathsHome(2, 2));
		assertEquals(2, karel.numPathsHome(2, 2));
		
		log.info("| Actual for 3,2: {}", karel.numPathsHome(3, 2));
		assertEquals(3, karel.numPathsHome(3, 2));
		
		log.info("| Actual for 5,3: {}", karel.numPathsHome(5, 3));
		assertEquals(6, karel.numPathsHome(5, 3));
	}

}
