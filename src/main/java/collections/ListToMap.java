package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
               
public class ListToMap {

	public static void main(String[] args) {
            
		List<MapModel> list = new ArrayList<>();
		list.add(new MapModel(1, "aaa"));
		list.add(new MapModel(2, "bbb"));
		list.add(new MapModel(3, "ccc"));

		Map<Integer, String> result1 = list.stream().collect(Collectors.toMap(MapModel::getId, MapModel::getName));
		System.out.print(result1); // {1=aaa, 2=bbb, 3=ccc}
	}
}