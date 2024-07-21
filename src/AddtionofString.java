import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AddtionofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> n=Arrays.asList("Azmat","Ali","New Delhi","Araria");
		List<String> n1=Arrays.asList("Azmat","Bengaluru","Patna");
		
		Stream<String> newstream=Stream.concat(n.stream(),n1.stream());
	
		newstream.sorted().forEach(s->System.out.println(s));
		System.out.println("***********");
		
		List<String> b=Arrays.asList("Mohammad","Ali","Azmat","New Delhi");
		List<String> b1=Arrays.asList("Mohammad","Araria","Purnia");
		Stream<String> need= Stream.concat(b.stream(), b1.stream());
		need.distinct().sorted().forEach(s->System.out.println(s));


	}

}