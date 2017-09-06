package prob1.Assignment1Final.data;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.*;

public class MatchExpression {

	public static void searchIn(File f, String S) throws Exception {

		File[] child = f.listFiles();
		if (child.length == 0) {
		} else {
			for (File p : child) {
				if (p.isDirectory()) {
					searchIn(p, S);
				} else {
					if (Pattern.matches(S, p.getName().toString())) {
						System.out.println("Matched file path with the regex is: " + p.getAbsolutePath().toString());
					}
				}
			}
		}
	}

	public static void main(String args[]) throws Exception {

		String regex = "^[A-Z].*";
		System.out.println("Enter the path to folder to search for files");
		Scanner s1 = new Scanner(System.in);
		String folderPath = s1.next();
		s1.close();
		// creating new file instance by the converting given path name to absolute path name.
		File dir = new File(folderPath);

		File[] children = dir.listFiles(); //Making listfile of that directories.
		if (children.length == 0) {
			System.out.println("does not exist or is not a directory");
		} else {
			for (File s : children) {
				if (s.isDirectory()) {
					searchIn(s, regex); // SearchIn method - for accessing file inside folder/directories
				} else {
					if (Pattern.matches(regex, s.getName().toString())) {
						System.out.println("Matched file path with the regex is: " + s.getCanonicalPath());
					}
				}

			}
		}
	}
}

/* Here I set Regular pattern "^[A-Z].*". This program will take path of the directory where we want to search 
 * to search for a file who match with REGEX. After that create a file instance of that name. then create
 * a filelist. Now check whether list is empty. if yes, then its just print a statement. else iterate 
 * over for loop. now each file of filelist going through two way- whether its directory or not. if yes 
 * then call method to repeat the same for this directories & if not then check that file name matching
 * with REGEX or not. in that case print the matched path with file name.
 */