import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class ScannerReadFromFile{

	public static void main(String[] args) {
		File file = new File("FileReadingInputText.txt");
		int count = 0;

		// Scanner scan = new Scanner(System.in); 
		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNextLine()){
				System.out.println(++count + " " +sc.nextLine());
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}