package otherexamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsExamples {
	public static void main(String[] args) {

		// matches()
		System.out.println("***MATCHES***");
		String text = "test-string";
		Boolean output = text.matches("^[a-z]*-[a-z]*$");

		if (output) {
			System.out.println(output);
			System.out.println("String is matching");
		} else {
			System.out.println(output);
			System.out.println("String is not matching");
		}

		// if we have to use find(), start(), end() - we need to use
		// regex.Matcher
		System.out.println("***MATCHER - find(), start(), end(), split()***");
		Pattern pattern0 = Pattern.compile("^(true|false)$", Pattern.CASE_INSENSITIVE);
		Matcher m = pattern0.matcher("tRUe");
		while (m.find()) {
			System.out.println("Pattern found from " + m.start() + " to " + (m.end() - 1));
		}

		String textForSplit = "apple,orange,grapes";
		Pattern pattern1 = Pattern.compile(",", Pattern.CASE_INSENSITIVE);
		String[] splitText = pattern1.split(textForSplit);

		for (String temp : splitText)
			System.out.println(temp);
	}
}