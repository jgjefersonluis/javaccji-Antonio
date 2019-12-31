package unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp6 {

	public static void main(String[] args) {
		List<Integer>integers = Arrays.asList(1,2,3,4);
		integers.forEach(x ->
		{
			x = x + 10;
			System.out.println(x);
		});

	}

}
