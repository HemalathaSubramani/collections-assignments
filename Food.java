package treesset;



public class Food implements Comparable<Food>{
	private String foodName;
	private int cost;
	private String category;
	public Food(String foodName, int cost, String category) {
		super();
		this.foodName = foodName;
		this.cost = cost;
		this.category = category;
	}
	/**
	 * @return the foodName
	 */
	public String getFoodName() {
		return foodName;
	}
	/**
	 * @param foodName the foodName to set
	 */
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "FoodName: "+this.foodName+" FoodCost:"+this.cost+"FoodCategory:"+this.category;
	}
	@Override
	public int compareTo(Food food) {
		return this.cost-food.cost;
	
	}
	

}
