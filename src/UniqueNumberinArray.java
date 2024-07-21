import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> in = Arrays.asList(3, 2, 9, 1, 1, 3, 2, 8);
		in.stream().distinct().sorted().forEach(s -> System.out.println(s));
		System.out.println("***************");
		List<Integer> en=Arrays.asList(7,9,5,1,5,6,5,7);
		List<Integer> i=en.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println(i.get(3));

	}

}
