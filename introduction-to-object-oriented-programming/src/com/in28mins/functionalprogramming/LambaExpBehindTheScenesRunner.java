package com.in28mins.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class filterPredicate implements Predicate<Integer> {
	// this is the unimplemented functional interface method in prediacate that get
	// replaced with code in lambda expression
	// since its a filter() the return type of the unimplemented functional
	// interface method is boolean cuz filter will get a stream of elements and it
	// check wheather each element satisfies some condition.
	@Override
	public boolean test(Integer t) {
		return t % 2 == 0;
	}

}

class forEachConsumer implements Consumer<Integer> {
	// Here in ForEach it accepts a param called Consumer and its a functional
	// interface which has a unimplmeted method called accpet. the logic we give as
	// lamba exp will become the new implementation of this accpet() method and
	// executes the code. but now we differed from lambda exp and gave imple here
	// manually
	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}

}

class mapFunction implements Function<Integer, Integer> {
	// this is the unimplemented functional interface method in Function that get
	// replaced with code in lambda expression
	// since its map() the return type of the unimplemented functional
	// interface method is passed through the function call.
	@Override
	public Integer apply(Integer t) {
		return t * t;
	}

}

public class LambaExpBehindTheScenesRunner {

	public static void main(String[] args) {
		List.of(22, 35, 67, 88).stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));
		System.out.println();
		// filter()'s defenition would accept a interface type - Predicate as paramater
		// and this predicate will have one unimplemented method(predicate is a
		// functional interface. the code or funciton
		// we pass through lambda exression becomes the new implmentation of that
		// umimplemented method in Predicate interface and executes the code. This is
		// how lambda exp works... there is similar things for all methods like map()
		// forEach() etc.

		// doing the lambda expression operations manually

		// doing filter manually w/o lambda expression, instead we pass the obj of our
		// user defined class that implments Predicate
		List.of(22, 35, 67, 88).stream().filter(new filterPredicate()).forEach(n -> System.out.println(n));
		System.out.println();

		// doing forEach() manually
		// here we are differing from using lamba exp and passing the object of user
		// defined class that implements Consumer funcional interface
		List.of(22, 35, 67, 88).stream().filter(new filterPredicate()).forEach(new forEachConsumer());
		System.out.println();

		// doing map() manually
		// here we are differing from using lamba exp and passing the object of user
		// defined class that implements Function funcional interface
		List.of(22, 35, 67, 88).stream().filter(new filterPredicate()).map(new mapFunction())
				.forEach(new forEachConsumer());

		// Behind the scenes working of filter(), map() and forEach()

		// Stream<T> filter(Predicate<? super T> predicate);
		// public interface Predicate<T>
		// boolean test(T t);

		// void forEach(Consumer<? super T> action);
		// public interface Consumer<T>
		// void accept(T t);

		// <R> Stream<R> map(Function<? super T, ? extends R> mapper);
		// public interface Function<T, R>
		// R apply(T t);

		// These are the 3 main Fuctional interfaces.
		// Predicate take in data and returns a decision true or false
		// Function takes in data and does some operations on that data and returns them
		// Consumer takes in data and consumes them and return nothing.

	}

}
