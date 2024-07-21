import java.util.ArrayList;

public class Streamex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> name= new ArrayList<String>();
		   name.add("Azmat");
		   name.add("Java");
		   name.add("Selenium");
		   name.add("Automation");
		   name.add("New Delhi");
		   name.add("Ali");
		   name.stream().filter(s->s.length()>=5).forEach(s->System.out.println(s));
		   System.out.println("********************");
		   name.stream().filter(s->s.length()>5).limit(1).forEach(s->System.out.println(s));
		   System.out.println("********************");
		   name.stream().filter(s->s.endsWith("i")).sorted().forEach(s->System.out.println(s));
		   System.out.println("********************");
		   name.stream().filter(s->s.endsWith("i")).sorted().forEach(s->System.out.println(s));
		   System.out.println("********************");
		   name.stream().filter(s->s.length()>=5).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));

	}

}
