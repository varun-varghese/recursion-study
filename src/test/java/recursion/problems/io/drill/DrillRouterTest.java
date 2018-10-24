package recursion.problems.io.drill;

import static org.junit.Assert.*;

import java.util.LinkedList;
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
public class DrillRouterTest {
	
	@Autowired
	private DrillRouter drillRouter;
	
	@Autowired
	private DrillHelper drillHelper;

	@Test
	public void testdrillHelperDistance() {
		List<DrillSite> sites = new LinkedList<DrillSite>();
		
		sites.add(drillHelper.buildDrillSite("A", 0, 0));
		sites.add(drillHelper.buildDrillSite("B", 6, 0));
		sites.add(drillHelper.buildDrillSite("C", 3, 3));
		sites.add(drillHelper.buildDrillSite("D", 0, 6));
		sites.add(drillHelper.buildDrillSite("E", 6, 6));
		
		assertEquals(29d, drillHelper.getTotalDistance(sites), 0.1d);
		
		List<DrillSite> routes = drillRouter.bestDrillRouteFor(sites);
		assertNotNull(routes);
		log.info("| Distance: {}", drillHelper.getTotalDistance(routes));
		log.info("| Route: {}", drillHelper.printRoute(routes));
		
	}
	
	@Test
	public void testDistance() {
		assertEquals(6.0d, drillHelper.getDistanceBetween(drillHelper.buildDrillSite("A", 0, 0), 
				drillHelper.buildDrillSite("B", 6, 0)), 0.1d);
		assertEquals(4.24d, drillHelper.getDistanceBetween(drillHelper.buildDrillSite("B", 6, 0), 
				drillHelper.buildDrillSite("C", 3, 3)), 0.1d);
		assertEquals(4.24d, drillHelper.getDistanceBetween(drillHelper.buildDrillSite("C", 3, 3), 
				drillHelper.buildDrillSite("D", 0, 6)), 0.1d);
		assertEquals(6d, drillHelper.getDistanceBetween(drillHelper.buildDrillSite("D", 0, 6), 
				drillHelper.buildDrillSite("E", 6, 6)), 0.1d);
		assertEquals(8.49d, drillHelper.getDistanceBetween(drillHelper.buildDrillSite("A", 0, 0), 
				drillHelper.buildDrillSite("E", 6, 6)), 0.1d);
	}

}
