package com.in28mins.functionalprogramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FuncProgTerminalOpsExerceise {

	public static void main(String[] args) {
		// range()
		System.out.println(IntStream.rangeClosed(1, 10).reduce(0, (n1, n2) -> n1 + n2));
		
		// max()
		// here to find max we have to pass a comparator objct or a lambda func defining
		// the comoarision logic
		System.out.println(List.of(21, 12, 67, 14).stream().max((n1, n2) -> Integer.compare(n1, n2)));
		// It will return "Optional[67]"
		// Optional is feature in java that is used when we don't know whether there
		// will be a result or not
		// Generally, it will return the maximum element if list is populated and if
		// list is empty it will return null
		// But using null is bad programming practice. So there comes the Optional Class

		// min()
		System.out.println(List.of(21, 12, 67, 14).stream().min((n1, n2) -> Integer.compare(n1, n2)));
		System.out.println();

		// collect()
		// we have used this earlier to filter out all the odd elements from the list
		// but, what if we want it as a seperate collection? use collect()
		List.of(21, 12, 67, 14, 42, 67).stream().filter(e -> e % 2 == 1).forEach(e -> System.out.println(e));
		// using collect()
		List<Integer> oddList = List.of(21, 12, 67, 14, 42, 67).stream().filter(e -> e % 2 == 1)
				.collect(Collectors.toList());
		System.out.println(oddList);

		List<Integer> evenList = List.of(21, 12, 67, 14, 42, 67).stream().filter(e -> e % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(evenList);

		// using map() returns of type IntPipeline but we want IntStream so we use
		// boxed() to convert IntPipeline to IntStream and collect() it.
		List<Integer> squareList = IntStream.rangeClosed(1, 10).map(e -> e * e).boxed().collect(Collectors.toList());
		System.out.println(squareList);
	}

}
