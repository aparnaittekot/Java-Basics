package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Library {

	public static void readFile_2(String fileName) throws FileNotFoundException, IOException {
		File file = new File(fileName);
		char[] content = new char[100];
		
		FileReader fr = new FileReader(file);
		int length = fr.read(content);
		String value = String.copyValueOf(content);
		value = value.substring(0, length);
		System.out.println(value);
	}
}
