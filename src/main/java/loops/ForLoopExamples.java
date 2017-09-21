package loops;

import java.io.IOException;

public class ForLoopExamples {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		long startTime = System.currentTimeMillis();
		int number = 1000000000;
		
		int count = 0;
		for (int i = 0; i < number; i++) {
			count ++;
			if (i % 2 == 0) {
			} else {
			}
		}
		
		System.out.println(count);
		System.out.println("Time taken : " + (System.currentTimeMillis() - startTime) / 1000);
	}
}
