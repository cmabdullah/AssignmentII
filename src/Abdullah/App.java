package Abdullah;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String i;
		
		Type storage = new Storage();
		CreateDirectory createDirectory = new CreateDirectory();
		Type changeDirectory = new ChangeDirectory();
		createDirectory.addDirectory("Media");
		createDirectory.addDirectory("Songs");
		System.out.println(storage.getPath());
		System.out.println(changeDirectory.getPath());
		

//		while (scan.hasNext()) {
//			i = scan.nextLine().trim();
//			System.out.println(i + " ");
//
//		}
	}


}
