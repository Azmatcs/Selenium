import java.util.ArrayList;

public class Arraylis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		a.add("Azmat");
		a.add("Ali");
		a.add("Selenium");
		a.add("Java");
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		System.out.println("*******************");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
			
		}
		System.out.println("*******************");
		for (String value:a)
		{System.out.println(value);}

	}

}
