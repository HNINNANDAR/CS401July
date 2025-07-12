package lesson13.Labs;

import java.util.*;

public class GroupUtil {
	//Fix this code
	public static Group<?> copy(Group<?> group) {
		return copyHelper(group);
//		List<?> elements = group.getElements();
//		Group<?> grp = new Group<?>(group.getSpecialElement(), elements);
//		return grp;
	}

	private static <T> Group copyHelper(Group<T> group) {
		List<T> elements = group.getElements();
		Group<T> grp = new Group<T>(group.getSpecialElement(), elements);
		return grp;
	}

	//Test using this main method
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,1,2,3,4);
		Group<Integer> group = new Group<>(0, list);
		System.out.println(group);
		System.out.println(GroupUtil.copy(group));
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		List<? extends Number> nums = ints;
		double dbl = sum(nums);
//		nums.add(3.14);

	}
	public static double sum(Collection<? extends Number> nums) {
		double s = 0.0;
		for (Number num : nums) s += num.doubleValue();
		return s;
	}

}
