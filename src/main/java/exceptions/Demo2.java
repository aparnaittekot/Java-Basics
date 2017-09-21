package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo2 {
	public static void main (String args[]) {
		try {
			readFile();
		} catch (CustomException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
		
	private static void readFile () throws FileNotFoundException, CustomException {
		try {
			Library.readFile_2("C:/test/abc1.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception");
			throw new CustomException(e);
		} catch (IOException e) {
			throw new CustomException("Custom Exception occured");
		} finally {
			System.out.println("finally called");
		}
		System.out.println("outside");
	}
	
	
}
