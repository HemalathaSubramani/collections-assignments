package treesset;

import java.util.Comparator;



public class SortFoodBasedOnFoodName implements Comparator<Food>{
	@Override
	public int compare(Food o1, Food o2) {
		return o1.getFoodName().compareTo(o2.getFoodName());
	}	

}
