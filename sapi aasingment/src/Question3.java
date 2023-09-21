
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

 

public class Question3 {
public static void main(String[] args) {

	System.out.println("\n Comparator Interface \n");
	List<Integer> num = new ArrayList<>();

	num.add(5);
	num.add(1);
	num.add(3);
	num.add(2);

 

	Comparator<Integer> com = (num1, num2) -> num1.compareTo(num2);
	num.sort(com);
	System.out.println(num);
}
}