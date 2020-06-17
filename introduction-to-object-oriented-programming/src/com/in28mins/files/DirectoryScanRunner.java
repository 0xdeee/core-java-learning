package com.in28mins.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

/**
 * @author dstar - In Java 7 a new approach for file handling is introduced its
 *         called nio - new input output
 * 
 *         Before nio, file handling was much complicated in java because we had
 *         list of file stream classes and each operated in a different way
 *
 */
public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {

		// "." represents the root directory.. now this java file is in src folder of
		// Introduction-to-object-oriented-programming folder, and this folder has some
		// other direct child directories such as src, classpath, project, bin, etc.
		// so we can denote the parent directory of our current folder(src) using "."

		// Path.get() gets the full path of the directory we specified
		// Files.list() takes in a path of a Dir as paramater and returns a stream of
		// immediate children of that Dir.
		
//		Files.list(Paths.get(".")).forEach(System.out::println);

//		O/P - immediate children of "." path directory	
//		.\.classpath
//		.\.project
//		.\.settings
//		.\bin
//		.\resources
//		.\src
		System.out.println();
		
//		-----------------------------Recursively list all files and folder in a Dir ---------------------------------------
		
		// Files.walk() can be used to recursively list all files in all subDirs of a
		// Dir given the path

		// First param is path of Dir
		// Second param is depth of search.. if its 1 it will return only the immediate
		// children, the more increase in depth the more it goes into the hierarchy
		// tree.
//		Files.walk(Paths.get("."), 1).forEach(System.out::println);
//		System.out.println();
//		
//		Files.walk(Paths.get("."), 2).forEach(System.out::println);
//		System.out.println();
//
//		Files.walk(Paths.get("."), 3).forEach(System.out::println);
//		System.out.println();
//
//		Files.walk(Paths.get("."), 5).forEach(System.out::println);
//		System.out.println();

		// Since this walk() return a stream, we can use filters to filter out the o/p
		// for eg. to get only the java files

//		Predicate<? super Path> predicate = path -> String.valueOf(path).endsWith(".java");
//		Files.walk(Paths.get("."), 5).filter(predicate).forEach(System.out::println);
//		System.out.println();

		// this will print only java files

//		--------------------------------Files.find()------------------------------------------------------
		
		// in Files.walk() it return a whole stream if files in a given dir and depth
		// and we use filter(Predicate) to filter out based on conditions

		// But in Files.find() we have Matcher as a paramterer which is of type
		// BiPredicate<Path, BasicFileAttributes>

		// we can define filter login on path or attribute and pass it to find() to
		// filter out results.

		// to filter only java files
		BiPredicate<Path, BasicFileAttributes> javaMatcher = (path, attribute) -> String.valueOf(path)
				.endsWith(".java");

		// to filter only the directories
		BiPredicate<Path, BasicFileAttributes> attributeMatcher = (path, attribute) -> attribute.isDirectory();
		// this attribute has lot of options we can filer based on access time, last
		// modified time, creation time, size etc

		// using javaMatcher
		Files.find(Paths.get("."), 5, javaMatcher).forEach(System.out::println);
		System.out.println();
		// using atributeMatcher
		Files.find(Paths.get("."), 5, attributeMatcher).forEach(System.out::println);
	}

}
