package otherexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpressions {
	public static void main(String[] args) {

		List<String> strings = new ArrayList<String>(Arrays.asList("first", "second", "third"));
		strings.stream().count(); // count the number of items

		List<String> result = strings.stream().filter(e -> e.equals("first")).collect(Collectors.toList()); // item
																											// with
																											// value
																											// "first"
																											// will
																											// be
		result.stream().forEach(e -> System.out.println(e));
	}
}