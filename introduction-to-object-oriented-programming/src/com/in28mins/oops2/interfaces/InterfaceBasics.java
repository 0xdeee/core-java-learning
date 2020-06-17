package com.in28mins.oops2.interfaces;

public class InterfaceBasics {

	interface Interface {
		// Yes, you can have variables inside interfaces... but they are Public and
		// Final
		// java automatiaclly adds Public and Final to any var defined inside interfaces
		// since they are final you can't declare a var and not define it... must give
		// value at time of creation
		int value = 5;

		default void print() {
			System.out.println("Default Message");
		}
		// we can also have medthod defenition in interface from java8 onwards
		// we can provide deafult implementation of methods in interface by prefixing
		// "default" keyword
		//
		// this feature is used to solve problem in implementing scenarios
		// like assume that this interface is being implemented by multiple interface
		// you have created all the code and suddenly req comes and you have to add a
		// new method in interface
		// and all the classes that implemented this interface will throw error cuz
		// there is a new unimplemented method
		// but you want this new method in only few of the implemented classes
		// in this case make the new method deafault and provide a default
		// implementation...
		// now all implemented class's error will go away and in the classes you want to
		// use this method
		// manually override it and give new method implementation
		// and in the classes that doesn't need this method u dont even have to imple it
		// they will implicitly take the def of default method
		// this way we don't have to provide imple of method in all imple classes just
		// the classes we need to an other
		// classes can have the default imple
	}

	class Class1 implements Interface {
		// here we don't need the method in interface so we cann leave it to have the
		// default method
		// defenitioin inside interface
	}

	class Class2 implements Interface {
		// here we need that method and have to give a new implmentation
		@Override
		public void print() {
			System.out.println("overridden");
		}
	}

	public static void main(String[] args) {
		InterfaceBasics ib = new InterfaceBasics();
		Interface class1 = ib.new Class1();
		class1.print();
		Interface class2 = ib.new Class2();
		class2.print();
	}

}
