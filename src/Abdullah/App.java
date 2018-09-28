package Abdullah;

import java.util.Map;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Type storage = new Storage();
		CreateDirectory createDirectory = new CreateDirectory();
		Type changeDirectory = new ChangeDirectory();
		
		/*****

		createDirectory.addDirectory("Media");// add new directory
		createDirectory.addDirectory("Songs");// add new directory
		createDirectory.addDirectory("Selena Gomez");// add new directory
		createDirectory.addDirectory("Stars Dance");// add new directory

		System.out.println(storage.getPath());
		// System.out.println(changeDirectory.getPath());

		new NewFile().addFile("back to you.................... by Selena Gomez");

		createDirectory.addDirectory("Tylor Swift"); // new directory added

		new NewFile().addFile("i don't wanna live forever..... by Taylor Swift");

		for (Map.Entry<String, String> entry : createDirectory.filePath.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}


****/
		Scanner scan = new Scanner(System.in);
		String i;
		
		

		while (scan.hasNext()) {
			i = scan.nextLine().trim();

			if (i.equals("pwd")) { // ex: pwd

				System.out.println(storage.getPath());
			} else if (i.equals("ls")) {

				for (Map.Entry<String, String> entry : createDirectory.filePath.entrySet()) {
					String key = entry.getKey();
					String value = entry.getValue();
					System.out.println(key + " : " + value);
				}
			}
			
			else if(i.contains("mkdir ")) {
				
				String[] temp = i.split(" ");
				if(temp.length == 2) {
					
					String directoryName = temp[1];	
				
				createDirectory.addDirectory(directoryName);
				}
			}
			
			else if(i.contains("vim ")) {
				String[] temp = i.split(" ");
				if(temp.length == 2) {
					
					String fileName = temp[1];
					new NewFile().addFile(fileName);
				}	
			}
		}
	}
}
