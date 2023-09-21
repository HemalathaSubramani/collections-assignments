package treesset;

public class FoodReviewByUsingMap implements Comparable<FoodReviewByUsingMap> {
	private String userName;
	private int points;
	private String comments;
	public FoodReviewByUsingMap(String userName, int points, String comments) {
		super();
		this.userName = userName;
		this.points = points;
		this.comments = comments;
	}
	
	@Override
	public String toString() {
		return "UserName: "+this.userName+" ReviewPoint:"+this.points+"FoodComments:"+this.comments;
	}

	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getPoints() {
		return points;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}
	
	public String getComments() {
		return comments;
	}
	
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public int compareTo(FoodReviewByUsingMap fmup) {
		return this.points-fmup.points;
	
	}
	
	

}
