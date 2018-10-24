package recursion.problems.io.drill;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class DrillHelper {
	
	public double getDistanceBetween(DrillSite first, DrillSite second) {
		return Math.sqrt(square(first.getX() - second.getX()) + 
				square(first.getY() - second.getY()));
	}
	
	public double getTotalDistance(List<DrillSite> drillSites) {
		double distance = 0d;
		for (int i = 0; i < drillSites.size() - 1; i++) {
			distance += getDistanceBetween(drillSites.get(i), drillSites.get(i + 1));
		}
		distance += getDistanceBetween(drillSites.get(drillSites.size() - 1), drillSites.get(0));
		return distance;
	}
	
	public double square(double value) {
		return value * value;
	}
	
	public DrillSite buildDrillSite(String name, int x, int y) {
		DrillSite result = new DrillSite();
		result.setName(name);
		result.setX(x);
		result.setY(y);
		
		return result;
	}
	
	public String printRoute(List<DrillSite> route) {
		return route.stream().map(DrillSite::getName).collect(Collectors.joining(" -> "));
	}

}
