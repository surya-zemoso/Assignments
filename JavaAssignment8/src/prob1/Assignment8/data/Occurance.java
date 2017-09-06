package prob1.Assignment8.data;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) throws Exception {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name:");
		String fileName = sc.next();
		// fileName = "/home/zemoso/Desktop/" + fileName;
		// System.out.println("file name:" + fileName);

		// try {
		FileReader fr = new FileReader(fileName);

		int i;
		while ((i = fr.read()) != -1) {
			System.out.print((char) i);
			if (map.containsKey((char) i)) {

				int value = map.get((char) i);
				value++;
				map.put((char) i, value);
			} else
				map.put((char) i, 1);
		}
		System.out.println("Map values: " + map);

		FileWriter wr = new FileWriter("/home/zemoso/Desktop/Writer.txt");
		BufferedWriter buffWr = new BufferedWriter(wr);
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			buffWr.write("Character Key " + entry.getKey() + ", " + "Value "
					+ entry.getValue() + "\n");

		}
		buffWr.close();

	}

}
