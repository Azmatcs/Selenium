import java.util.ArrayList;
import java.util.stream.Stream;

public class Streamex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> name=new ArrayList<String>();
		name.add("Azmat");
		name.add("Ali");
		name.add("Java");
		name.add("Selenium");
		name.add("Automation");
		Long c=name.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
Long d=Stream.of("Ali","New Delhi","Jaipur").filter(s->s.startsWith("J")).count();



	System.out.println(d);
	
	}

}
