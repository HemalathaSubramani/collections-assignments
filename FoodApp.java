package treesset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class FoodApp {
	public static void main(String[] args) {
		Map<Food,List<FoodReviewByUsingMap>> map = new HashMap<>();
         List<FoodReviewByUsingMap> revList1 = new ArrayList<>();
         FoodReviewByUsingMap r1A = new FoodReviewByUsingMap("A", 3, "Satisfied");
         FoodReviewByUsingMap r1B = new FoodReviewByUsingMap("B", 4, "Satisfied");
         FoodReviewByUsingMap r1C = new FoodReviewByUsingMap("C", 2, "Not Good ");
         
         revList1.add(r1A);
         revList1.add(r1B);
         revList1.add(r1C);
         
         List<FoodReviewByUsingMap> revList2 = new ArrayList<>();
         List<FoodReviewByUsingMap> revList3 = new ArrayList<>();
         List<FoodReviewByUsingMap> revList4 = new ArrayList<>(); 
         List<FoodReviewByUsingMap> revList5 = new ArrayList<>();
         
         FoodReviewByUsingMap r2 = new FoodReviewByUsingMap("xyz", 4, "Very Good");
         FoodReviewByUsingMap r3 = new FoodReviewByUsingMap("fgh", 2, "Not Good ");
         FoodReviewByUsingMap r4 = new FoodReviewByUsingMap("kjj", 4, "Very Good");
         FoodReviewByUsingMap r5 = new FoodReviewByUsingMap("osj", 5, "Excellent");
         
         revList2.add(r2);
         revList3.add(r3);
         revList4.add(r4);
         revList5.add(r5);

 		
		
		
		
		
		
		
		TreeSet<Food> allFoods = new TreeSet<>();
		Food f1 = new Food("dosa",55,"veg");
		Food f2 = new Food("eggroll",70,"nonveg");
		Food f3 = new Food("chicken",120,"nonveg");
		Food f4 = new Food("idly",60,"veg");
		Food f5 = new Food("mutton",100,"nonveg");
		
		allFoods.add(f1);
		allFoods.add(f2);
		allFoods.add(f3);
		allFoods.add(f4);
		allFoods.add(f5);
		
		map.put(f1, revList1);
		map.put(f2, revList2);
        map.put(f3, revList3);
        map.put(f4, revList4);
        map.put(f5, revList5);
        
        for(Map.Entry<Food,List<FoodReviewByUsingMap>> entry : map.entrySet())

		{
            Food key = entry.getKey();
            List<FoodReviewByUsingMap> value = entry.getValue();
            System.out.println("---- "+key.getFoodName()+"-------");
            System.out.println("Price rs. "+key.getCost());
            System.out.println("Category "+key.getCategory());
            System.out.println(" --- Reviews ---");

			 for (FoodReviewByUsingMap review : value) {
                 for(int i=0;i<review.getPoints();i++)

				{

					System.out.print("*");

				}

				

				 System.out.print(review.getComments()+"\n");

			}

			 System.out.println("\n\n");

		}

		
		
		System.out.println("----All Foods---");
		for (Food food : allFoods) {
			System.out.println(food);
			System.out.println();
		}
		System.out.println("------Sorting by food Name----");
		getFoodBasedOnFoodName(allFoods);
}
public static void getFoodBasedOnFoodName(TreeSet<Food> allFoods) {
			
		
		// Step1 -> convert set to List
					List<Food> tempList = new ArrayList<>();// or pass as constructor argument
					tempList.addAll(allFoods);
					
					// Step 2-> create Comparator class Object
					SortFoodBasedOnFoodName sortfname = new SortFoodBasedOnFoodName();
					
					Collections.sort(tempList, sortfname);
					
					for (Food food1 : tempList) {
						System.out.println(food1);
					}
		
}
}
