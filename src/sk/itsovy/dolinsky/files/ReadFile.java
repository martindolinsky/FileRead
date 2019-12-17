package sk.itsovy.dolinsky.files;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

/**
 * @author Martin Dolinsky
 */
public class ReadFile {

	public void printFile(String sourceFile) {
		try {
			File myFile = new File(sourceFile);
			Scanner myReader = new Scanner(myFile);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void printFileInfo() {
		File myFile = new File("src/joke");
		if (myFile.exists()) {
			System.out.println("File name: " + myFile.getName());
			System.out.println("Absolute path: " + myFile.getAbsolutePath());
			System.out.println("Size: " + myFile.length());
			System.out.println("Readable: " + myFile.canRead());
			System.out.println("Writable: " + myFile.canWrite());
			System.out.println("Date: " + myFile.lastModified());
		}
		else {
			System.out.println("File not found!");
		}
	}

	public void writeTo() throws IOException {
		try {
			File newFile = new File("noJoke");
			FileWriter write = new FileWriter(newFile);
			write.write("dristas");
			write.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void copyFile(String sourceFile) {
		try {
			File myFile = new File(sourceFile);
			File otherFile = new File("vstup_copy");
			FileWriter write = new FileWriter(otherFile);
			Scanner myReader = new Scanner(myFile);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				data = data.toUpperCase();
				write.write(data + "\n");
			}
			myReader.close();
			write.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int diktat(String source, String target) {
		int count = 0;
		try {
			File myFile = new File(source);
			File otherFile = new File(target);
			FileWriter write = new FileWriter(target);
			Scanner myReader = new Scanner(myFile);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				for (int i = 0; i < data.length();i++) {
					if (data.charAt(i) == 'y' || data.charAt(i) == 'i' || data.charAt(i) == 'í' || data.charAt(i) == 'ý') {
						count++;
					}
				}
				data = data.replaceAll("y","_");
				data = data.replaceAll("i","_");
				data = data.replaceAll("í","_");
				data = data.replaceAll("ý","_");
				write.write(data + "\n");
			}
			myReader.close();
			write.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return count;
	}

	public void readNumbers(String source, String target) {
		try {
			File myFile = new File(source);
			Scanner myReader = new Scanner(myFile);
			File otherFile = new File(target);
			FileWriter write = new FileWriter(target);
			FileReader fr = new FileReader(source);
			BufferedReader read = new BufferedReader(fr);
			int sum = 0;
			int count = 0;
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				for (int i = 0; i < data.length(); i++) {
					int number = Integer.parseInt(data);
					count++;
					write.write(String.valueOf(number + "\n"));
					System.out.println(number);
				}
				for (int i = 0; i < data.length(); i++) {
					int number = Integer.parseInt(data);
					sum += number;
				}
			}
			System.out.println("Sum:" + sum);
			write.write(String.valueOf(sum / (double) count));
			System.out.println(sum / (double) count);
			myReader.close();
			write.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void sortNumbers(String source, String target) {
		try {
			File myFile = new File(source);
			Scanner myReader = new Scanner(myFile);
			File otherFile = new File(target);
			FileWriter write = new FileWriter(target);
			FileReader fr = new FileReader(source);
			BufferedReader read = new BufferedReader(fr);
			BufferedWriter buffWrite = new BufferedWriter(write);
			int sum = 0;
			int count = 0;
			System.out.println();
			List<Integer> intList = new ArrayList<>();
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				for (int i = 0; i < data.length(); i++) {
					int number = Integer.parseInt(data);
					count++;
				}
				for (int i = 0; i < data.length(); i++) {
					int number = Integer.parseInt(data);
					intList.add(number);
				}
			}
			intList.sort(Comparator.naturalOrder());
			for(int counter: intList){
				System.out.println(counter);
				buffWrite.write(String.valueOf(counter + " "));
			}
			myReader.close();
			buffWrite.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readNumbersSeparated(String source, String target) {
		try {
			File myFile = new File(source);
			Scanner myReader = new Scanner(myFile);
			File otherFile = new File(target);
			FileWriter write = new FileWriter(target);
			FileReader fr = new FileReader(source);
			BufferedReader read = new BufferedReader(fr);
			String data;
			/**
			 * read numbers using BufferedReader
			 */
			while ((data = read.readLine()) != null) {
				String[] arrOfStr = data.split(",");
				for (int j = 0; j < arrOfStr.length; j++) {
					System.out.print(arrOfStr[j]);
					write.write(arrOfStr[j]);
					if (j < arrOfStr.length-1) {
						System.out.print(",");
						write.write(",");
					}
				}
			}

			/**
			 * read numbers using scanner
			 */
//			while (myReader.hasNextLine()) {
//				String data = myReader.nextLine();
//				String[] arrOfStr = data.split(",", 10);
//				for (int j = 0; j < arrOfStr.length; j++) {
//					System.out.print(arrOfStr[j] + ",");
//					write.write(arrOfStr[j] + ",");
//				}
//			}
			myReader.close();
			write.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
