package test.string.common;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDistinctUsingCollections {
	public static void main(String[] args) {
		 List<String> nameList = new ArrayList<String>();
		 nameList.add("Sharmila");
		 nameList.add("Dinesh");
		 nameList.add("Mahesh");
		 nameList.add("Sharmila");
		 nameList.add("Anitha");
		 nameList.add("Anitha");
		 System.out.println("----before remove distinct------");
		 nameList.forEach(System.out::println);

		 System.out.println("----after remove distinct------");
		 nameList = nameList.stream().distinct().collect(Collectors.toList());
		 nameList.forEach(System.out::println);
	}
}
