package trickyquestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//first non repeated character in a string
public class FirstNonRepeatingCharacterInAString {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();

		Character firstNonRepeatingCharacter = firstNonRepeatedCharacter(input);

		if (firstNonRepeatingCharacter != null)
			System.out.println("First non repeating character in this string is : " + firstNonRepeatingCharacter);
		else
			System.out.println("There is no non repeating character is this string");
		
		
		FirstNonRepeatingCharacterInAString obj = new FirstNonRepeatingCharacterInAString();
		FirstNonRepeatingCharacterInAString ob = Objects.requireNonNull(obj);
		System.out.println(ob);
	}

	public static Character firstNonRepeatedCharacter(String input) {
		Character c = null;

		Map<Character, Integer> characterAndItsCount = new HashMap<>();
		int lengthOfInput = input.length();

		Character tempChar = null;
		for (int i = 0; i < lengthOfInput; i++) {

			tempChar = input.charAt(i);

			if (characterAndItsCount.containsKey(tempChar)) {
				characterAndItsCount.put(tempChar, characterAndItsCount.get(tempChar) + 1);
			} else {
				characterAndItsCount.put(tempChar, 1);
			}
		}

		for (int i = 0; i < characterAndItsCount.size(); i++) {

			tempChar = input.charAt(i);

			if (characterAndItsCount.get(tempChar) == 1) {
				c = tempChar;
				break;
			}
		}

		return c;
	}
}
