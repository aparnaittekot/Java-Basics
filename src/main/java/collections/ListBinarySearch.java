package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListBinarySearch {
	public static void main(String[] args) {
		List<String> sample = new ArrayList<>();
		sample.add("XYZ");
		sample.add("ABC");
		sample.add("YHD");
		
		Collections.sort(sample);
		
		int index = Collections.binarySearch(sample, "ZZZ");
        System.out.println(index);
	}
}
