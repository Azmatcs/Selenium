import java.util.ArrayList;

public class Streamex1 {

	

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				ArrayList<String> name=new ArrayList<String>();
		  
				name.add("Azmat");
				name.add("Ali");
				name.add("New Delhi");
				name.add("Java");
				name.add("Selenium");
				int count=0;
				for(int i=0;i<name.size();i++) {
					String act=name.get(i);
					
				if(act.startsWith("A")) {
					count++;
				}}
					System.out.println(count);
				int d=0;
				for(int j=0;j<name.size();j++)
				{
					
					if(name.get(j).startsWith("S"))
					{
						d++;
					}
					
				}
				
				System.out.println(d);
			
			




	}

}
