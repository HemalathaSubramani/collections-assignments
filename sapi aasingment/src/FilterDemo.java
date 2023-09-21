
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class FilterDemo {

	public static void main(String[] args) {

		 List<String> inputList= new ArrayList<>();

		 inputList.add("amfd");
         inputList.add("hhgfh");
         inputList.add("agrh");
         inputList.add("hfgr");

		 Stream<String>stringStream=inputList.stream();

		 List<String> outputList = stringStream.filter((x)->{

				if(x.startsWith("a")) return true;

				else return false;

			}).collect(Collectors.toList());

			System.out.println(outputList);
}
}