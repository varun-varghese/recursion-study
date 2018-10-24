package recursion.problems.io.drill;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DrillRouter {
	
	@Autowired
	private DrillHelper drillHelper;
	
	private Map<Double, List<DrillSite>> allRoutes;

	public List<DrillSite> bestDrillRouteFor(final List<DrillSite> sites) {
		allRoutes = new HashMap<Double, List<DrillSite>>();
		
		List<DrillSite> sitesChosen = new LinkedList<DrillSite>();
		routeHelper(sites, sitesChosen);
		
		double min = allRoutes.keySet().stream().mapToDouble(v -> v).min().orElseThrow(NoSuchElementException::new);
		return allRoutes.get(min);
	}
	
	private void routeHelper(List<DrillSite> sitesRemaining, List<DrillSite> sitesChosen) {
		if (sitesRemaining.isEmpty()) {
			List<DrillSite> chosen = sitesChosen.stream().collect(Collectors.toList());
			allRoutes.put(drillHelper.getTotalDistance(chosen), chosen);
		} else {
			for (int i = 0; i < sitesRemaining.size(); i++) {
				// choose
				sitesChosen.add(sitesRemaining.get(i));
				
				// explore
				List<DrillSite> newSites = sitesRemaining.stream().collect(Collectors.toList());
				newSites.remove(i);
				routeHelper(newSites, sitesChosen);
				
				// backtrack
				sitesChosen.remove(sitesChosen.size() - 1);
			}
		}
	}
}
