package com.in28mins.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadRunner {

	public static void main(String[] args) throws IOException {

		Path fileToRead = Paths.get("./resources/data.txt");

		// This method of reading is only prefered for small files, cuz it read all the
		// lines and store it in a List... if the file is big then reading all at once
		// will cause lag
//		List<String> lines = Files.readAllLines(fileToRead);
//		System.out.println(lines);

		// this does the same, but reads the file line by line and returns a stream of
		// lines read.
		Files.lines(fileToRead).forEach(System.out::println);
		System.out.println();

		// if we use lines() we can also use filter() & map() because it returns a
		// stream
		Files.lines(fileToRead).map(String::toLowerCase).filter(str -> str.contains("a")).forEach(System.out::println);
	}

}
