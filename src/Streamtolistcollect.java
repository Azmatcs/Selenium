import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamtolistcollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String> l=Stream.of("Azmat","Ali","Araria","New Delhi").filter(s->s.startsWith("A")).map(s->s.toUpperCase()).collect(Collectors.toList());
      System.out.println(l);
      
      System.out.println(l.get(2));
	}

}
