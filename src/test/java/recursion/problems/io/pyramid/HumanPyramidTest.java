package recursion.problems.io.pyramid;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;
import recursion.problems.io.backtracking.SublistTest;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class HumanPyramidTest {
	
	@Autowired
	private HumanPyramid humanPyramid;

	@Test
	public void test() {
		log.info(" Human Pyramid Test");
		
		assertEquals(0.0d, humanPyramid.weightOnBackOf(0, 0), 0.0d);
		assertEquals(100.0d, humanPyramid.weightOnBackOf(1, 0), 0.0d);
		assertEquals(100.0d, humanPyramid.weightOnBackOf(1, 1), 0.0d);
		assertEquals(150.0d, humanPyramid.weightOnBackOf(2, 0), 0.0d);
		assertEquals(300.0d, humanPyramid.weightOnBackOf(2, 1), 0.0d);
		assertEquals(150.0d, humanPyramid.weightOnBackOf(2, 2), 0.0d);
		assertEquals(175.0d, humanPyramid.weightOnBackOf(3, 0), 0.0d);
		assertEquals(425.0d, humanPyramid.weightOnBackOf(3, 1), 0.0d);
		assertEquals(425.0d, humanPyramid.weightOnBackOf(3, 2), 0.0d);
		assertEquals(175.0d, humanPyramid.weightOnBackOf(3, 3), 0.0d);
		assertEquals(187.5d, humanPyramid.weightOnBackOf(4, 0), 0.0d);
		assertEquals(500.0d, humanPyramid.weightOnBackOf(4, 1), 0.0d);
		assertEquals(625.0d, humanPyramid.weightOnBackOf(4, 2), 0.0d);
		assertEquals(500.0d, humanPyramid.weightOnBackOf(4, 3), 0.0d);
		assertEquals(187.5d, humanPyramid.weightOnBackOf(4, 4), 0.0d);
		
		log.info("40,20: {}", humanPyramid.weightOnBackOf(40, 20));
		log.info("200,100: {}", humanPyramid.weightOnBackOf(200, 100));
	}

}
