package recursion.problems.io.backtracking;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PermuteStringTest {
	
	@Autowired
	private PermuteString permuteString;

	@Test
	public void testPermuteStr() {
		permuteString.permute("MARTY");
	}

}
