package com.in28mins.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

	public static void main(String[] args) throws IOException {

		// will auto create file if its not there
		Path fileToWrite = Paths.get("./resources/file-write.txt");
		List<String> list = List.of("Super Strength", "Flight", "Super Speed", "Bullet Proof");
		Files.write(fileToWrite, list);
	}

}
