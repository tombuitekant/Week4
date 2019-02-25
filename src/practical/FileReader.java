package practical;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
	public static void main(String[] args) {
	Scanner Reader;
	try {
		Reader = new Scanner(new File("Sherlock.txt"));
		String content = Reader.useDelimiter("\\Z").next();
		Reader.close();
		System.out.println(content);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
}