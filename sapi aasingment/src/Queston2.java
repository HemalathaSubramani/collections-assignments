import java.util.stream.Stream;

public class Queston2 {
	public static void main(String[] args) {
		System.out.println("----forEachMethod----");
		Stream.of("ab","bc","cd","da","fg").forEach((x)->{
			String str = x+"a";
			System.out.println(str);
		});



	}
}




