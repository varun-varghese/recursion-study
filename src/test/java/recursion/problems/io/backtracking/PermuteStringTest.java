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
public class PermuteStringTest {
	
	@Autowired
	private PermuteString permuteString;

	@Test
	public void testPermuteStr() {
		permuteString.permute("MARTY");
	}

}
